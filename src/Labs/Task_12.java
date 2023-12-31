package Labs;

import java.util.Arrays;

public class Task_12 {
    static int[] order = {2,4,3,11,7,6};

    public static void main(String[] args) {
        printResult();
    }

    static boolean areAllEven(int[]order){
        for (int unit:order){
            if (unit%2!=0){
                return false;
            }
        }
        return true;
    }

    static void swap (int[]order){
        int temp;
        for (int i = 0; i < order.length/2; i++) {
            temp = order[i];
            order[i] = order[order.length-1-i];
            order[order.length-1-i] = temp;
        }
    }

    static void nullifyOdds(int[]order){
        for (int i = 0; i < order.length; i++) {
            if (order[i]%2!=0){
                order[i]=0;
            }
        }
    }

    static void printResult(){
        if (areAllEven(order)){
            swap(order);
            System.out.println(Arrays.toString(order));
        } else {
            nullifyOdds(order);
            System.out.println(Arrays.toString(order));
        }
    }
}
