package ar.edu.unlam.pb2;

import java.util.Comparator;

public class CompararPropiedadesPorUbicacion implements Comparator<Propiedad> {

	@Override
	public int compare(Propiedad p1, Propiedad p2) {
		return p1.getLocalidad().compareTo(p2.getLocalidad());
	}

}
