package 문자열.단어의개수_1152;

/**
 * 영어 대소문자와 공백으로 이루어진 문자열이 주어진다.
 * 이 문자열에는 몇 개의 단어가 있을까?
 * 이를 구하는 프로그램을 작성하시오.
 * 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
 *
 *  ex)
 *    The Curious Case of Benjamin Button
 *    6
 *    The first character is a blank
 *    6
 *
 *
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println(new StringTokenizer(br.readLine(), " ", false).countTokens());
    }
}
