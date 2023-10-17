package ar.com.loyalindra.javabasic.interfaces;

public class DefaultMensajeria implements IMensajeria {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Implementacion por defecto");
	}

}
