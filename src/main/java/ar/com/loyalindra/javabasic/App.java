package ar.com.loyalindra.javabasic;

public class App 
{
    public static void main( String[] args )
    {
        //clases
    	Auto megane = new Auto(
    			"Renault",
    			"Megane",
    			2023,
    			"Rojo",
    			12345L);//crtl+space
    	
    	megane.mostrarInformacion();

    	//objetos instancia de una clase.
    	//invocar un metodo
    	//emcapsulamiento
    	//herencia
    	//p.o.o
    	//polimorfismo
    	System.out.println(megane);
    	
    	Vehiculo v = new Auto(
    			"Renault",
    			"Megane",
    			2023,
    			"Rojo",
    			12346L);
    	
    	Auto a = (Auto)v;
    	
        //abstraccion
        //interfaces
    	
    	/*Vehiculo v2 = new Vehiculo(
    			2023,
    			"Renault",
    			"Megane");*/
    	
    	Tuneable t = new Auto(
    			"Renault",
    			"Megane",
    			2023,
    			"Rojo",
    			12346L);
    	
    	Auto at =(Auto)t;
    	
    	Vehiculo vIna = (Vehiculo)at; 
    			
    }
}
