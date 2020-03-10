import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        StringGenerator sg = new StringGenerator();
        Random number = new Random();
        Scanner read = new Scanner(System.in);
//        System.out.print("input some number: ");
//        int myBoy = read.nextInt();
        sg.paliondromeGenerator(13);
        long endTime = System.nanoTime();
        long duration = (endTime-startTime)/1000000;
        System.out.println(duration+"ms");
    }
}
