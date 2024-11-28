package basic_math;

public class AmstrongNum {
    public static void main(String[] args) {
        Amastrong(35);
        Amastrong(1634);
        Amastrong(371);

    }
    public static void Amastrong(int n){
            int sum = 0;
            int num = n;
            int k = String.valueOf(n).length();
            while (n > 0) {
                int ld = n % 10;
                sum = sum + (int)Math.pow(ld, k);
                n = n / 10;
            }
            System.err.println(sum);
            if (sum == num) {
                System.out.println(num + " is an Amstrong number");
            }
            else{
                System.out.println(num + " is not an Amstrong number");
            }
    }
}
