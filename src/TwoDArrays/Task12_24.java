package TwoDArrays;
/*
//a
[1, 1, 1, 1, 1, 1]
[1, 2, 3, 4, 5, 6]
[1, 3, 6, 10, 15, 21]
[1, 4, 10, 20, 35, 56]
[1, 5, 15, 35, 70, 126]

//b
[1, 2, 3, 4, 5, 6]
[2, 3, 4, 5, 6, 1]
[3, 4, 5, 6, 1, 2]
[4, 5, 6, 1, 2, 3]
[5, 6, 1, 2, 3, 4]
[6, 1, 2, 3, 4, 5]
 */
import java.util.Arrays;

public class Task12_24 {
    public static void main(String[] args) {
        //a
        int[][] order = new int[6][6];
        for (int i = 1; i < order.length; i++) {
            Arrays.fill(order[i],1);
            for (int j = 1; j < order.length; j++) {
                order[i][j] = order[i-1][j]+order[i][j-1];
            }
            System.out.println(Arrays.toString(order[i]));
        }

        //b
        System.out.println();
        for (int i = 0; i < order.length; i++) {
            Arrays.fill(order[i],0);
            for (int j = 0; j < order.length-i; j++) {
                order[i][j] = i+j+1;
            }
        }
        for (int i = order.length-1,k = 0; i > 0; i--, k++) {
            for (int j = order.length-1; j > k; j--) {
                order[i][j] = j-k;
            }
        }

        for (int[] unit: order){
            System.out.println(Arrays.toString(unit));
        }
    }
}
