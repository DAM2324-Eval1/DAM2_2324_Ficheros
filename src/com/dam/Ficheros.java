package com.dam;


import java.io.File;

public class Ficheros {

	public static void main(String[] args) {
		
		listarFicheros("D:\\PRUEBAS");
		
	}
	
	private static void listarFicheros(String ruta) {
		File rutaOrigen = new File(ruta);
		File[] elementos = rutaOrigen.listFiles();
		
		
//		for (int i=0; i< elementos.length; i++) {
//			
//			System.out.println(elementos[i].getName());
//			if (elementos[i].isDirectory()) listarFicheros(elementos[i].getAbsolutePath());
//				
//		}
		
		
		for (File file: elementos) {
			System.out.println(file.getName());
			if (file.isDirectory()) listarFicheros(file.getAbsolutePath());
	
		}
	}
	
}
