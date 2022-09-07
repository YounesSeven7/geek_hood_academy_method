package com.company;

import java.util.Scanner;

public class Calculator {
    static int a, b;
    static Scanner scanner;
    static void showOperation() {
        scanner = new Scanner(System.in);
        int calculator;
        int intResult = 0;
        double doubleResult = 0;
        a = 0; b = 0;
        System.out.print("1\\ addition (+) " +
                "2\\ subtraction (-)" +
                " 3\\ multiplication (*)" +
                "  4\\ division (a/b)" +
                "   5\\ square root (a^(1/2))" +
                "    6\\ squaring (y^2)" +
                "     7\\ y^n " + " \n chose operation: ");
        calculator = scanner.nextInt();
        while (calculator > 7 || calculator < 1) {
            System.out.print("You can't fool me, chose operation :");
            calculator = scanner.nextInt();
        }
        switch (calculator) {
            case 1:
                intResult = addition();
                break;
            case 2:
                intResult = subtraction();
                break;
            case 3:
                intResult = multiplication();
                break;
            case 4:
                intResult = division();
                break;
            case 5:
                doubleResult = squareRoot();
                break;
            case 6:
                intResult = squaring();
                break;
            case 7:
                doubleResult = pow();
                break;
        }
        if (calculator == 5 || calculator == 7)
            System.out.println("result = " + doubleResult);
        else
            System.out.println("result = " + intResult);


    }

    static void getAAndB() {
        System.out.print("enter the first number: ");
        a = scanner.nextInt();
        System.out.print("enter the second number: ");
        b = scanner.nextInt();
    }

    static void getA() {
        System.out.print("enter number:");
        a = scanner.nextInt();
    }

    static int addition() {
        getAAndB();
        return a + b;
    }

    static int subtraction() {
        getAAndB();
        return a - b;
    }

    static int multiplication(){
        getAAndB();
        return a * b;
    }

    static int division() {
        getAAndB();
        while (b == 0) {
            System.out.print("second number can not be 0, enter the second number: ");
            b = scanner.nextInt();
        }
        return a / b;
    }

    static double squareRoot() {
        getA();
        while (a < 0) {
            System.out.print("you can not enter negative number, enter number:");
            a = scanner.nextInt();
        }
        return Math.sqrt(a);
    }

    static int squaring() {
        getA();
        return (int) Math.pow(a, 2);
    }

    static double pow() {
        getAAndB();
        return  Math.pow(a, b);
    }
}
