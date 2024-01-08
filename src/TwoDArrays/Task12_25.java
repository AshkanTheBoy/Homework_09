package TwoDArrays;

import java.util.Arrays;

public class Task12_25 {
    public static void main(String[] args) {
        //a
        System.out.println("A");
        int[][] order = new int[12][10];
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                order[i][j] = (j+1)+i*10;
            }
            System.out.println(Arrays.toString(order[i]));
        }
        //b
        System.out.println();
        System.out.println("B");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                order[i][j] = (i+1)+12*j;
            }
            System.out.println(Arrays.toString(order[i]));
        }
        //c
        System.out.println();
        System.out.println("C");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                order[i][j] = 10*(i+1)-j;
            }
            System.out.println(Arrays.toString(order[i]));
        }
        //d
        System.out.println();
        System.out.println("D");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                order[i][j] = 12-i+12*j;
            }
            System.out.println(Arrays.toString(order[i]));
        }
        //e
        System.out.println();
        System.out.println("E");
        order = new int [10][12];
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                //нечетные - -1, четные - +1
                if ((i+1)%2==0) {
                    order[i][j] = 12*(i+1)-j;
                } else {
                    order[i][j] = 12*i+(j+1);
                }
            }
            System.out.println(Arrays.toString(order[i]));
        }
        //f
        System.out.println();
        System.out.println("F");
        order = new int [12][10];
        //BRUTE FORCE (обычное заполнение)
//        for (int i = 0; i < order.length; i++) {
//            for (int j = 0; j < order[0].length; j++) {
//                if (j==0){
//                    order[i][j] = i+1;
//                }
//                if ((j+1)%2==0) {
//                    order[i][j] = order[i][j-1]+(23-2*i);
//                } else if (j>0 && (j+1)%2!=0) {
//                    order[i][j] = order[i][j-1]+(1+2*i);
//                }
//            }
//            System.out.println(Arrays.toString(order[i]));
//        }
        //"вертикальное" заполнение
        for (int i = 0; i < order[0].length; i++) {
            for (int j = 0; j < order.length; j++) {
                if ((i+1)%2==0) {
                    order[j][i] = 12*(i+1)-j;

                } else {
                    order[j][i] = 12*i+(j+1);
                }
            }
        }
        //для корректного результата, выводить нужно после всех действий
        for (int[]unit: order) {
            System.out.println(Arrays.toString(unit));
        }

        //g
        System.out.println();
        System.out.println("G");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                order[i][j] = (j+111)-i*10;
            }
            System.out.println(Arrays.toString(order[i]));
        }

        //h
        System.out.println();
        System.out.println("H");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                order[i][j] = (109+i)-j*12;
            }
            System.out.println(Arrays.toString(order[i]));
        }

        //i
        System.out.println();
        System.out.println("I");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                order[i][j] = (120-j)-i*10;
            }
            System.out.println(Arrays.toString(order[i]));
        }

        //j
        System.out.println();
        System.out.println("J");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                order[i][j] = (120-i)-12*j;
            }
            System.out.println(Arrays.toString(order[i]));
        }

        //k
        System.out.println();
        System.out.println("J");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                //заполнение по элементам предыдущего ряда
                if (i==0){
                    order[i][j] = 120-j;
                }
                if (i%2!=0 && i>0){
                    order[i][j] = order[i-1][j]-(19-2*j);
                } else if (i%2==0 && i>0) {
                    order[i][j] = order[i-1][j]-(1+2*j);
                }
            }
        }
        for (int[]unit: order) {
            System.out.println(Arrays.toString(unit));
        }

        //l
        System.out.println();
        System.out.println("K");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                if (i==0){
                    order[i][j] = 10-j;
                }
                if (i%2!=0 && i>0){
                    order[i][j] = order[i-1][j]+(1+2*j);
                } else if (i%2==0 && i>0) {
                    order[i][j] = order[i-1][j]+(19-2*j);
                }
            }
        }
        for (int[]unit: order) {
            System.out.println(Arrays.toString(unit));
        }

        //m
        System.out.println();
        System.out.println("M");
        order = new int [12][10];
        //"вертикальное" заполнение
        for (int i = order[0].length-1; i >= 0; i--) {
            for (int j = 0; j < order.length; j++) {
                if ((i-1)%2!=0) {
                    order[j][i] = 12*(order[0].length-i)-j;

                } else {
                    order[j][i] = 12*(order[0].length-(i+1))+(j+1);
                }
            }
        }
        for (int[]unit: order) {
            System.out.println(Arrays.toString(unit));
        }

        //n
        System.out.println();
        System.out.println("N");
        for (int i = 0; i < order[0].length; i++) {
            for (int j = order.length-1; j >= 0; j--) {
                if ((i+1)%2!=0) {
                    order[j][i] = 12*(i+1)-j;

                } else {
                    order[j][i] = 12*(i)+(j+1);
                }
            }
        }
        for (int[]unit: order) {
            System.out.println(Arrays.toString(unit));
        }

        //o
        System.out.println();
        System.out.println("O");
        for (int i = 0; i < order.length; i++) {
            for (int j = 0; j < order[0].length; j++) {
                if (i==0) {
                    order[i][j] = 111+j;
                }
                if ((i+1)%2==0 && i>0) {
                    order[i][j] = order[i-1][j] - (1+2*j);

                } else if ((i+1)%2!=0 && i>0) {
                    order[i][j] = order[i-1][j] - (19-2*j);
                }
            }
            System.out.println(Arrays.toString(order[i]));
        }

        //p
        System.out.println();
        System.out.println("P");
        //нечетные - снизу-вверх, четные - сверху-вниз
        for (int i = order[0].length-1; i >= 0; i-=2) {
                for (int j = order.length-1; j >= 0 ; j--) {
                    order[j][i] = 12*(order[0].length-i-1)+12-j;
                }
        }
        for (int i = order[0].length-2; i >= 0; i-=2) {
                for (int j = 0; j < order.length; j++) {
                    order[j][i] = 12*(order[0].length-i-2)+13+j;
                }
        }
        for (int[]unit: order) {
            System.out.println(Arrays.toString(unit));
        }
    }
}
