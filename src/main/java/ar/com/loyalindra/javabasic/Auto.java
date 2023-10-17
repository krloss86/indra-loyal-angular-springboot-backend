package ar.com.loyalindra.javabasic;

public class Auto extends Vehiculo implements Tuneable{

	/*atributos ocultos o privados*/
	private String modelo;
	private Long nroChasis;
	
	/*constructor/es*/
	//alt+shit+s
	public Auto(String marca, 
			String modelo, 
			Integer anio, 
			String color, 
			Long nroChasis) {
		
		//nace el padre: invocar al contructor del padre
		super(anio,marca, color);
		
		//nace el hijo
		this.modelo = modelo;
		this.nroChasis = nroChasis;
	}
	
	/*metodos*/
	public void encender() {
		
	}
	
	public void acelear() {
		
	}
	public void apagar(){
		
	}
	//genermos los getters y setters
	//alt+shift+s

	public String getModelo() {
		return modelo;
	}

	public Long getNroChasis() {
		return nroChasis;
	}
	
	public void mostrarInformacion() {
		//como estoy dentro de la clase
		//puedo usar sus atributos y metodos
		//ya sea usando this o simplemente el nombre
		System.out.println(getMarca());
    	System.out.println(getModelo());
    	System.out.println(getAnio());
    	System.out.println(getColor());
    	System.out.println(getNroChasis());
	}

	@Override
	public String toString() {
		
		return super.toString() +  ", Auto ["+ 
				", modelo=" + modelo + 
				", nroChasis="
				+ nroChasis + "]";
	}

	//debo escribir la logica del metodo tunear()
	@Override
	public void tunear() {
		System.out.println("Auto tuneado");
	}
	
	
}
