package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Execicio5 {

    public static void main(String[]args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double precofinal;

        System.out.println("coloque o codigo");
        codigo =sc.nextInt();
        System.out.println("coloque a quantidade");
        quantidade =sc.nextInt();

        if(codigo == 1){
            precofinal=4.00*quantidade;
            System.out.printf("R$ %.2f%n",precofinal);
        }

        if (codigo ==2){
            precofinal=4.50*quantidade;
            System.out.printf("R$ %.2f%n",precofinal);
        }

        if (codigo ==3){
            precofinal=5.00*quantidade;
            System.out.printf("R$ %.2f%n",precofinal);
        }

        if (codigo ==4){
            precofinal=2.00*quantidade;
            System.out.printf("R$ %.2f%n",precofinal);
        }

        if (codigo ==5){
            precofinal=1.50*quantidade;
            System.out.printf("R$ %.2f%n",precofinal);
        }
    }
}
