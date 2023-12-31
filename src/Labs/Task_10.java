package Labs;
import java.util.Arrays;

public class Task_10 {
    static double y = 1;
    public static void main(String[] args) {
        double[] order = {1,2,3,-1,4,-5,-6,7,8,9,10};
        Arrays.sort(order);
        double[][] results = makeAndFillArray(order);
        System.out.println("ALL POSSIBLE COMBINATIONS ARE: ");
        printOrder(results);
        System.out.println("\nTHE MINIMUM DIFFERENCE BETWEEN 'Y' AND AVERAGES IS: ");
        printMin(findMinDiff(results));
        System.out.println("THE MATCHING NUMBERS ARE: ");
        printNumbers(findNumbers(results));

    }

    static double[][] makeAndFillArray(double[]order) {
        double i, j, avrg, difference;
        double[] currentResult;
        int index = 0;
        int allCombos = (order.length-1)*(order.length-1);
        double[][] results = new double[allCombos][4];
        for (i = 0; i < order.length; i++) {
            for (j = 0; j < order.length; j++) {
                if (order[(int)j]!=order[(int)i]) {
                    avrg = (order[(int)i]+order[(int)j])/2.;
                    if (avrg>=y || avrg<0) {
                        difference = Math.abs(avrg-y);
                    } else {
                        difference = Math.abs(y-avrg);
                    }
                    currentResult = new double[]{order[(int)i], order[(int)j], avrg, difference};
                    for (int k = 0; k < results[0].length; k++) {
                        if (index>=allCombos) {
                            break;
                        } else {
                            results[index][k] = currentResult[k];
                        }
                    }
                    index++;
                }
            }
        }
        return results;
    }

    static double findMinDiff(double[][]results){
        double minDiff = results[0][3];
        for (double[] unit: results){
            if (unit[3]<minDiff) {
                minDiff = unit[3];
            }
        }
        return minDiff;
    }

    static int[][] findNumbers(double[][]results) {
        int count = 0;
        int[][] numbersOrder;
        for (double[] unit: results){
            if (unit[3]==findMinDiff(results)) {
                System.out.println(Arrays.toString(unit));
                count++;
//                numbersOrder = new int[count][2];
//                for (int i = 0; i < numbersOrder.length; i++) {
//                    numbersOrder[i][0] = (int)unit[0];
//                    numbersOrder[i][1] = (int)unit[1];
//                }

            }
        }
        numbersOrder = new int[(int)Math.round(count/2.)][2];
        int index = 0;
        for (double[] unit: results){
            if (unit[3]==findMinDiff(results)) {
                if (index>= numbersOrder.length) {
                    break;
                } else {
                    numbersOrder[index][0] = (int)unit[0];
                    numbersOrder[index][1] = (int)unit[1];
                    index++;
                }
            }
        }
        return numbersOrder;
    }

    static void printOrder (double[][]results){
        int index = 0;
        for (double[] unit: results){
            System.out.print(Arrays.toString(unit)+" ");
            index++;
            if (index%3==0){
                System.out.println();
            }
        }
    }

    static void printMin(double result){
        System.out.println(result);
    }

    static void printNumbers(int[][] result){
        System.out.println(Arrays.deepToString(result));
    }
}