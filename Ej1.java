package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int acumulador=0, minimo=0, maximo=0;
        System.out.println("Bienvenido, ingrese numeros hasta que se ingrese el numero 0: ");
        int numero = scanner.nextInt();
        minimo = numero;
        maximo = numero;

        while(numero != 0){
            if(numero < 0){
                acumulador = acumulador - Math.abs(numero);
            }else{
                acumulador = acumulador + numero;
            }

            if(numero<minimo){
                minimo = numero;
            }
            if(numero>maximo){
                maximo = numero;
            }
            System.out.println("Ingrese numeros hasta que se ingrese el numero 0: ");
            numero = scanner.nextInt();
        }

        System.out.println("La suma total es: " + acumulador);
        System.out.println("El numero mayor es: " + maximo);
        System.out.println("El numero menor es: " + minimo);
    }
}