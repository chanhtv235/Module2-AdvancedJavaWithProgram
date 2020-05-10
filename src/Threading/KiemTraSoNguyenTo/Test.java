package Threading.KiemTraSoNguyenTo;

public class Test {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization=new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization=new OptimizedPrimeFactorization();
        optimizedPrimeFactorization.run();
        lazyPrimeFactorization.run();

    }
}
