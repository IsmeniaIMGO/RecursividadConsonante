package Consonante.test;

import java.util.ArrayList;

public class PruebaConsonante {
	
	static String mensaje = "hola";

	public static void main(String[] args) {
		//creamos una lista vacia
		ArrayList<Character> consonantes = new ArrayList<Character>();
		//llamamos al metodo
		buscarConsonante(0, consonantes);	
		//imprimimos el metodo
		System.out.println("\n"+"Consonantes: "+consonantes+"\n");
	}
	/**
	 * 22. Metodo que devuelve solamente las consonantes de una cadena de caracteres.
	 * @return
	 */
	public static ArrayList<Character> buscarConsonante(int i, ArrayList<Character> consonantes ){
		
		//caso base
		if (i == mensaje.length()) {
			return consonantes;	
		//caso recursivo
		}else {
			//capturo el caracter en posicion i
			Character letra = mensaje.charAt(i);
			//verificar que el caracter capturado sea consonante
			if (esConsonante(letra)) {
				consonantes.add(letra);//si es consonante, lo agrego a una lista
				buscarConsonante(i+1, consonantes);//llamo el mismo metodo para que siga con el siguiente caracter
			}else {
				buscarConsonante(i+1, consonantes);//llamo el mismo metodo para que siga con el siguiente caracter
			}
		}	
		return consonantes;	
	}
	/**
	 * Metodo que verifica si una letra es consonante
	 * @param letra
	 * @return true or false
	 */
	private static boolean esConsonante(char letra) {
		//que si la letra recibida tiene uno de estas consonantes sin importar si es mayuscula o minuscula
		return "bcdfghjklmn�pqrstvwxyz".contains(String.valueOf(letra).toLowerCase());
	}
}
