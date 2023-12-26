
public class Task_11 {
    static int[] order = {2,3,5,3,6};
    public static void main(String[] args) {
        boolean result = areAllPrimes(order)&&isSymmetrical(order);
        printResult(result);
    }

    static boolean areAllPrimes(int[]order) {
        for (int unit: order) {
            if (unit==1 || ((unit!=2 && unit!=3) && (unit%2==0 || unit%3==0))){
                return false;
            }
        }
        return true;
    }

    static boolean isSymmetrical(int[]order){
        for (int i = 0; i < order.length; i++) {
            if (order[i]!=order[order.length-1-i]){
                return false;
            }
        }
        return true;
    }

    static void printResult(boolean result){
        if (result){
            System.out.println("THE SEQUENCE IS OF PRIMES AND IS SYMMETRICAL");
        } else {
            System.out.println("THE SEQUENCE IS EITHER NOT OF PRIMES OR NOT SYMMETRICAL");
        }
    }
}
