package pl.sda.javastart.day2;

public class CheckNumbersAndPrintFew {
    public static void main(String[] args) {
        System.out.println(checkWhichIsBigger(3, 4, 5));
    }

    public static int checkWhichIsBigger(int a, int b, int c) {
        int largest = Math.max(a, Math.max(b, c));
        return largest;
    }
    public static void printFewNumbers(int a){}

}




        /*for(int i = 0; i < 100; i++) {
            if(i == 9){
                break;
            }
            System.out.println(i); //wyświetlone zostaną elementy do 8*/

