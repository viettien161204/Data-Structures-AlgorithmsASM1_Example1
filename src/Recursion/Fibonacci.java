package Recursion;

public class Fibonacci {
    // Hàm đệ quy tính số Fibonacci
    public static long fibonacci(long n) {
        if (n <= 0) {
           return 0;
        } else if (n == 1|| n==2) {
            return 1;
        } else {

            return fibonacci(n - 1) + fibonacci(n - 2);
            // Công thức đệ quy
        }
    }
    public static long SumNumberWithRecursion(long n1){
        if (n1 <= 0) {
            return 0;
        } else if (n1 == 1) {
            return 1;
        }else {
            return n1 + SumNumberNonRecursion(n1 - 1);
        }
    }
    public static long SumNumberNonRecursion(long n2){
        if (n2<=1){
            return 1;
        }
        return (n2*(n2+1)/2);

    }

}
