 public class PROJE8 {

    public static void main(String[] args) {

        int[] fibonacciSeries = new int[20];

        fibonacciSeries[0] = 0;
        fibonacciSeries[1] = 1;

        for (int i = 2; i < 20; i++) {
            fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
        }

        System.out.println("Fibonacci Serisi (ilk 20 eleman):");
        for (int i = 0; i < 20; i++) {
            System.out.print(fibonacciSeries[i] + " ");
        }
    }
}