package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numeberint =0;

        System.out.println("coloque numero para verificação");

        numeberint = sc.nextInt();

        if (numeberint <0){
            System.out.println("negativo");
        }else {
            System.out.println("não negativo");
        }
    }
}