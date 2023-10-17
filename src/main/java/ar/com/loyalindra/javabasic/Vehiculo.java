package ar.com.loyalindra.javabasic;

public abstract class Vehiculo {

	private Integer anio;
	private String marca;
	private String color;
	
	//constructor
	public Vehiculo(Integer anio, String marca, String color) {
		this.anio = anio;
		this.marca = marca;
		this.color = color;
	}

	public Integer getAnio() {
		return anio;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Vehiculo [anio=" + anio + ", Marca=" + marca + ", color=" + color + "]";
	}
	
}
