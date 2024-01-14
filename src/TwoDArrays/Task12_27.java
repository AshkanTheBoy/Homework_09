package TwoDArrays;

import java.util.Arrays;

public class Task12_27 {

    static int m = 10;
    static int n = 10;
    static int[][] twoDArr = new int[m][n];
    static int[] arr = new int[m*n];

    public static void main(String[] args) {
        fillArr(arr);
        fill2DArr(twoDArr);
        printArrs(arr,twoDArr);

    }

    static int[] fillArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        return arr;
    }

    static int[][] fill2DArr(int[][] twoDArr){
        int index = 0;
        for (int i = 0; i < twoDArr.length; i++) {
            for (int j = 0; j < twoDArr[0].length; j++) {
                twoDArr[i][j] = arr[index++];
            }
        }
        return twoDArr;
    }

    static void printArrs(int[] arr, int[][] twoDArr){
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int[] unit: twoDArr){
            System.out.println(Arrays.toString(unit));
        }
    }
}
