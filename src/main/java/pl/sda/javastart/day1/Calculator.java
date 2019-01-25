package pl.sda.javastart.day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("wprowadź pierwszą liczbę");
        Double firstValue = scanner.nextDouble();
        System.out.println("Wprowadź drugą liczbę");
        Double secondValue = scanner.nextDouble();
        System.out.println("a+b=" + (firstValue + secondValue));
        System.out.println("a-b=" + (firstValue - secondValue));
        System.out.println("a*b=" + (firstValue * secondValue));
        System.out.println("a/b=" + (firstValue / secondValue));

        System.out.println("Wartość bezwzgledna z odejmowania a i b=" + Math.abs(firstValue - secondValue));
        System.out.println("Wartość maksymalna to" + Math.max(firstValue, secondValue));
        System.out.println("Wartość min to" + Math.min(firstValue, secondValue));
        System.out.println("a^b=" + Math.pow(firstValue, secondValue));


    }

}
