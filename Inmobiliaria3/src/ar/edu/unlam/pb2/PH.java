package ar.edu.unlam.pb2;

public class PH extends Propiedad{

	private Integer cantidadAmbientes;

	public PH(Integer codigo, Double precio, String calle, Integer numero, String localidad,Integer cantidadAmbientes, Double m2) {
		super("PH" + codigo, precio, calle, numero, localidad, m2);
		this.cantidadAmbientes = cantidadAmbientes;
	}

	public Integer getCantidadAmbientes() {
		return cantidadAmbientes;
	}

	public void setCantidadAmbientes(Integer cantidadAmbientes) {
		this.cantidadAmbientes = cantidadAmbientes;
	}

	
}
