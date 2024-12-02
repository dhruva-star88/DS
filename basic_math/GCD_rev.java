package basic_math;

public class GCD_rev {
    public static void main(String[] args) {
        gcd(52,10);
       gcd(15,10);
        gcd(12,6);
    }
    public static void gcd(int a, int b){
        for (int i = Math.min(a, b); i>=1; i--){
            if (a%i ==0 && b% i==0){
                System.out.println(i);
            }
        }
    }
}
