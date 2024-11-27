package basic_math;

public class palindrome {
    public static void main(String[] args) {
        Palindrome(1221);
        Palindrome(9452);
    }
    public static void Palindrome(int n){
        int orig = n;
        int temp = 0;
        while(n > 0){
            int ld = n % 10;
            temp = (temp * 10) + ld;
            n = n/ 10;
        }
        System.out.println("rev= " + temp);
        if(temp == orig){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
