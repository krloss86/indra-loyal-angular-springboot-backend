package ar.com.loyalindra.javabasic.interfaces;

public class FileSystemMensajeria implements IMensajeria {

	@Override
	public void enviar(String mensaje) {
		System.out.println("Escribiendo mensajer en file system" + mensaje);
	}

}
