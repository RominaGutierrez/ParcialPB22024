package ar.edu.unlam.pb2;

import java.util.*;

public class InterfazMenu {

	private static Inmobiliaria nueva = new Inmobiliaria("Sforza propiedades", "España", 910, "San miguel", 46646433);
	private static final Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {

		// Scanner teclado = new Scanner(System.in);
		String siOno = "";
		MenuPrincipal unidad;
		do {
			menu();
			unidad = MenuPrincipal.values()[teclado.nextInt() - 1];
			System.out.println("Eligió: " + unidad);
			switch (unidad) {
			case AGREGAR_PROPIEDAD:
				do {
					menuDePropiedades();
					TipoPropiedad tipoPropiedad = TipoPropiedad.values()[teclado.nextInt() - 1];
					System.out.println("Eligió: " + tipoPropiedad);

					switch (tipoPropiedad) {
					case CASA:
						System.out.println("Ingrese numero de la casa:");
						Integer numeroCasa = teclado.nextInt();
						System.out.println("Ingrese precio de la casa:");
						Double precio = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la calle de la casa:");
						String calle = teclado.nextLine();
						System.out.println("Ingrese el numero de la calle:");
						Integer numero = teclado.nextInt();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la localidad de la casa:");
						String localidad = teclado.nextLine();
						System.out.println("Ingrese la cantidad de dormitorios de la casa:");
						Integer cantidadDormitorios = teclado.nextInt();
						System.out.println("Ingrese los M2 de la casa:");
						Double m2 = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						Casa casa = new Casa(numeroCasa, precio, calle, numero, localidad, cantidadDormitorios, m2);
						nueva.agregar(casa);
						resultadoDeAltaDePropiedad(casa, tipoPropiedad);
						break;

					case DEPARTAMENTO:
						System.out.println("Ingrese numero del departamento:");
						Integer numeroDepto = teclado.nextInt();
						System.out.println("Ingrese precio del departamento:");
						precio = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la calle del departamento:");
						calle = teclado.nextLine();
						System.out.println("Ingrese el numero de la calle:");
						numero = teclado.nextInt();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la localidad del departamento:");
						localidad = teclado.nextLine();
						System.out.println("Ingrese la cantidad de ambientes del departamento:");
						Integer cantidadAmbientes = teclado.nextInt();
						System.out.println("Ingrese el numero de piso del departamento:");
						Integer numeroPiso = teclado.nextInt();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la letra de la puerta del departamento:");
						String numeroPuerta = teclado.nextLine();
						System.out.println("Ingrese el monto de expensas del departamento:");
						Double expensas = teclado.nextDouble();
						System.out.println("Ingrese los M2 del departamento:");
						m2 = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						Departamento depto = new Departamento(numeroDepto, precio, calle, numero, localidad,
								cantidadAmbientes, numeroPiso, numeroPuerta, expensas, m2);
						nueva.agregar(depto);
						resultadoDeAltaDePropiedad(depto, tipoPropiedad);
						break;
					case PH:
						System.out.println("Ingrese numero del PH:");
						Integer numeroPH = teclado.nextInt();
						System.out.println("Ingrese precio del PH:");
						precio = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la calle del PH:");
						calle = teclado.nextLine();
						System.out.println("Ingrese el numero de la calle:");
						numero = teclado.nextInt();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la localidad del PH:");
						localidad = teclado.nextLine();
						System.out.println("Ingrese la cantidad de ambientes del PH:");
						cantidadAmbientes = teclado.nextInt();
						System.out.println("Ingrese los M2 del departamento:");
						m2 = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						PH ph = new PH(numeroPH, precio, calle, numero, localidad, cantidadAmbientes, m2);
						nueva.agregar(ph);
						resultadoDeAltaDePropiedad(ph, tipoPropiedad);
						break;
					case TERRENO:
						System.out.println("Ingrese numero del terreno:");
						Integer codigo = teclado.nextInt();
						System.out.println("Ingrese precio del terreno:");
						precio = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la calle del terreno:");
						calle = teclado.nextLine();
						System.out.println("Ingrese el numero de la calle:");
						numero = teclado.nextInt();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la localidad del terreno:");
						localidad = teclado.nextLine();
						System.out.println("Ingrese los M2 del terreno:");
						m2 = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						Terreno terreno = new Terreno(codigo, precio, calle, numero, localidad, m2);
						nueva.agregar(terreno);
						resultadoDeAltaDePropiedad(terreno, tipoPropiedad);
						break;
					case CAMPO:
						System.out.println("Ingrese numero del campo:");
						codigo = teclado.nextInt();
						System.out.println("Ingrese precio del campo:");
						precio = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la calle del campo:");
						calle = teclado.nextLine();
						System.out.println("Ingrese el numero de la calle:");
						numero = teclado.nextInt();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						System.out.println("Ingrese la localidad del campo:");
						localidad = teclado.nextLine();
						System.out.println("Ingrese la cantidad de hectarias del campo:");
						Double cantidadHectaria = teclado.nextDouble();
						System.out.println("Ingrese los M2 del campo:");
						m2 = teclado.nextDouble();
						teclado.nextLine(); // Consumir el salto de línea pendiente
						Campo campo = new Campo(codigo, precio, calle, numero, localidad, cantidadHectaria, m2);
						nueva.agregar(campo);
						resultadoDeAltaDePropiedad(campo, tipoPropiedad);
						break;
					}

					System.out.println("¿Desea cargar otra propiedad? (s/n)");
					siOno = teclado.nextLine();

				} while (!siOno.equalsIgnoreCase("n"));

				break;
			case MODIFICAR_PROPIEDAD:
				menuDePropiedades();
				TipoPropiedad tipoPropiedad = TipoPropiedad.values()[teclado.nextInt() - 1];
				System.out.println("Eligió: " + tipoPropiedad);
				teclado.nextLine(); // Consumir el salto de línea pendiente
				switch (tipoPropiedad) {
				case CASA:
					ArrayList<Casa> casas = nueva.obtenerCasas();
					mostrarTablaCasas(casas);
					System.out.println("Ingrese codigo de la casa:");
					String codigoABuscar = teclado.nextLine();
					Propiedad modificar = nueva.buscar(codigoABuscar);
					if (modificar != null) {
						System.out.println("Ingrese nuevo precio de la casa:");
						Double nuevoPrecio = teclado.nextDouble();
						nueva.cambiarPrecio(modificar, nuevoPrecio);
					} else {
						System.out.println("No se encontro el codigo de la casa :c");
					}
					break;
				case DEPARTAMENTO:
					ArrayList<Departamento> deptos = nueva.obtenerDeptos();
					mostrarTablaDeptos(deptos);
					System.out.println("Ingrese codigo de la casa:");
					codigoABuscar = teclado.nextLine();
					modificar = nueva.buscar(codigoABuscar);
					if (modificar != null) {
						System.out.println("Ingrese nuevo precio del depto:");
						Double nuevoPrecio = teclado.nextDouble();
						nueva.cambiarPrecio(modificar, nuevoPrecio);
					} else {
						System.out.println("No se encontro el codigo del depto :c");
					}
					break;
				case PH:
					ArrayList<PH> phs = nueva.obtenerPhs();
					mostrarTablaPhs(phs);
					System.out.println("Ingrese codigo del PH:");
					codigoABuscar = teclado.nextLine();
					modificar = nueva.buscar(codigoABuscar);
					if (modificar != null) {
						System.out.println("Ingrese nuevo precio del PH:");
						Double nuevoPrecio = teclado.nextDouble();
						nueva.cambiarPrecio(modificar, nuevoPrecio);
					} else {
						System.out.println("No se encontro el codigo del PH :c");
					}
					break;
				case TERRENO:
					ArrayList<Terreno> terrenos = nueva.obtenerTerrenos();
					mostrarTablaTerrenos(terrenos);
					System.out.println("Ingrese codigo del terrenos:");
					codigoABuscar = teclado.nextLine();
					modificar = nueva.buscar(codigoABuscar);
					if (modificar != null) {
						System.out.println("Ingrese nuevo precio del terreno:");
						Double nuevoPrecio = teclado.nextDouble();
						nueva.cambiarPrecio(modificar, nuevoPrecio);
					} else {
						System.out.println("No se encontro el codigo del terreno :c");
					}
					break;
				case CAMPO:
					ArrayList<Campo> campos = nueva.obtenerCampos();
					mostrarTablaCampos(campos);
					System.out.println("Ingrese codigo del terrenos:");
					codigoABuscar = teclado.nextLine();
					modificar = nueva.buscar(codigoABuscar);
					if (modificar != null) {
						System.out.println("Ingrese nuevo precio del Campo:");
						Double nuevoPrecio = teclado.nextDouble();
						nueva.cambiarPrecio(modificar, nuevoPrecio);
					} else {
						System.out.println("No se encontro el codigo del Campo :c");
					}
					break;
				}
				break;
			case AGREGAR_CLIENTE:
				System.out.println("Ingrese el DNI del cliente:");
				Integer dni = teclado.nextInt();
				teclado.nextLine(); // Consumir el salto de línea pendiente
				System.out.println("Ingrese el nombre del cliente:");
				String nombre = teclado.nextLine();
				System.out.println("Ingrese el apellido del cliente:");
				String apellido = teclado.nextLine();
				Cliente cliente = new Cliente(dni, nombre, apellido);
				if (!(nueva.getClientes().contains(cliente))) {
					nueva.agregar(cliente);
					System.out.println("Cliente dado de alta");
				} else {
					System.out.println("DNI ya existe");
				}
				break;
			case LISTADO_PROPIEDADES_ORDENADO_POR_PRECIO:
				ArrayList<Propiedad> listaPropiedadesOrdenadas = nueva.obtenerPropiedadesOrdenadasPorElPrecio();
				mostrarListaPropiedadesOrdenadasPorPrecio(listaPropiedadesOrdenadas);
				break;
			case LISTADO_PROPIEDADES_ORDENADO_POR_UBICACION:
				ArrayList<Propiedad> listaPropiedadesOrdenadasPorUbicacion = nueva
						.obtenerPropiedadesOrdenadasPorLaUbicacion();
				mostrarListaPropiedadesOrdenadasPorUbicacion(listaPropiedadesOrdenadasPorUbicacion);
				break;
			case BUSCAR_PROPIEDAD_POR_DIFERENTES_PARAMETROS:
				menuParametros();
				MenuParametros parametro = MenuParametros.values()[teclado.nextInt() - 1];
				System.out.println("Eligió: " + unidad);
				switch (parametro) {
				case RANGO_DE_PRECIOS:

					break;
				case UBICACION:

					break;
				case VENTA_O_ALQUILER:

					break;
				}
				break;
			case REALIZAR_VENTA:

				break;
			case REALIZAR_ALQUILER:

				break;
			case SALIR:
				System.out.println("Adioossss....");
				break;
			}
		} while (unidad != MenuPrincipal.SALIR);

	}

	private static void menuParametros() {
		System.out.println("Elija una opción:" + "\n1. " + MenuParametros.values()[0] + "\n2. "
				+ MenuParametros.values()[1] + "\n3. " + MenuParametros.values()[2]);

	}

	private static void mostrarListaPropiedadesOrdenadasPorUbicacion(ArrayList<Propiedad> listaPropiedadesOrdenadas) {
		for (Propiedad actual : listaPropiedadesOrdenadas) {
			System.out.println(" " + actual.toString());
		}

	}

	private static void mostrarListaPropiedadesOrdenadasPorPrecio(ArrayList<Propiedad> listaPropiedadesOrdenadas) {
		for (Propiedad actual : listaPropiedadesOrdenadas) {
			System.out.println(" " + actual.toString());
		}
	}

	private static void mostrarTablaCampos(ArrayList<Campo> campos) {
		for (Campo actual : campos) {
			System.out.println(" " + actual.toString());
		}
	}

	private static void mostrarTablaTerrenos(ArrayList<Terreno> terrenos) {
		for (Terreno actual : terrenos) {
			System.out.println(" " + actual.toString());
		}

	}

	private static void mostrarTablaPhs(ArrayList<PH> phs) {
		for (PH actual : phs) {
			System.out.println(" " + actual.toString());
		}

	}

	private static void mostrarTablaDeptos(ArrayList<Departamento> deptos) {
		for (Departamento actual : deptos) {
			System.out.println(" " + actual.toString());
		}

	}

	private static void mostrarTablaCasas(ArrayList<Casa> casas) {
		for (Casa actual : casas) {
			System.out.println(" " + actual.toString());
		}
	}

	private static void resultadoDeAltaDePropiedad(Propiedad propiedad, TipoPropiedad tipoPropiedad) {
		if ((nueva.buscar(propiedad.getCodigo()) != null)) {
			System.out.println(tipoPropiedad + " dado de alta");
		} else {
			System.out.println(tipoPropiedad + " ya existe");
		}
	}

	private static void menuDePropiedades() {
		System.out.println("Elija una opción:" + "\n1. " + TipoPropiedad.values()[0] + "\n2. "
				+ TipoPropiedad.values()[1] + "\n3. " + TipoPropiedad.values()[2] + "\n4. " + TipoPropiedad.values()[3]
				+ "\n5. " + TipoPropiedad.values()[4]);

	}

	private static void menu() {
		System.out.println("Inmobiliaria: " + nueva.getNombre());
		System.out.println("Elija una opción:" + "\n1. " + MenuPrincipal.values()[0] + "\n2. "
				+ MenuPrincipal.values()[1] + "\n3. " + MenuPrincipal.values()[2] + "\n4. " + MenuPrincipal.values()[3]
				+ "\n5. " + MenuPrincipal.values()[4] + "\n6. " + MenuPrincipal.values()[5] + "\n7. "
				+ MenuPrincipal.values()[6] + "\n8. " + MenuPrincipal.values()[7]);
	}

}
