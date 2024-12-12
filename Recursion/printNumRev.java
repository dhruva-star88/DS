package Recursion;

public class printNumRev {
    public static void main(String[] args) {
        int n = 4;
        NumRev(1,n);
    }
    public static void NumRev(int c, int n){
        if(c>n) return;
            
        // Function call to print(c+1) integers.
        NumRev(c+1,n);
        System.out.println(c);
    }
}
