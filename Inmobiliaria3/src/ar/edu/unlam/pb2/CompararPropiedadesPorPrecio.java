package ar.edu.unlam.pb2;

import java.util.Comparator;

public class CompararPropiedadesPorPrecio implements Comparator<Propiedad> {

	@Override
	public int compare(Propiedad p1, Propiedad p2) {
		return p1.getPrecio().compareTo(p2.getPrecio());
	}

}
