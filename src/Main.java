import java.math.BigInteger;
import java.util.Hashtable;

public class Main {

    // BigInteger class stores arbitrarily large numbers
    // For memoization
    Hashtable<Long, Long> fibonacciDictionary = new Hashtable<>();
    Hashtable<Long, BigInteger> factorialDictionary = new Hashtable<>();

    public static void main(String[] args) {
        Main ex = new Main();
    }

    public Main() {
        long n = 100;

        System.out.println(fibonacci(n));
        System.out.println(factorial(n));
    }

    public long fibonacci(long n){
        if (fibonacciDictionary.containsKey(n)){
            return fibonacciDictionary.get(n);
        } else if (n < 2){
            return n;
        } else {
            long x = fibonacci(n-1) + fibonacci(n-2);
            fibonacciDictionary.put(n, x);
            return x;
        }
    }

    public BigInteger factorial(long n){
        if (factorialDictionary.containsKey(n)){
            return factorialDictionary.get(n);
        } else if (n == 1) {
            return new BigInteger(String.valueOf(n));
        } else {
            BigInteger x = factorial(n-1).multiply(new BigInteger(String.valueOf(n)));
            factorialDictionary.put(n, x);
            return x;
        }
    }
}
