package es.cristian;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] notas = new int[5];

        Scanner entrada = new Scanner(System.in);

        System.out.println("MENÚ DE OPCIONES: ");
        System.out.println("1.- (Re)Cargar. ");
        for (int i = 0; i < notas.length; i++ ) {
            System.out.print("Número " + (i + 1) + ": ");
            notas[i] = entrada.nextInt();
        }
        System.out.println("2.- Mostrar. ");
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i]);
        }
        System.out.println("3.- Sumar. ");
        for (int i = 0; i < notas.length; i++) {

        }
    }
}
