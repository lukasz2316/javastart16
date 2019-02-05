package pl.learning.lukasz.conditionalsAndLoops;

import java.util.Scanner;

public class ScannerBot {
    public static void main(String[] args) {
        chating();
    }



    public static void chating()

    {
        System.out.println("Jak się czujesz");
        Scanner userInput = new Scanner(System.in);
        String being = userInput.nextLine();
        System.out.println("Widzę że czujes się " + being);
        System.out.println("Jak masz na imię");
        String name = userInput.nextLine();
        System.out.println("Ile masz lat");
        String age = userInput.nextLine();
        System.out.println(name +"masz " + age +" lat");
        System.out.println("Ile masz wzrostu");
        String height = userInput.nextLine();
        System.out.println(name+ " masz " + height + "wzrostu");
        System.out.println("Jak się teraz czujesz?");
        String self = userInput.nextLine();
        System.out.println("Widzę że czujesz się " + self);


    }
}
