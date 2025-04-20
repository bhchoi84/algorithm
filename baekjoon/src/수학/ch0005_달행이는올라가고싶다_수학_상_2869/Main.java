package 수학.ch0005_달행이는올라가고싶다_수학_상_2869;

/**
 * 땅 위에 달팽이가 있다. 이 달팽이는 높이가 V미터인 나무 막대를 올라갈 것이다.
 * 달팽이는 낮에 A미터 올라갈 수 있다. 하지만, 밤에 잠을 자는 동안 B미터 미끄러진다.
 * 또, 정상에 올라간 후에는 미끄러지지 않는다.
 * 달팽이가 나무 막대를 모두 올라가려면, 며칠이 걸리는지 구하는 프로그램을 작성하시오.
 * A B V
 *  V 기준
 *    ( V - A ) + B = 0
 *
 *
 *  https://st-lab.tistory.com/75
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
//    public int calc(int a, int b, int v) {
//        return (v - a) + b;
//    }
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);
//        int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//        int V = Integer.parseInt(st.nextToken());
//        Main main = new Main();
//        int day = 0;
//        int remain = V;
//        while(0<remain) {
//            if( 0 == (remain-A) ) {
//                ++day;
//                remain = 0;
//            } else if(0 < remain) {
//                ++day;
//                remain = (remain-A)+B;
//            } else {
//                remain = 0;
//            }
//        }
//        System.out.println(day);
//        int a = 3;
//        int b = 1;
//        int c = 7;
//        => 3 + 1

//        int a = 3;
//        int b = 1;
//        int c = 8;
//          => 4
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ", false);
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int day = (V-B) / (A-B);
        if(((V-B)%(A-B)) != 0){
            ++day;
        }
        System.out.println(day);
    }
}
