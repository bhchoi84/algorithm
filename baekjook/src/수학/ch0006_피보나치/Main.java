package 수학.ch0006_피보나치;

/**
 *  6
 *
 *  1,1,2,3,5,8,13,21
 *
 */
public class Main {

    public int pivonachi(int num) {
        if(num == 0) {
            return 0;
        } else if( num == 1 ) {
            return 1;
        } else {
            pivonachi(num-1);
        }
        return num;
    }

    public static void main(String[] args) {
        Main main = new Main();
        // 처음  = 0
        // 두번째 = 1
        // 세번째는 첫번재 + 두번째
        // 네번째 = 두번째 + 세번째
        System.out.println(main.pivonachi(4));
    }
}
