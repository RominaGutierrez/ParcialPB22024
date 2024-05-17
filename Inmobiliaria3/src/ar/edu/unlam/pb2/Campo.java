package ar.edu.unlam.pb2;

public class Campo extends Propiedad {

	private Double cantidadHectaria;

	public Campo(Integer codigo, Double precio, String calle, Integer numero, String localidad, Double cantidadHectaria,
			Double m2) {
		super("C" + codigo, precio, calle, numero, localidad, m2);
		this.cantidadHectaria = cantidadHectaria;
	}

	public Double getCantidadHectaria() {
		return cantidadHectaria;
	}

	public void setCantidadHectaria(Double cantidadHectaria) {
		this.cantidadHectaria = cantidadHectaria;
	}

	
}
