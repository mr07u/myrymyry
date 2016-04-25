package fibonacciseq;
/**
 *
 * @author Mrozu
 */
public class FibonacciSeq {

    public void FibonacciCount()
    {
         int[] pivot = new int[100000];
        OUTER:
        for (int j = 0; j < pivot.length; j++) {
            switch (j) {
                case 0:
                    pivot[j] = 1;
                    break;
                case 1:
                    pivot[j] = 2;
                    break;
                default:
                    pivot[j] = pivot[j-1] + pivot[j-2];
                    // if you want to break loop before 4 mil.
                    if (pivot[j] >= 4000000) {
                        System.out.println(pivot[j-1]);
                        System.out.println(pivot[j]);
                        break OUTER;
                    }
                    break;
            }
        }
    }
    public static void main(String[] args) {
         FibonacciSeq fs = new FibonacciSeq();
         fs.FibonacciCount();
   
    }
}
