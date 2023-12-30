package org.example;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una oracion: ");
        String palabra = scanner.nextLine();

        char[] arrayString = palabra.toCharArray();

        if (arrayString.length == 0) {
            System.out.println("La cadena está vacía. No hay caracteres para analizar.");
            return;
        }

        char maxChar = arrayString[0];
        int maxCount = 1;

        for (int i = 0; i < arrayString.length; i++) {
            char characutual = arrayString[i];
            int contadoractual = 1;

            for (int j = i + 1; j < arrayString.length; j++) {
                if (arrayString[j] == characutual) {
                    contadoractual++;
                }
            }

            if (contadoractual > maxCount) {
                maxCount = contadoractual;
                maxChar = characutual;
            }
        }

        System.out.println("El carácter que más se repite es: " + maxChar + " y se repite: " + maxCount + " de veces");
    }
}