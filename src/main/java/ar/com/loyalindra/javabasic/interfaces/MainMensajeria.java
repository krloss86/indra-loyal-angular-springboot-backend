package ar.com.loyalindra.javabasic.interfaces;

public class MainMensajeria {

	public static void main(String[] args) {
		//instanciar los mensajeros 
		
		IMensajeria mensaje1 = MensajeriaBuilder.crearMensajeria("d");
		IMensajeria mensaje2= MensajeriaBuilder.crearMensajeria("e");
		IMensajeria mensaje3 = MensajeriaBuilder.crearMensajeria("f");
		IMensajeria mensaje4 = MensajeriaBuilder.crearMensajeria("nana");
		
		Cartero cartero = new Cartero("Juan");
		cartero.agregarMensaje(mensaje1);
		cartero.agregarMensaje(mensaje2);
		cartero.agregarMensaje(mensaje3);
		cartero.agregarMensaje(mensaje4);
		
		String mensajeRandom = "hola soy un mensaje";
		
		System.out.println(cartero.getNombre() + " enviando mensajes:");
		cartero.despachar(mensajeRandom);
	}

}
