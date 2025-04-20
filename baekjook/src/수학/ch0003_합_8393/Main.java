package 수학.ch0003_합_8393;

/**
 * n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
 *
 */
import java.util.Scanner;
import java.util.stream.IntStream;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = IntStream.rangeClosed(0, Integer.parseInt(sc.next())).sum();
        System.out.println(sum);
    }
}
