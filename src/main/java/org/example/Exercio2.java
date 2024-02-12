package org.example;

import java.util.Scanner;

public class Exercio2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);

        int n,resultado;
        System.out.println("colocar seu numero?");
        n = sc.nextInt();

        resultado=n%2;
        if(resultado==0){
            System.out.println("par");
        }else {
            System.out.println("impar");
        }
    }
}
