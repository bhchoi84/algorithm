package greedy.ch0001_동전교환;

/**
 * 당신은 음식점의 계산을 도화주는 점원입니다.
 * 카운터에는 거스름돈으로 사용할 500, 100, 50, 10원짜리 동전히 무한히 존재
 * 손님에게 거슬러 주어야할 돈이 N원일때 거슬러 주어야 할 돈전 최소 개수를 구하시오
 * 단, 거슬러 줘야 할 돈 N은 항상 10의 배수입니다.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int remain = Integer.parseInt(sc.next());// 받은돈
//        int fivehundred = (remain / 500);
//        int hundred = (remain - (fivehundred*500)) / 100;
//        int fifty = (remain - ((fivehundred*500) + (hundred*100))) / 50;
//        int ten = ( remain - ( (fivehundred*500) + (hundred*100) + (fifty*50))) / 10;
//        System.out.println(fivehundred+hundred+fifty+ten);
        int count = 0;
        int[] coins = new int[]{500,100,50,10};
        for( int c : coins) {
            count += remain / c; // 5
            remain %= c;
        }
        System.out.println(count);
    }
}