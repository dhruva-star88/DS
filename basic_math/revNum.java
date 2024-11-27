package basic_math;

public class revNum {
    public static void main(String[] args) {
        System.out.println(Numrev(94852));
        System.out.println(Numrev(140500));
    }
    public static int Numrev(int n){
        int rev = 0;
        while(n > 0){
            // retrives the last digit
            int ld = n % 10;
            // reverses the number and store it in the variable "rev" 
            rev = (rev * 10) + ld;
            // removes the last digit in every iteration
            n = n / 10;
        }
        return rev;
    }
}
