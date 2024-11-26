package chapter1;

import java.util.Scanner;

public class ProgramOne {
    public static void main(String[] args) {
        /*
        * Write a program that takes three integer command-line arguments and prints equal if all three are equal, and not equal otherwise
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert the number 1: ");
        int num1 = sc.nextInt();
        System.out.println("Insert the number 2: ");
        int num2 = sc.nextInt();
        System.out.println("Insert the number 3: ");
        int num3 = sc.nextInt();

        if(num1 == num2 && num2 == num3 ) {
            System.out.println("equal");
        } else {
            System.out.println("no equal");
        }

        sc.close();
    }
}
