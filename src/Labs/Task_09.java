package Labs;
/*
Дана последовательность чисел. Определить число элементов
этой последовательности, не превышающих среднего арифметического положительных элементов.
 */
import java.util.Arrays;

public class Task_09 {
    public static void main(String[] args) {
        int[] order = {-1,1,-2,-5,2,-3,3,4,5};
        Arrays.sort(order);
        System.out.println(Arrays.toString(order));

        printResult(posAvrg(order));
        printResult(lessThanAvrg(order, posAvrg(order)));


    }

    static int posAvrg(int[]order){
        int count = 0;
        int sum = 0;
        int average;
        for (int unit : order){
            if (unit>0){
                count++;
                sum+=unit;
            }
        }
        average = sum/count;
        return average;
    }

    static int lessThanAvrg(int[]order, int avrg){
        int result = 0;
        for (int unit : order){
            if (unit<avrg){
                result++;
            }
        }
        return result;
    }

    static void printResult(int result){
        System.out.println(result);
    }
}
