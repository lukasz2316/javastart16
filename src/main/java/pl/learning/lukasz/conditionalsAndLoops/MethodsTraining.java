package pl.learning.lukasz.conditionalsAndLoops;

import java.util.Scanner;

public class MethodsTraining {
    public static void main(String[] args) {

        //sumDigitsOfNumber();
       // bmiCounter();
        checkIfEven();
    }

    public static int rectField(int a, int b) {
        int result = a * b;
        return result;
    }

    public static int rectCircuit(int a, int b) {
        int result = 2 * a + 2 * b;
        return result;
    }

    public static double inchToMeter(double inch) {
        double result = inch * 0.0254;
        return result;
    }

    public static String minutesToDate(int minutes) {
        int hours = minutes / 60;
        int days = hours / 24;
        int years = days / 365;
        String date = minutes + " minut to " + hours + " godzin " + days + " dni " + years + " lat ";
        return date;
    }

    public static void sumDigitsOfNumber() {//todo zapętlić program
        Scanner userInput = new Scanner(System.in);
        System.out.println("wprowadz 3cyfrową liczbę");
        int number = userInput.nextInt();
        int length = String.valueOf(number).length();

        if (length == 3) {
            int first = number % 1000 / 100;
            int second = number % 100 / 10;
            int third = number % 10;
            int sum = first + second + third;
            System.out.println("Suma to " + sum);

        } else if (length == 2) {
            System.out.println("Wprowadziłeś dwucyfrową baranie");
            int first = number % 100 / 10;
            int second = number % 10;
            int sum = first + second;
            System.out.println("Ale suma to " + sum);

        } else if (length == 1) {
            System.out.println("Suma cyfr " + number + "to" + number + "geniuszu");
        } else System.out.println("Nie umim dodać więcej niż trzech");

    }

    public static void bmiCounter() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Wprowadz Wagę");
        double weight = userInput.nextDouble();
        System.out.println("A teraz wzrost");
        double height = userInput.nextDouble();
        double heightPow = Math.pow(height,2);
        double result = (weight/heightPow)/100;
        System.out.println(result);

    }
    public static void checkIfEven() {
        Scanner userInput = new Scanner(System.in);
        int i = 1;
        while (i!=0) {
            System.out.println("Podaj liczbę");
            int number = userInput.nextInt();

            if (number % 2 == 0) {
                System.out.println("Liczba jest parzysta");
            } else System.out.println("Nie parzysta");

        }
    }

}
