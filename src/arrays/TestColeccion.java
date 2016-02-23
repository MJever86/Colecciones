package arrays;


public class TestColeccion {

	public static void main(String[] args) {
		Coleccion c1 = new Coleccion(3,4);
		//se rellena de 0.0
		System.out.println(c1);
		//lo rellenamos de forma aleatoria
		c1.rellenarColeccion(15);
		System.out.println(c1);
		//obtengo la propiedad vector que es 
		//del tipo double [][]
		double[][]valores =c1.getVector();
		//recorro el array y formateo
		for (int i = 0; i < valores.length; i++) {
			for (int j = 0; j < valores[i].length; j++) {
				System.out.printf("%8.2f", valores[i][j]);
			}
			System.out.println();
		}
		//Vamos a imprimir los valores máximos y mínimos
		//de la colección y el valor medio
		System.out.printf("Valor medio %.2f, valor máximo %.2f y valor mínimo %.2f%n",c1.calcularValorMedio(),c1.buscarValorMaximo(),c1.buscarValorMinimo());
		//usamos el segundo constructor
		double [][] vector = {{1,2,3},{4,5,6}};
		Coleccion c2 = new Coleccion(vector);
		System.out.printf("Valor medio %.2f, valor máximo %.2f y valor mínimo %.2f%n",c2.calcularValorMedio(),c2.buscarValorMaximo(),c2.buscarValorMinimo());

	}
}
