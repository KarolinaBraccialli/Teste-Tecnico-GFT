package com.exercicioTriangulo;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        int lado1, lado2, lado3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do primeiro lado: ");
        lado1 = scanner.nextInt();
        System.out.println("Digite o valor do segundo lado: ");
        lado2 = scanner.nextInt();
        System.out.println("Digite o valor do terceiro lado: ");
        lado3 = scanner.nextInt();

        if (lado1 < lado2+lado3 && lado2 < lado1+lado3 && lado3 < lado1+lado2){
            if (lado1 == lado2 && lado2 == lado3){
                System.out.println("Triangulo Equilátero.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("Triângulo isóceles.");
            } else{
                System.out.println("Triângulo escaleno.");
            }
        } else {
            System.out.println("Não é triângulo.");
        }


    }
}
