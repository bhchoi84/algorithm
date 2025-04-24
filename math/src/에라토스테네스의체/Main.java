package 에라토스테네스의체;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 약수 : 나누어 떨어지게 하는 수
 *  6의 약수 =
 *   = 1 * 2 * 3
 *   = 1 * 6
 *   = 2 * 3
 *
 * 소수 : prime number
 * 1과 자기 자신의 수를 제외하고 더이상 나누어지는 수가 없는 수
 *
 * 1 * 2 = 2
 * 1 * 3 = 3
 * 1 * 5
 *
 * 1개의 입력 값을 받았을때 약수만을 출력하라
 *
 * 단) 입력값은  2 <= i
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.next()); // 입력
        boolean[] isPrime = new boolean[num+1]; // start : 2  ~ 입력수 까지 index가 2부터 올라가는 수
        Arrays.fill(isPrime, true); // 0 ~ 입력 받은 수 모두 소수로 처리
        isPrime[0] = isPrime[1] = false; // 0, 1은 소수가 아니다.
        /**
         * num = 22로 가정
         *
         * loop(횟수)    i(소수 판별값 )       i*i      1*1<=num      앞 처리가 끝난뒤 i++값
         * 1            2                   4        4 < 22       3
         * 2            3                   9        9 < 22       4
         * 3            4                   16       16 < 22      5
         * 4            5                   22       22 < 22      조건에 안맞아 안옴
         *
         * 숫자      변수               값
         * 0        isPrime[0]         false
         * 1        isPrime[1]         false
         * 2        isPrime[2]         true
         * 3        isPrime[3]         true
         *
         * */
        for(int i=2; i*i<=num; i++) {   // 조건이 4(2배수), 9(3배수), 16(4배수) ... 이렇게 올라가므로
            if(isPrime[i]) { // 초기화된 2 ~ 입력값까지는 모두 true

            }
        }



    }
}
