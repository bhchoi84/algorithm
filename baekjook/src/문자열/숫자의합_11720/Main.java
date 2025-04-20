package 문자열.숫자의합_11720;

/**
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 *
 * 예시)
 * 5
 * 54321
 *
 * 25
 * 7000000000000000000000000
 *
 * ========================
 * 입력 2개 ( 줄바꿈 )
 *  1번째 : 총 갯수
 *  2번째 : 총 갯수만큼 loop 돌면서 합계
 *
 *
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = Integer.parseInt(scanner.next()); // 합계
        String[] nums = scanner.next().split("");
//        System.out.println(count);
//        System.out.println(nums);
//        System.out.println(nums.chars().count());
        for( int i=0; i<count; i++) {
            sum = sum + Integer.parseInt(nums[i]);
        }
        System.out.println(sum);
    }
}