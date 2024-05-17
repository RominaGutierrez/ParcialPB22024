package ar.edu.unlam.pb2;

import java.util.Objects;

public class Propiedad {

	protected String codigo;
	protected Double precio;
	protected String calle;
	protected Integer numero;
	protected String localidad;
	private Double m2;

	public Propiedad(String codigo, Double precio, String calle, Integer numero, String localidad, Double m2) {
		this.codigo = codigo;
		this.precio = precio;
		this.calle = calle;
		this.numero = numero;
		this.localidad = localidad;
		this.m2 = m2;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
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
	
	public Double getM2() {
		return m2;
	}

	public void setM2(Double m2) {
		this.m2 = m2;
	}

	@Override
	public int hashCode() {
		return Objects.hash(calle, localidad, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Propiedad other = (Propiedad) obj;
		return Objects.equals(calle, other.calle) && Objects.equals(localidad, other.localidad)
				&& Objects.equals(numero, other.numero);
	}

	@Override
	public String toString() {
		return "Propiedad [codigo:" + codigo + ", precio:" + precio + ", calle:" + calle + ", numero:" + numero
				+ ", localidad:" + localidad + "]";
	}

	

	
}