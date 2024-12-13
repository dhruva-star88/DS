package Recursion;

public class sumOfNum {
    public static void main(String[] args) {
        SumOfNumbers(1, 5, 0);
    }
    public static void SumOfNumbers(int c,int n, int sum) {
        if (c > n){
            System.out.println(sum);
            return;
        }
        else{
            sum = sum + c;
            SumOfNumbers(c + 1, n, sum);
        }
    }
}
