/*
Заполнить двумерный массив единицами и нулями таким образом,
чтобы единицы размещались так, как размещаются на шахматной доске черные поля,
а нули — как белые поля. Левое нижнее поле на шахматной доске всегда черное. Задачу решить:
а) при четном значении n.
б) при нечетном значении n.
 */
package TwoDArrays;

import java.util.Arrays;

public class Task12_26 {
    //работает при любых значениях
    static int n = 8;

    public static void main(String[] args) {
        int[][] arr = new int[n][n];
        int lastIndexY = arr.length-1;
        for (int i = lastIndexY; i >= 0; i--) {
            if ((arr.length-i)%2!=0){
                for (int j = 0; j < arr[0].length; j+=2) {
                    arr[i][j] = 1;
                }
            } else {
                for (int j = 1; j < arr[0].length; j+=2) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int[] unit: arr){
            System.out.println(Arrays.toString(unit));
        }
    }
}
