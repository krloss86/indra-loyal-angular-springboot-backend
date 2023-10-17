package ar.com.loyalindra.javabasic.interfaces;

public class EmailMensajeria implements IMensajeria {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Enviado mensaje por email" + mensaje);
	}

}
