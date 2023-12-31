package Labs;

import java.util.Arrays;

public class Task_07 {
    public static void main(String[] args) {
        //Объявление и инициализация
        int[] arr = {-1,-1,-1,-1,5,5,5,-7,6,6,6,6,-3,1,2,3,4,5,-5,9,8,7,6,5,4};
        printOrder(arr);
        System.out.print("NUMBER OF POSITIVE SUBSEQUENCES IS: ");
        printResult(findSequenceCount(arr));
        System.out.print("THE LENGTHS OF SUBSEQUENCES ARE: ");
        printLengths(subLengths(arr));
        System.out.print("THE SEQUENCES ARE: ");
        System.out.println(Arrays.deepToString(newSubs(subLengths(arr),arr)));
        System.out.print("THE LARGEST SUBSEQUENCE IS: ");
        printLargest(findMax(newSubs(subLengths(arr),arr)));

    }

    static int findSequenceCount(int[] arr) {
        int sequenceCount = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]>0) {
                sequenceCount++;
                for (int j = i; j < arr.length; j++) {
                    if (arr[j]<=0) {
                        i=j;
                        break;
                    } else {
                        i=j;
                    }
                }
            }
        }
        return sequenceCount;
    }

    static int[] subLengths(int[] arr) {
        int[] sequences = new int[findSequenceCount(arr)];
        int k = 0;
        for (int i = 0; i< arr.length; i++){
            int count = 0;
            if (arr[i]>0) {
                for (int j = i; j < arr.length; j++) {
                    if (arr[j]<=0) {
                        i=j;
                        break;
                    } else {
                        count++;
                        sequences[k] = count;
                        i=j;
                    }
                }
                k++;
            }
        }
        return sequences;
    }

    static int[][] newSubs (int[]sequences, int[] arr) {
        int[][] subs = new int[sequences.length][];
        int index = 0;
        for (int i = 0; i < subs.length; i++) {
            subs[i] = new int[sequences[i]];
            int count = subs[i].length;
            for (int j = 0; j < count; j++) {
                subs[i][j] = makePositiveOrder(arr)[index];
                index++;
            }
        }

        return subs;
    }

    static int[] makePositiveOrder(int[] arr) {
        int count = 0;
        for (int unit: arr) {
            if (unit>0) {
                count++;
            }
        }
        int[] newOrder = new int[count];
        int index = 0;
        for (int unit: arr) {
            if (unit>0) {
                newOrder[index] = unit;
                index++;
            }
        }
        return newOrder;
    }

    static int[] findMax (int[][] newSub) {
        int[] max = newSub[0];
        for (int[] unit : newSub) {
            if (unit.length>max.length) {
                max = unit;
            }
        }
        return max;
    }

    static void printOrder(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void printLengths(int[] sequences) {
        System.out.print(Arrays.toString(sequences)+"\n");
    }

    static void printResult (int result) {
        System.out.print(result+"\n");
    }

    static void printLargest (int[] result) {
        System.out.print(Arrays.toString(result) +"\n");
    }
}