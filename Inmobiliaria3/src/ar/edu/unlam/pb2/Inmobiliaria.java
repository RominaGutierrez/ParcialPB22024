package ar.edu.unlam.pb2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Inmobiliaria {

	private String nombre;
	private String calle;
	private Integer numero;
	private String localidad;
	private Integer telefono;
	private HashSet<Propiedad> propiedades;
	private HashSet<Cliente> clientes;

	public Inmobiliaria(String nombre, String calle, Integer numero, String localidad, Integer telefono) {
		this.nombre = nombre;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.telefono = telefono;
		this.propiedades = new HashSet<>();
		this.clientes = new HashSet<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public HashSet<Cliente> getClientes() {
		return clientes;
	}

	public HashSet<Propiedad> getPropiedades() {
		return propiedades;
	}

	public void agregar(Propiedad propiedad) {
		propiedades.add(propiedad);

	}

	public Propiedad buscar(String codigo) {
		for (Propiedad actual : propiedades) {
			if (actual.getCodigo().equals(codigo)) {
				return actual;
			}
		}
		return null;
	}

	public ArrayList<Casa> obtenerCasas() {
		ArrayList<Casa> listaDeCasas = new ArrayList<>();
		for (Propiedad actual : propiedades) {
			if (actual instanceof Casa) {
				listaDeCasas.add((Casa) actual);
			}
		}
		Collections.sort(listaDeCasas, new CompararPropiedades());
		return listaDeCasas;
	}

	public void cambiarPrecio(Propiedad casa, Double nuevoPrecio) {
		Propiedad modificar = buscar(casa.getCodigo());
		modificar.setPrecio(nuevoPrecio);
	}

	public ArrayList<Departamento> obtenerDeptos() {
		ArrayList<Departamento> listaDeDeptos = new ArrayList<>();
		for (Propiedad actual : propiedades) {
			if (actual instanceof Departamento) {
				listaDeDeptos.add((Departamento) actual);
			}
		}
		Collections.sort(listaDeDeptos, new CompararPropiedades());
		return listaDeDeptos;
	}

	public ArrayList<PH> obtenerPhs() {
		ArrayList<PH> listaDePHs = new ArrayList<>();
		for (Propiedad actual : propiedades) {
			if (actual instanceof PH) {
				listaDePHs.add((PH) actual);
			}
		}
		Collections.sort(listaDePHs, new CompararPropiedades());
		return listaDePHs;
	}

	public ArrayList<Terreno> obtenerTerrenos() {
		ArrayList<Terreno> listaDeTerrenos = new ArrayList<>();
		for (Propiedad actual : propiedades) {
			if (actual instanceof Terreno) {
				listaDeTerrenos.add((Terreno) actual);
			}
		}
		Collections.sort(listaDeTerrenos, new CompararPropiedades());
		return listaDeTerrenos;
	}

	public ArrayList<Campo> obtenerCampos() {
		ArrayList<Campo> listaDeCampos = new ArrayList<>();
		for (Propiedad actual : propiedades) {
			if (actual instanceof Campo) {
				listaDeCampos.add((Campo) actual);
			}
		}
		Collections.sort(listaDeCampos, new CompararPropiedades());
		return listaDeCampos;
	}

	public void agregar(Cliente cliente) {
		clientes.add(cliente);
	}

	public Cliente buscar(Integer dni) {
		for (Cliente actual : clientes) {
			if (actual.getDni().equals(dni)) {
				return actual;
			}
		}
		return null;
	}

	public ArrayList<Propiedad> obtenerPropiedadesOrdenadasPorElPrecio() {
		ArrayList<Propiedad> listaPropiedadesOrdenas = new ArrayList<>();
		for (Propiedad actual : propiedades) {
			listaPropiedadesOrdenas.add(actual);
		}
		Collections.sort(listaPropiedadesOrdenas, new CompararPropiedadesPorPrecio());
		return listaPropiedadesOrdenas;
	}

	public ArrayList<Propiedad> obtenerPropiedadesOrdenadasPorLaUbicacion() {
		ArrayList<Propiedad> listaPropiedadesOrdenas = new ArrayList<>();
		for (Propiedad actual : propiedades) {
			listaPropiedadesOrdenas.add(actual);
		}
		Collections.sort(listaPropiedadesOrdenas, new CompararPropiedadesPorUbicacion());
		return listaPropiedadesOrdenas;
	}

	public Double calcularElPromedioDeLasCasas() {
		Double promedio = 0.0;
		Double sumatoriaDePrecio = 0.0;
		Integer contadorDeCasas = 0;

		for (Propiedad actual : propiedades) {
			if (actual instanceof Casa) {
				sumatoriaDePrecio += actual.getPrecio();
				contadorDeCasas++;
			}
		}
		if (contadorDeCasas == 0) {
			return promedio;
		}

		promedio = sumatoriaDePrecio / contadorDeCasas;
		return promedio;
	}

	public Double calcularElPromedioDeLosDepartamentos() {
		Double promedio = 0.0;
		Double sumatoriaDePrecio = 0.0;
		Integer contadorDeDeptos = 0;

		for (Propiedad actual : propiedades) {
			if (actual instanceof Departamento) {
				sumatoriaDePrecio += actual.getPrecio();
				contadorDeDeptos++;
			}
		}
		if (contadorDeDeptos == 0) {
			return promedio;
		}

		promedio = sumatoriaDePrecio / contadorDeDeptos;
		return promedio;
	}

	public ArrayList<Propiedad> buscarPorRangoDePrecio(Double precioMinimo, Double precioMaximo) {
		ArrayList<Propiedad> listaPropiedades = new ArrayList<>();
		Integer contadorIndice = 0;
		for (Propiedad propiedad : propiedades) {
			if (propiedad.getPrecio() >= precioMinimo && propiedad.getPrecio() <= precioMaximo) {
				listaPropiedades.add(propiedad);
				contadorIndice++;
			}
		}
		if (contadorIndice == 0) {
			return listaPropiedades = null;
		}
		return listaPropiedades;
	}

	public ArrayList<Casa> buscarCasasPorRangoDePrecio(Double precioMinimo, Double precioMaximo) {
		ArrayList<Casa> listaCasa = new ArrayList<>();
		Integer contadorIndice = 0;
		for (Propiedad propiedad : propiedades) {
			if (propiedad instanceof Casa) {
				if (propiedad.getPrecio() >= precioMinimo && propiedad.getPrecio() <= precioMaximo) {
					listaCasa.add((Casa) propiedad);
					contadorIndice++;
				}
			}

		}
		if (contadorIndice == 0) {
			return listaCasa = null;
		}
		return listaCasa;
	}

	public ArrayList<Propiedad> buscarVentas() {
		ArrayList<Propiedad> listaDePropiedadesEnVenta = new ArrayList<>();
		for (Propiedad actual : listaDePropiedadesEnVenta) {
			
		}
		return listaDePropiedadesEnVenta;
	}

}
