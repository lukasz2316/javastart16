package pl.sda.javastart.day2;

import java.util.Scanner;

public class MethodseExample {
    public static void main(String[] args) {

        System.out.println("pole prostokąta jest równe ");
        int a = 4;
        int b = 6;
        int x = a * b;
        System.out.println(x);

        /*int result = rectanglearea(a, b);//odnosi do metody
        System.out.println(result);

        result = rectanglearea(6, 8);
        System.out.println(result);//użycie metody uzywając ponownie zmiennej result

        System.out.println(rectanglearea(4, 5));//użycie metody wewnątrz innej metody
        System.out.println(rectanglecircuit(4, 5));
        System.out.println(arithmetic(1, 2, 3, 8));
        System.out.println(arithmeticString(1, 2, 3, 8));
        System.out.println(convertStringToDouble("23"));

*/
        printCubesOfNumbers();
        //countdown();
    }

    public static int rectanglearea(int a, int b) {
        int result = a * b; //zmienna widoczna wewnątrz metody tylko

        return result;
    }

    public static int rectanglecircuit(int a, int b) {
        int result = 2 * a + 2 * b;
        return result;
    }

    public static int arithmetic(int a, int b, int c, int x) {
        int arith = a ^ (x) + b ^ (x + 1) + c ^ (x + 2);
        return arith;
    }

    public static String arithmeticString(int a, int b, int c, int x) {
        String arith = (a + "^(" + x + ")" + b + "^(" + (x + 1) + ")" + c + "^(" + (x + 2) + ")");
        return arith;

    }

    public static double convertStringToDouble(String text) {
        double value = Double.parseDouble(text);
        return value;
    }

    public static void printCubesOfNumbers() {
        int i, n;

        System.out.print("Input number of terms : ");
        Scanner userInput = new Scanner(System.in);
        n = userInput.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.println("Number is : " + i + " and cube of " + i + " is : " + (i * i * i));
        }
    }

    public static void countdown() {

        System.out.print("Input number of terms : ");
        Scanner userInput = new Scanner(System.in);
        int n = userInput.nextInt();

        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }


    }
}


