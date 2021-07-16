
public class Principal {
static int numerador =10;
static Integer denominador= 1;
static float division;

public static void main(String[] args) {
	try {
		System.out.println("Antes de la division");
	division= numerador / denominador;
	System.out.println("despues de la div");
	} catch ( ArithmeticException e) {
		System.out.println("el denominador debe ser mayor a 0");
		System.out.println("Error "+ e);
	} catch(NullPointerException ex) {
		System.out.println("hola Kevin "+ ex);
	} finally {
		 System.out.println("Toma awa");
	}
	//for each en java
	
	String Frutas[]= {"Mango", "Pera", "Manzana", "Banana"};
	for (String fruta: Frutas) {
		System.out.println(fruta);
	}
	
}
}
