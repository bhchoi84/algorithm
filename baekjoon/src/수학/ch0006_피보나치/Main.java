package 수학.ch0006_피보나치;

import java.util.Scanner;
import java.util.stream.IntStream;

/**
 *  6
 *
 *  1,1,2,3,5,8,13,21
 *
 */
public class Main {

    public int fibonacci(int num) {
        if(num<=1) {
            return num;
        } else {
            return fibonacci(num-2) + fibonacci(num-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        int num = Integer.parseInt(sc.next());
        for( int i=1; i<=num;i++) {
            System.out.println(main.fibonacci(i));
        }
    }
}
