package basic_math;

public class GCD_euclid {
    public static void main(String[] args) {
        System.out.println(gcd(52,10));
        System.out.println(gcd(15,10));
        System.out.println(gcd(12,6));
    }
    public static int gcd(int a, int b){
        while (a>0 && b > 0) {
            if (a > b){
                a = a % b;
            }
            else{
                b = b % a;
            }

        }
        if ( a == 0){
            return b;
        }
        else {
            return a;
        }
    }
}
