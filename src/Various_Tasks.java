import java.util.Arrays;
/*
Удалить повторяющиеся элементы из массива.+
Найти второй (после максимального) по величине элемент массива.+
Найти все пары элементов массива, чья сумма равна заданному числу.+
Дано два массива, элементы которых неупорядочены. Сравнить эти два массива.-
Найти отсутствующее в массиве число.+
Переместить все нулевые элементы в конец массива, не изменяя при этом порядок остальных элементов.+
Вывести самую длинную последовательность чисел в массиве, в которой каждый последующий элемент больше
предыдущего на единицу. Исходный массив не отсортирован.+
Найти мажоритарный элемент массива. Мажоритарным назовем такой элемент, число повторений которого в массиве
равно n/2, где n - длина массива.+
Вывести все элементы-лидеры в массиве. Лидером назовем такой элемент, который больше всех элементов справа от него.+
 */
public class Various_Tasks {
    static int[] order = {0,1,2,3,4,5,6,7};

    static int sum0 = 6;

    public static void main(String[] args) {
        //1
//        Arrays.sort(order);
//        System.out.println(Arrays.toString(order));
//        printResult(uniqueNums(countRepeats(order)));

        //2
//        printResult(findSecondMax(order, findMax(order)));

        //3
//        Arrays.sort(order);
//        int[] newOrder = uniqueNums(countRepeats(order));
//        System.out.println(Arrays.toString(newOrder));
//        printResult(makeAndFillArray(newOrder));

        //4 - skip
        //5
//        double[] order = {4,8,12,16,2,6,10,14,20};
//        System.out.println("INITIAL ORDER: "+Arrays.toString(order));
//        Arrays.sort(order);
//        System.out.println("SORTED ORDER: "+Arrays.toString(order));
//        System.out.println("REQUIRED DIFFERENCE: "+ getDifference(order));
//        double[] realOrder = getRealOrder(order);
//        System.out.println("REQUIRED SEQUENCE: "+Arrays.toString(realOrder));
//        System.out.println();
//        System.out.println("THE MISSING NUMBER IS: ");
//        printResult(findMissingOne(order,realOrder));

        //6
//        System.out.println(Arrays.toString(order));
//        printResult(zerosToEnd(order));

        //7
//        System.out.println("INITIAL ORDER: ");
//        System.out.println(Arrays.toString(order));
//        System.out.println("REQUIRED SEQUENCES IN THE ORDER: ");
//        System.out.println(countOrders(order));
//        System.out.println("THE LENGTHS OF THE SEQUENCES ARE: ");
//        printResult(findLengths(order,countOrders(order)));
//        int[] lengths = findLengths(order,countOrders(order));
//        System.out.println("FOUND SEQUENCES: ");
//        printResult(findOrders(order,lengths));
//        int[][] sequences = findOrders(order,lengths);
//        System.out.println("THE LONGEST SEQUENCE IS: ");
//        printResult(findLongest(sequences));

        //8
//        System.out.println(Arrays.toString(order));
//        printResult(findMajors(order));

        //9
//        System.out.println(Arrays.toString(order));
//        printLeaders(order);

    }

    static int countRepeats(int[] order) {
        int count = 1;
        for (int i = 0; i < order.length - 1; i++) {
            if (order[i] == order[i + 1]) {
                while (order[i] == order[i + 1]) {
                    i++;
                }
            }
            if (order[i] != order[i + 1]) {
                count++;
            }
        }
        return count;
    }

    static int[] uniqueNums(int count) {
        int[] newOrder = new int[count];
        count = 0;
        newOrder[count] = order[count];
        count++;
        for (int i = 0; i < order.length - 1; i++) {
            if (order[i] == order[i + 1]) {
                while (order[i] == order[i + 1]) {
                    i++;
                }
            }
            if (order[i] != order[i + 1]) {
                newOrder[count] = order[i + 1];
                count++;
            }
        }
        return newOrder;
    }

    static int findMax(int[] order) {
        int max = order[0];
        for (int unit : order) {
            if (unit > max) {
                max = unit;
            }
        }
        return max;
    }

    static int findSecondMax(int[] order, int max) {
        for (int i = 0; i < order.length; i++) {
            if (order[i] == max) {
                order[i] = 0;
                break;
            }
        }
        int secondMax = order[0];
        for (int unit : order) {
            if (unit > secondMax) {
                secondMax = unit;
            }
        }
        return secondMax;
    }

    static void printLeaders(int[] order) {
        int max = order[order.length-1];
        for (int i = order.length - 1; i > 0; i--) {
            if (order[i-1] > max) {
                max = order[i-1];
                System.out.print(max + " ");
            }
        }
    }

    static void printResult(int result) {
        System.out.println(result);
    }

    static void printResult(double result) {
        System.out.println(result);
    }

    static void printResult(int[] result) {
        System.out.println(Arrays.toString(result));
    }

    static void printResult(int[][] result) {
        System.out.println(Arrays.deepToString(result));
    }

    static int[][] makeAndFillArray(int[] order) {
        int i, j, sum1;
        int[] currentResult;
        int index = 0;
        int count = 0;

        for (i = 0; i < order.length; i++) {
            for (j = 0; j < order.length; j++) {
                if (order[j] != order[i]) {
                    sum1 = (order[i] + order[j]);
                    if (sum1 == sum0) {
                        count++;
                    }
                }
            }
        }
        count = count / 2;
        int[][] results = new int[count][3];
        for (i = 0; i < order.length; i++) {
            for (j = 0; j < order.length; j++) {
                if (order[j] != order[i]) {
                    sum1 = (order[i] + order[j]);
                    if (sum1 == sum0) {
                        currentResult = new int[]{order[i], order[j], sum1};
                        for (int k = 0; k < results[0].length; k++) {
                            if (index >= count) {
                                break;
                            } else {
                                results[index][k] = currentResult[k];
                            }
                        }
                        index++;
                    }
                }
            }
        }
        return results;
    }

    static double getDifference(double[] order) {
        double result;
        if (order[1] - order[0] == order[order.length - 1] - order[order.length - 2]) {
            result = order[1] - order[0];
        } else {
            result = order[((order.length + 1) / 2) + 1] - order[(order.length + 1) / 2];
        }
        return result;
    }

    static double[] getRealOrder(double[] order) {
        double[] realOrder = new double[order.length + 1];
        Arrays.fill(realOrder, getDifference(order));
        for (int i = 0; i < realOrder.length; i++) {
            realOrder[i] += getDifference(order) * i;
        }
        return realOrder;
    }

    static double findMissingOne(double[] startArr, double[] realArr) {
        double missingNum;
        for (int i = 0; i < startArr.length; i++) {
            if (realArr[i] != startArr[i]) {
                missingNum = realArr[i];
                return missingNum;
            }
        }
        missingNum = realArr[realArr.length - 1];
        return missingNum;
    }

    static int[] zerosToEnd(int[] order) {
        int[] result = new int[order.length];
        int index = 0;
        for (int i = 0; i < result.length; i++) {
            if (order[i] != 0) {
                result[index] = order[i];
                index++;
            }
        }
        return result;
    }

    static int countOrders(int[] order) {
        int count = 0;
        int curr;
        int last;
        //пропускаем элементы, пока не наткнемся на правильную последовательность
        for (int i = 1; i < order.length; i++) {
            curr = order[i];
            last = order[i - 1];
            //если элемент последний в ряде, но находится в последовательности - счетчик +1 и заканчиваем
            if (curr - last == 1 && i + 1 >= order.length) {
                count++;
                break;
            }
            if (curr - last == 1) {
                for (int j = i + 1; j < order.length; j++) {
                    //если элемент не больше предыдущего на 1, то увеличиваем "счетчик" последовательностей
                    curr = order[j];
                    last = order[j - 1];
                    if (curr - last != 1) {
                        count++;
                        i = j - 1;
                        break;
                    }
                }
            }
        }
        return count;
    }

    static int[] findLengths(int[] order, int count) {
        int[] lengths = new int[count];
        int index = 1;
        for (int k = 0; k < lengths.length; k++) {
            int elemCount = 0;
            int curr;
            int last;
            //пропускаем элементы, пока не наткнемся на правильную последовательность
            for (int i = index; i < order.length; i++) {
                curr = order[i];
                last = order[i - 1];
                //дошли до след. ряда - длина найдена, идем дальше(пропускаем, пока "длины" нет = нет ряда)
                if (curr - last == 1 && elemCount > 0) {
                    index = i;
                    break;
                }
                //есть совпадение - уже 2 элемента найдено
                if (curr - last == 1) {
                    elemCount = 2;
                    //если длина последнего ряда "2", то в цикл не зайдем, ибо i+1 = order.length
                    for (int j = i + 1; j < order.length; j++) {
                        //считаем элементы, пока условия подходят, выходим при несовпадении
                        curr = order[j];
                        last = order[j - 1];
                        if (curr - last != 1) {
                            i = j - 1;
                            break;
                        }
                        elemCount++;
                    }
                }
            }
            lengths[k] = elemCount;
        }
        return lengths;
    }

    static int[][] findOrders(int[] order, int[] lengths) {
        int[][] sequences = new int[lengths.length][];
        for (int i = 0; i < sequences.length; i++) {
            sequences[i] = new int[lengths[i]];
        }
        int mainIndex = 0;
        for (int[] unit : sequences) {
            int curr;
            int next;
            for (int index = mainIndex; index < order.length - 1; index++) {
                curr = order[index];
                next = order[index + 1];
                if (next - curr == 1) {
                    for (int i = 0; i < unit.length; i++) {
                        unit[i] = order[index];
                        index++;
                    }
                    mainIndex = index;
                    break;
                }
            }
        }
        return sequences;
    }

    static int[] findLongest(int[][] orders) {
        int[] max = orders[0];
        for (int i = 1; i < orders.length; i++) {
            if (orders[i].length > max.length) {
                max = orders[i];
            }
        }
        return max;
    }

    static int[] findMajors(int[] order) {
        int[] majors = new int[1];
        for (int i = 0; i < order.length; i++) {
            int count = 1;
            for (int j = 0; j < order.length && j != i; j++) {
                if (order[i] == order[j]) {
                    count++;
                }
            }
            if (count == order.length / 2 && majors[0] == 0) {
                majors[0] = order[i];
            } else if (count == order.length / 2 && majors[0] != 0) {
                int[] twoMajors = new int[2];
                twoMajors[0] = majors[0];
                twoMajors[1] = order[i];
                return twoMajors;
            }
        }
        return majors;
    }
}
