package ar.com.loyalindra.javabasic.interfaces;

public class DBMensajeria implements IMensajeria {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Guardando en la DB" + mensaje);
	}

}
