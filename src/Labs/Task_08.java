package Labs;

import java.util.Arrays;

public class Task_08 {
    public static void main(String[] args) {
        int[] order = {1,2,2,2,3,3,4,5,3,4,4,5,2,2,5,6};
        Arrays.sort(order);
        System.out.println(Arrays.toString(order));
        printResult(findRepeats(order));

    }

    static int[] findRepeats(int[] order) {
        int count = 0;
        for (int i = 0; i < order.length-1; i++) {
            if (order[i]==order[i+1]) {
                count++;
            }
            while (i< order.length-1 && order[i]==order[i+1]) {
                i++;
            }
        }
        int[] repeatsOrder = new int[count];
        int index = 0;
        for (int i = 0; i < order.length-1; i++) {
            if (order[i]==order[i+1]) {
                repeatsOrder[index] = order[i];
                index++;
            }
            while (i< order.length-1 && order[i]==order[i+1]) {
                i++;
            }
        }
        return repeatsOrder;
    }

    static void printResult(int[] result){
        System.out.println(Arrays.toString(result));
        System.out.println(result.length);
    }
}
