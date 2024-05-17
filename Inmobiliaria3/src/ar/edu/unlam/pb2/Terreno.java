package ar.edu.unlam.pb2;

public class Terreno extends Propiedad{

	public Terreno(Integer codigo, Double precio, String calle, Integer numero, String localidad, Double m2) {
		super("T" + codigo, precio, calle, numero, localidad, m2);
	}

}
