package Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class EjemploLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos una lista de cadenas (String)
		List<String> listaCadenas= new ArrayList<String>();
		//añadimos mediante Scanner 
		Scanner sc= new Scanner (System.in);
		System.out.println("Introduce cadenas de texto (fin para acabar)");
		String cadena= sc.next();
		while (!cadena.toLowerCase().equals("fin")){
			
			listaCadenas.add(cadena);
			cadena= sc.next();
		}
		//cierro el Scanner
		sc.close();
		//conocemos el contenido de la lista
		System.out.println(listaCadenas);//funciona, no da posición de memoria
		System.out.println("Número de palabras: "+listaCadenas.size());
		System.out.println("¿Contiene a Pedro? "+listaCadenas.contains("Pedro"));
		if (listaCadenas.contains("Pedro"))
			System.out.println("Está en la posición: "+listaCadenas.lastIndexOf("Pedro"));
		if (listaCadenas.size()>0)
			System.out.println("Primera palabra: "+listaCadenas.get(0));
		//recorremos la lista e imprimimos las palabras en una unica linea
		//Forma 1:clásica
		for (int i=0;i<listaCadenas.size();i++){
			System.out.println(listaCadenas.get(i));
		}
		//Forma 2: bucle mejorado
		for (String string:listaCadenas){
			System.out.println(string);
		}
		//Forma 3: java 8
		listaCadenas.forEach(System.out::println);
	}
}
	
