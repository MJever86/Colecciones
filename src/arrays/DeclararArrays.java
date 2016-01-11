package arrays;

public class DeclararArrays {

	public static void main(String[] args) {
		//Declarar el primer array (de enteros)
		//Creamos la referencia
		int[]referenciaEnteros;
		//Creamos el array
		referenciaEnteros= new int [3];
		//inicializamos los datos
		referenciaEnteros[0]=12;
		referenciaEnteros[1]=13;
		referenciaEnteros[2]=14;
		//referenciaEnteros[4]=15; esa posicion no existe
		for (int i = 0; i < referenciaEnteros.length; i++) {
			System.out.println("Valor "+i+": "+referenciaEnteros[i]);

		}
		//Declaramos y creamos el array
		double[] referenciaDoubles = new double [3];
		//referenciaDoubles={1,2,3}; esto no funciona
		//inicializamos los valores
		referenciaDoubles[0]=12.1;
		referenciaDoubles[1]=12.2;
		referenciaDoubles[2]=12.3;
		
		//recorremos el array
		for (int i = 0; i < referenciaDoubles.length; i++) {
			System.out.printf("Valor %d: %.2f%n",i,referenciaDoubles[i]);
		}
		//Declaramos, creamos e inicializamos el array
		String[] referenciaCadenas= {"Hola"," ","mundo"};
		//recorremos el array
		for (int i = 0; i < referenciaCadenas.length; i++) {
			System.out.print(referenciaCadenas[i]);
		}
		System.out.println();//salto de línea
		//creamos e inicializamos array boolean
		boolean[] referenciaBoolean = {true, false, true, true};
		for (int i = 0; i < referenciaBoolean.length; i++) {
			System.out.printf("%b ", referenciaBoolean[i]);
		}
		System.out.println();//salto de línea
		//recorremos el array con un bucle mejorado
		for(String cadena: referenciaCadenas){
			System.out.print(cadena);
		}
		System.out.println();//salto de línea
		for (boolean b : referenciaBoolean) {
			System.out.printf("%b ", b);
		}
		
		
	}

}
