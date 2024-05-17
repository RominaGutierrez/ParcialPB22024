package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;

import org.junit.Test;

public class TestCases {

	@Test
	public void queSePuedaCrearUnaInmobiliaria() {
		// Preparacion
		String nombre = "Sforza propiedades";
		String calle = "España";
		Integer numero = 910;
		String localidad = "San miguel";
		Integer telefono = 46646433;
		// Ejecucion
		Inmobiliaria inmobiliaria = new Inmobiliaria(nombre, calle, numero, localidad, telefono);
		// Validacion
		assertEquals(nombre, inmobiliaria.getNombre());
		assertEquals(calle, inmobiliaria.getCalle());
		assertEquals(numero, inmobiliaria.getNumero());
		assertEquals(localidad, inmobiliaria.getLocalidad());
		assertEquals(telefono, inmobiliaria.getTelefono());
	}

	@Test
	public void queSePuedaCrearUnaCasa() {
		// Preparacion
		Integer numeroCasa = 1;
		Double precio = 55000.0;
		String calle = "Guemes";
		Integer numero = 268;
		String localidad = "San miguel";
		Integer cantidadDormitorios = 1;
		Double m2 = 40.0;

		// Ejecucion
		Casa casa = new Casa(numeroCasa, precio, calle, numero, localidad, cantidadDormitorios, m2);
		// Validacion
		assertEquals("C" + numeroCasa, casa.getCodigo());
		assertEquals(precio, casa.getPrecio());
		assertEquals(calle, casa.getCalle());
		assertEquals(numero, casa.getNumero());
		assertEquals(localidad, casa.getLocalidad());
		assertEquals(cantidadDormitorios, casa.getCantidadDormitorios());
		assertEquals(m2, casa.getM2());
	}

	@Test
	public void queSePuedaCrearUnDepartamento() {
		// Preparacion
		Integer codigo = 1;
		Double precio = 41000.0;
		String calle = "las heras";
		Integer numero = 1030;
		String localidad = "san miguel";
		Integer cantidadAmbientes = 1;
		Integer numeroPiso = 3;
		String numeroPuerta = "B";
		Double expensas = 12000.0;
		Double m2 = 24.0;

		// Ejecucion
		Departamento depto = new Departamento(codigo, precio, calle, numero, localidad, cantidadAmbientes, numeroPiso,
				numeroPuerta, expensas, m2);
		// Validacion
		assertEquals("D" + codigo, depto.getCodigo());
		assertEquals(precio, depto.getPrecio());
		assertEquals(calle, depto.getCalle());
		assertEquals(numero, depto.getNumero());
		assertEquals(localidad, depto.getLocalidad());
		assertEquals(cantidadAmbientes, depto.getCantidadAmbientes());
		assertEquals(numeroPiso, depto.getNumeroPiso());
		assertEquals(numeroPuerta, depto.getNumeroPuerta());
		assertEquals(expensas, depto.getExpensas());
		assertEquals(m2, depto.getM2());
	}

	@Test
	public void queSePuedaCrearUnPH() {
		// Preparacion
		Integer codigo = 1;
		Double precio = 69000.0;
		String calle = "guemes";
		Integer numero = 717;
		String localidad = "san miguel";
		Integer cantidadAmbientes = 3;
		Double m2 = 65.0;

		// Ejecucion
		PH casa = new PH(codigo, precio, calle, numero, localidad, cantidadAmbientes, m2);
		// Validacion
		assertEquals("PH" + codigo, casa.getCodigo());
		assertEquals(precio, casa.getPrecio());
		assertEquals(calle, casa.getCalle());
		assertEquals(numero, casa.getNumero());
		assertEquals(localidad, casa.getLocalidad());
		assertEquals(cantidadAmbientes, casa.getCantidadAmbientes());
		assertEquals(m2, casa.getM2());
	}

	@Test
	public void queSePuedaCrearUnTerreno() {
		// Preparacion
		Integer codigo = 1;
		Double precio = 240000.0;
		String calle = "jose manuel estrada";
		Integer numero = 910;
		String localidad = "paso del rey";
		Double m2 = 7300.0;

		// Ejecucion
		Terreno casa = new Terreno(codigo, precio, calle, numero, localidad, m2);
		// Validacion
		assertEquals("T" + codigo, casa.getCodigo());
		assertEquals(precio, casa.getPrecio());
		assertEquals(calle, casa.getCalle());
		assertEquals(numero, casa.getNumero());
		assertEquals(localidad, casa.getLocalidad());
		assertEquals(m2, casa.getM2());
	}

	@Test
	public void queSePuedaCrearUnCampo() {
		// Preparacion
		Integer codigo = 1;
		Double precio = 1290000.0;
		String calle = "ruta nacional";
		Integer numero = 2;
		String localidad = "la plata";
		Double cantidadHectaria = 130.0;
		Double m2 = 1300000.0;

		// Ejecucion
		Campo casa = new Campo(codigo, precio, calle, numero, localidad, cantidadHectaria, m2);
		// Validacion
		assertEquals("C" + codigo, casa.getCodigo());
		assertEquals(precio, casa.getPrecio());
		assertEquals(calle, casa.getCalle());
		assertEquals(numero, casa.getNumero());
		assertEquals(localidad, casa.getLocalidad());
		assertEquals(m2, casa.getM2());
	}



	@Test
	public void queSePuedaDarDeAltaUnaCasaEnLaInmobiliaria() {
		// Preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Casa casa = new Casa(1, 55000.0, "Guemes", 268, "San miguel", 1, 40.0);
		// Ejecucion
		nueva.agregar(casa);
		// Validacion
		assertEquals(casa, nueva.buscar(casa.getCodigo()));

	}

	@Test
	public void queSePuedaDarDeAltaDosCasasEnLaInmobiliaria() {
		// Preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Casa casaUno = new Casa(1, 55000.0, "Guemes", 268, "San miguel", 1, 40.0);
		Casa casaDos = new Casa(2, 135000.0, "Pringles", 1568, "San miguel", 3, 135.0);
		// Ejecucion
		nueva.agregar(casaUno);
		nueva.agregar(casaDos);
		// Validacion
		assertEquals(casaUno, nueva.buscar(casaUno.getCodigo()));
		assertEquals(casaDos, nueva.buscar(casaDos.getCodigo()));
	}

	@Test
	public void queNoSePuedaDarDeAltaDosCasasConUnaMismaDireccionEsDecirCalleNumeroLocalidad() {
		// preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Casa casaUno = new Casa(1, 55000.0, "Guemes", 268, "San miguel", 1, 40.0);
		Casa casaDos = new Casa(2, 55000.0, "Guemes", 268, "San miguel", 1, 40.0);
		// ejecucion
		nueva.agregar(casaUno);
		nueva.agregar(casaDos);
		// validacion
		assertEquals(casaUno, nueva.buscar(casaUno.getCodigo()));
		assertNull(nueva.buscar(casaDos.getCodigo()));
	}

	@Test
	public void queSePuedaDarDeAltaUnDepartamentoEnLaInmobiliaria() {
		// Preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Departamento depto = new Departamento(1, 40000.0, "las heras", 1030, "san miguel", 1, 3, "B", 12000.0, 24.0);
		// Ejecucion
		nueva.agregar(depto);
		// Validacion
		assertEquals(depto, nueva.buscar(depto.getCodigo()));

	}

	@Test
	public void queSePuedaDarDeAltaDosDepartamentosEnLaInmobiliaria() {
		// Preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Departamento deptoUno = new Departamento(1, 40000.0, "las heras", 1030, "san miguel", 1, 3, "B", 12000.0, 24.0);
		Departamento deptoDos = new Departamento(2, 41000.0, "urquiza", 1650, "san miguel", 1, 2, "c", 23000.0, 28.0);
		// Ejecucion
		nueva.agregar(deptoUno);
		nueva.agregar(deptoDos);
		// Validacion
		assertEquals(deptoUno, nueva.buscar(deptoUno.getCodigo()));
		assertEquals(deptoDos, nueva.buscar(deptoDos.getCodigo()));

	}

	@Test
	public void queNoSePuedaDarDeAltaDosDepartamentosConUnaMismaDireccionEsDecirCalleNumeroLocalidad() {
		// Preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Departamento deptoUno = new Departamento(1, 40000.0, "las heras", 1030, "san miguel", 1, 3, "B", 12000.0, 24.0);
		Departamento deptoDos = new Departamento(2, 41000.0, "las heras", 1030, "san miguel", 1, 3, "B", 12000.0, 24.0);
		// Ejecucion
		nueva.agregar(deptoUno);
		nueva.agregar(deptoDos);
		// Validacion
		assertEquals(deptoUno, nueva.buscar(deptoUno.getCodigo()));
		assertNull(nueva.buscar(deptoDos.getCodigo()));
	}

	@Test
	public void queSePuedaModificarElPrecioDeUnaCasa() {
		// Preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Casa casa = new Casa(1, 55000.0, "Guemes", 268, "San miguel", 1, 40.0);
		Double nuevoPrecio = 80000.0;
		// Ejecucion
		nueva.agregar(casa);
		nueva.cambiarPrecio(casa, nuevoPrecio);
		// Validacion
		assertEquals(nuevoPrecio, casa.getPrecio());
		assertEquals("C1", casa.getCodigo());
	}

	@Test
	public void queSePuedaCrearUnCliente() {
		// Preparacion
		String nombre = "Sforza propiedades";
		String apellido = "España";
		Integer dni = 910;

		// Ejecucion
		Cliente cliente = new Cliente(dni, nombre, apellido);

		// Validacion
		assertEquals(nombre, cliente.getNombre());
		assertEquals(apellido, cliente.getApellido());
		assertEquals(dni, cliente.getDni());
	}

	@Test
	public void queSePuedaDarDeAltarUnClienteEnLaInmobiliaria() {
		// Preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Cliente cliente = new Cliente(40222333, "ana", "gomez");
		// Ejecucion
		nueva.agregar(cliente);
		// Validacion
		assertEquals(cliente, nueva.buscar(cliente.getDni()));
	}

	@Test
	public void queNoSePuedaDarDeAltarADosClientesConElMismoDNIEnLaInmobiliaria() {
		// Preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Cliente clienteUno = new Cliente(40222333, "ana", "gomez");
		Cliente clienteDos = new Cliente(40222333, "luis", "diaz");
		// Ejecucion
		nueva.agregar(clienteUno);
		nueva.agregar(clienteDos);
		// Validacion
		assertEquals(clienteUno, nueva.buscar(clienteUno.getDni()));
		assertEquals(1, nueva.getClientes().size());
	}

	@Test
	public void queSePuedaObtenerUnArrayDePropiedadesOrdenadasPorPrecio() {
		// preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Casa casa = new Casa(1, 55000.0, "Guemes", 268, "San miguel", 1, 40.0);
		Departamento depto = new Departamento(1, 40000.0, "las heras", 1030, "san miguel", 1, 3, "B", 12000.0, 24.0);
		PH ph = new PH(1, 30000.0, "españa", 690, "moreno", 2, 45.0);
		Terreno terreno = new Terreno(1, 1200000.0, "esperanza", 2323, "rodriguez", 150.0);
		Campo campo = new Campo(1, 25000000.0, "ruta provincial", 2, "la plata", 130.0, 1300.0);
		// ejecucion
		nueva.agregar(casa);
		nueva.agregar(depto);
		nueva.agregar(ph);
		nueva.agregar(terreno);
		nueva.agregar(campo);
		ArrayList<Propiedad> listaPropiedadesOrdenadas = nueva.obtenerPropiedadesOrdenadasPorElPrecio();
		// validacion
		for (int i = 0; i < listaPropiedadesOrdenadas.size() - 1; i++) {
			assertTrue(listaPropiedadesOrdenadas.get(i).getPrecio() < listaPropiedadesOrdenadas.get(i + 1).getPrecio());
		}
	}

	@Test
	public void queSePuedaObtenerUnArrayDePropiedadesOrdenadasPorLaUbicacion() {
		// preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "san miguel", 46646433);
		Casa casa = new Casa(1, 55000.0, "Guemes", 268, "san miguel", 1, 40.0);
		Departamento depto = new Departamento(1, 40000.0, "las heras", 1030, "san miguel", 1, 3, "B", 12000.0, 24.0);
		PH ph = new PH(1, 30000.0, "españa", 690, "moreno", 2, 45.0);
		Terreno terreno = new Terreno(1, 1200000.0, "esperanza", 2323, "rodriguez", 150.0);
		Campo campo = new Campo(1, 25000000.0, "ruta provincial", 2, "la plata", 130.0, 1300.0);
		// ejecucion
		nueva.agregar(casa);
		nueva.agregar(depto);
		nueva.agregar(ph);
		nueva.agregar(terreno);
		nueva.agregar(campo);
		ArrayList<Propiedad> listaPropiedadesOrdenadas = nueva.obtenerPropiedadesOrdenadasPorLaUbicacion();
		// validacion
		for (int i = 0; i < listaPropiedadesOrdenadas.size() - 1; i++) {
			assertTrue(listaPropiedadesOrdenadas.get(i).getLocalidad()
					.compareTo(listaPropiedadesOrdenadas.get(i + 1).getLocalidad()) <= 0);
		}
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLasCasas() {
		// preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "san miguel", 46646433);
		Casa casaUno = new Casa(1, 55000.0, "Guemes", 268, "San miguel", 1, 40.0);
		Casa casaDos = new Casa(2, 135000.0, "Pringles", 1568, "San miguel", 3, 135.0);
		Casa casaTres = new Casa(3, 400000.0, "san martin", 789, "ituzaingo", 2, 20.0);
		Casa casaCuatro = new Casa(4, 450000.0, "belgrano", 1011, "ramos mejia", 2, 25.0);
		Double promedioEsperado = 260000.0;
		// ejecucion
		nueva.agregar(casaUno);
		nueva.agregar(casaDos);
		nueva.agregar(casaTres);
		nueva.agregar(casaCuatro);
		Double promedio = nueva.calcularElPromedioDeLasCasas();
		// validacion
		assertEquals(promedioEsperado, promedio);
	}

	@Test
	public void queSePuedaObtenerElValorPromedioDeLosDepartamentos() {
		// preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Departamento deptoUno = new Departamento(1, 40000.0, "las heras", 1030, "san miguel", 1, 3, "B", 12000.0, 24.0);
		Departamento deptoDos = new Departamento(2, 41000.0, "urquiza", 1650, "san miguel", 1, 2, "c", 23000.0, 28.0);
		Departamento deptoTres = new Departamento(3, 400000.0, "avenida independiente", 789, "la matanza", 2, 4, "c",
				0.0, 30.0);
		Departamento deptoCuatro = new Departamento(4, 350000.0, "belgrano", 1011, "merlo", 3, 2, "B", 15000.0, 25.0);
		Departamento deptoCinco = new Departamento(5, 500000.0, "avenida san martin", 1212, "bella vista", 5, 10, "D",
				10000.0, 28.0);
		Double promedioEsperado = 266200.0;
		// ejecucion
		nueva.agregar(deptoUno);
		nueva.agregar(deptoDos);
		nueva.agregar(deptoTres);
		nueva.agregar(deptoCuatro);
		nueva.agregar(deptoCinco);
		Double promedio = nueva.calcularElPromedioDeLosDepartamentos();
		// validacion
		assertEquals(promedioEsperado, promedio);
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioMeArrojeUnaListaNoNuloSiAplicanResultados() {
		// preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Casa casa = new Casa(1, 55000.0, "Guemes", 268, "san miguel", 1, 40.0);
		Departamento depto = new Departamento(1, 40000.0, "las heras", 1030, "san miguel", 1, 3, "B", 12000.0, 24.0);
		PH ph = new PH(1, 30000.0, "españa", 690, "moreno", 2, 45.0);
		Terreno terreno = new Terreno(1, 1200000.0, "esperanza", 2323, "rodriguez", 150.0);
		Campo campo = new Campo(1, 25000000.0, "ruta provincial", 2, "la plata", 130.0, 1300.0);
		Double precioMinimo = 0.0;
		Double precioMaximo = 60000.0;
		// ejecucion
		nueva.agregar(casa);
		nueva.agregar(depto);
		nueva.agregar(ph);
		nueva.agregar(terreno);
		nueva.agregar(campo);

		ArrayList<Propiedad> listaPropiedades = nueva.buscarPorRangoDePrecio(precioMinimo, precioMaximo);
		// validacion
		assertNotNull(listaPropiedades);
	}
	
	@Test
	public void queLaBusquedaPorRangoDePrecioDeCasasMeArrojeUnArrayNuloSiNoAplicanResultados() {
		// preparacion
		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
		Casa casa = new Casa(1, 550000.0, "Guemes", 268, "san miguel", 1, 40.0);
		Double precioMinimo = 0.0;
		Double precioMaximo = 60000.0;
		// ejecucion
		ArrayList<Casa> listaCasas = nueva.buscarCasasPorRangoDePrecio(precioMinimo, precioMaximo);
		// validacion
		assertNull(listaCasas);
	}
	
//	@Test
//	public void queLaBusquedaDePropiedadesPorVentaMeArrojeUnaLista() {
//		// preparacion
//		Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
//		Casa casa = new Casa(1, 55000.0, "Guemes", 268, "san miguel", 1, 40.0);
//		Departamento depto = new Departamento(1, 40000.0, "las heras", 1030, "san miguel", 1, 3, "B", 12000.0, 24.0);
//		PH ph = new PH(1, 30000.0, "españa", 690, "moreno", 2, 45.0);
//		Terreno terreno = new Terreno(1, 1200000.0, "esperanza", 2323, "rodriguez", 150.0);
//		Campo campo = new Campo(1, 25000000.0, "ruta provincial", 2, "la plata", 130.0, 1300.0);
//
//		// ejecucion
//		// ejecucion
//		nueva.agregar(casa);
//		nueva.agregar(depto);
//		nueva.agregar(ph);
//		nueva.agregar(terreno);
//		nueva.agregar(campo);
//		ArrayList<Propiedad> listaDePropiedadesEnVenta = nueva.buscarVentas();
//		// validacion
//		assertNull(listaDePropiedadesEnVenta);
//	}
}
