package ar.edu.unlam.pb2;

import java.util.Comparator;

public class CompararPropiedades implements Comparator<Propiedad> {

	@Override
	public int compare(Propiedad a1, Propiedad a2) {
		return a1.getCodigo().compareTo(a2.getCodigo());
	}

}
