package ar.com.loyalindra.javabasic.interfaces;

public class MensajeriaBuilder {

	public static IMensajeria crearMensajeria(String parametros) {
		IMensajeria mensajeria;
		switch (parametros) {
			case "d":
				mensajeria = new DBMensajeria();
				break;
			case "f":
				mensajeria = new FileSystemMensajeria();
				break;
			case "e":
				mensajeria = new EmailMensajeria();
				break;
			default:
				mensajeria = new DefaultMensajeria();
				break;
		}
		return mensajeria;
	}

}
