package pl.sda.javastart.day1;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world");
        // Instantiate a Date object
        Date date = new Date();

        // display time and date using toString()
        System.out.println(date.toString());

//        poniżej występuje konkatenacja
        int number = 100;
        System.out.println("number " + number);

        char alpha = '\u03B1';
        System.out.println(alpha);
//zadanie 2 slack
        System.out.println(2 + 3);
        System.out.println(2 - 4);
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5.0 / 2.0);
        System.out.println(100L - 10);
        System.out.println(2f - 3);
        System.out.println(5f / 2);
        System.out.println(5d / 2);
        System.out.println('A' + 2);
        System.out.println('a' + 2);
        System.out.println("a" + "b");
        System.out.println("a" + 'a');
        System.out.println("a" + 'b' + 3);
        System.out.println("a" + 'b' + 3);
        System.out.println("a" + 'b' + 3);
        System.out.println("a" + 'b' + 3);
        System.out.println("a" + 'b' + 3);
        System.out.println("a" + 'b' + 3);
        System.out.println("a" + 'b' + 3);
//zadanie 1 slack - /n przej
        System.out.println("Adam");
        System.out.println("Kuba");
        System.out.println("Jaroslaw");
        System.out.println("\\Jaroslaw\nMarek\nAnna");
        System.out.println("adam"+ 4 + false);

        System.out.println(false==false);
        System.out.println(false != true);
        System.out.println(!true);
        System.out.println(2>4);
        System.out.println(3<5);
        System.out.println(3 == 3 && 3 == 4);
        System.out.println(3 != 5 || 3 == 5);
        System.out.println((2+4) > (1+3));
        System.out.println("cos".equals("cos"));
        System.out.println("cos" =="cos");
        System.out.println("cos" == new String("cos"));


        //wprowadzanie danych














            }

}
