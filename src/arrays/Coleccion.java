package arrays;

import java.util.Arrays;

class Coleccion{
	private double[][] vector;
	//constructor inicializa vector como una matriz
	//de filas y columnas (filas X columnas)
	public Coleccion(int filas, int columnas){
		this.vector = new double[filas][columnas];
	}
	
	/**
	 * @param vector
	 */
	public Coleccion(double[][] vector) {
		this.vector = vector;
	}
	//método que calcula el valor medio
	public double calcularValorMedio(){
		double valorMedio=0;
		//lógica
		double suma = 0;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				suma += vector[i][j];
			}
		}
		valorMedio = suma / (vector.length*vector[0].length);
		return valorMedio;
	}
	//método que cacula el máximo valor
	public double buscarValorMaximo(){
		double valorMaximo = vector[0][0];
		//lógica
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				if (vector[i][j] > valorMaximo)
					valorMaximo = vector[i][j];
			}
		}
		return valorMaximo;
	}
	//método que cacula el máximo valor
		public double buscarValorMinimo(){
			double valorMinimo = vector[0][0];
			//lógica
			for (int i = 0; i < vector.length; i++) {
				for (int j = 0; j < vector[i].length; j++) {
					if (vector[i][j] < valorMinimo)
						valorMinimo = vector[i][j];
				}
			}
			return valorMinimo;
		}
	
	//método que rellena el arrya de forma aleatoria
	//usamos Math.random() y un multiplicador
	public void rellenarColeccion(int multiplicador){
		//se rellano con Math.random()*multiplicador
		for (int i = 0; i < this.vector.length; i++) {
			for (int j = 0; j < this.vector[i].length; j++) {
				this.vector[i][j] = Math.random()*multiplicador;
			}
		}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		String vectorCadena="";
		//lógica
		for (int i = 0; i < this.vector.length; i++) {
			for (int j = 0; j < this.vector[i].length; j++) {
				vectorCadena+=this.vector[i][j]+"-";
			}
		}
		return vectorCadena.substring(0, vectorCadena.length()-1);
	}
	/**getter
	 * @return the vector
	 */
	public double[][] getVector() {
		return vector;
	}
	//método que convierte el array bidimensional en un array unidimensional
	//usamos la clase Arrays para ordenar el array unidimensional
	//hacemos calculos estadisticos
	public void calcularValoresEstadisticos(){
		int tamano= vector.length*vector[0].length;
		double [] vectorUnidimensional= new double [tamano];
		int contador=0;
		for (double[]ds :vector){
			for (double d :ds){
				vectorUnidimensional[contador]=d;
				contador ++;
			}
		}
		Arrays.sort(vectorUnidimensional);
		System.out.printf("Valor más grande: %.2f y el más pequeño %.2f%n",vectorUnidimensional[vectorUnidimensional.length-1],vectorUnidimensional[0]);
		}



	}
