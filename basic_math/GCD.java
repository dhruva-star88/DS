package basic_math;
public class GCD{
    public static void main(String[] args) {
        System.out.println(gcd(52,10));
        System.out.println(gcd(15,10));
        System.out.println(gcd(12,6));
    }
    public static int gcd(int a,int b){
        int min = Math.min(a, b);
        int gcd = 1;
        for (int i=1; i<=min; i ++){
            if(a % i == 0 && b % i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
}