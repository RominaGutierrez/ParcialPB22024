package ar.edu.unlam.pb2;

public class Casa extends Propiedad {

	private Integer cantidadDormitorios;

	public Casa(Integer codigo, Double precio, String calle, Integer numero, String localidad,
			Integer cantidadDormitorios,Double m2) {
		super("C"+codigo,precio,calle,numero,localidad,m2);
		this.cantidadDormitorios = cantidadDormitorios;
	}

	public Integer getCantidadDormitorios() {
		return cantidadDormitorios;
	}

	public void setCantidadDormitorios(Integer cantidadDormitorios) {
		this.cantidadDormitorios = cantidadDormitorios;
	}


	
	

}
