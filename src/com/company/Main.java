package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);

        System.out.print("Input a number: ");

        int number = in.nextInt();

        int X = 1;
        int Y = 2;
        int Z = 3;

        if (number == 1) System.out.println("Данное значение имеется в константах");
        else if (number == 2) System.out.println("Данное значение имеется в константах");
        else if (number == 3) System.out.println("Данное значение имеется в константах");
        else System.out.println("Такой константы нет!");

    }
}
