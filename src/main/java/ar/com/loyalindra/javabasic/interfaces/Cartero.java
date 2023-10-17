package ar.com.loyalindra.javabasic.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Cartero {
	private String nombre;
	private List<IMensajeria> listado; 
	
	public Cartero(String nombre) {
		this.nombre = nombre;
		this.listado = new ArrayList<>();
	}
	
	public void agregarMensaje(IMensajeria mensaje) {
		listado.add(mensaje);
	}
	
	public void despachar(String mensaje) {
		for(IMensajeria msj : listado) {
			msj.enviar(mensaje);
		}
	}

	public String getNombre() {
		return nombre;
	}
}
