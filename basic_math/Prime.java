package basic_math;

public class Prime {
    public static void main(String[] args) {
        System.out.println(prime(5));
        System.out.println(prime(25));
        System.out.println(prime(1));
    }
    public static boolean prime(int n){
        int c = 0;
        for ( int i =1; i<=n; i ++){
            if (n%i == 0){
                c = c + 1;
            }
        }
        if (c == 2){
            return true;
        }
        else {
            return false;
        }
    }

}
