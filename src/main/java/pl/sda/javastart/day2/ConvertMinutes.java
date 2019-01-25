package pl.sda.javastart.day2;

public class ConvertMinutes {


    public static void main(String[] args) {
        System.out.println(minutes(525600));

    }

    public static String minutes(int m) {

       int d = m / (60 * 24);
       int h = m / 60;
       int y = d / 365;

       String t = (m + " minut =" + h + " godzin " + d + " dni i " + y + " lat");
        return t;
    }
}