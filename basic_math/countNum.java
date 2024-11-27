package basic_math;

public class countNum {
    public static void main(String[] args) {
        System.err.println(numCount(156));
    }
    public static int numCount(int n){
        int c = 0;
        while(n > 0){
            
           int last_dig = n % 10;
           System.err.println("last"+last_dig);
           n = n / 10;
           System.out.println("whole"+n);
           c = c + 1; 
        }
        return c;
    }
}
