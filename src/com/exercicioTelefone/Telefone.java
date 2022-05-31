package com.exercicioTelefone;

import java.util.Scanner;

public class Telefone {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        String frase = scanner.nextLine();
        String resultado = "";

        char[] chars = frase.toUpperCase().toCharArray();
        for (char el: chars) {
            switch (el){
                case 'A':
                case 'B':
                    case 'C':
                    resultado += "2";
                    break;
                case 'D':
                case 'E':
                   case 'F':
                        resultado += "3";
                    break;
                case 'G':
                case 'H':
                    case 'I':
                    resultado += "4";
                    break;
                case 'J':
                case 'K':
                    case'L':
                    resultado += "5";
                    break;
                case 'M':
                case 'N':
                    case 'O':
                    resultado += "6";
                    break;
                case 'P':
                case 'Q':
                case 'R':
                    case 'S':
                    resultado += "7";
                    break;
                case 'T':
                case 'U':
                    case 'V':
                    resultado += "8";
                    break;
                case 'W':
                case 'X':
                case 'Y':
                    case 'Z':
                    resultado += "9";
                    break;
                case '1':
                case '-':
                case '0':
                    resultado += el;
                    break;
            }

        }

        System.out.println(resultado);
    }
}
