package ar.edu.unlam.pb2;

public class Departamento extends Propiedad {

	private Integer cantidadAmbientes;
	private Integer numeroPiso;
	private String numeroPuerta;
	private Double expensas;

	public Departamento(Integer codigo, Double precio, String calle, Integer numero, String localidad,
			Integer cantidadAmbientes, Integer numeroPiso, String numeroPuerta, Double expensas, Double m2) {
		super("D" + codigo, precio, calle, numero, localidad, m2);
		this.cantidadAmbientes = cantidadAmbientes;
		this.numeroPiso = numeroPiso;
		this.numeroPuerta = numeroPuerta;
		this.expensas = expensas;
	}

	public Integer getCantidadAmbientes() {
		return cantidadAmbientes;
	}

	public void setCantidadAmbientes(Integer cantidadAmbientes) {
		this.cantidadAmbientes = cantidadAmbientes;
	}

	public Integer getNumeroPiso() {
		return numeroPiso;
	}

	public void setNumeroPiso(Integer numeroPiso) {
		this.numeroPiso = numeroPiso;
	}

	public String getNumeroPuerta() {
		return numeroPuerta;
	}

	public void setNumeroPuerta(String numeroPuerta) {
		this.numeroPuerta = numeroPuerta;
	}

	public Double getExpensas() {
		return expensas;
	}

	public void setExpensas(Double expensas) {
		this.expensas = expensas;
	}

}
