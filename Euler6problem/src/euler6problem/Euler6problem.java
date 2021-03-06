package euler6problem;
import java.math.BigInteger;
/**
 *
 * @author Mrozu
 */
public class Euler6problem {

    public static void main(String[] args) {
        BigInteger sum = BigInteger.ZERO;
        BigInteger sumSqr = BigInteger.ZERO;
        BigInteger sumOfSqr = BigInteger.ZERO;

        for (long i = 1; i <= 100000; i++) {
            sum = sum.add(BigInteger.valueOf(i));
            sumOfSqr = sumOfSqr.add(BigInteger.valueOf(i * i));             
        }
        sumSqr = sum.multiply(sum);
        System.out.println("Suma kwadratow: "+sumSqr + "\n Kwadrat sumy: " + sumOfSqr);
        System.out.println(""+sumSqr.subtract(sumOfSqr).toString());
    }
}
