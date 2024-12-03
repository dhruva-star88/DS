package Recursion;

public class PrintNum {
    public static void main(String[] args) {
        printNum(0, 5);
    }
    // Print Numbers till "n"
    public static void printNum(int c, int n) {
        if (c == n){
            return;
        }
        else{
            System.out.println(c);
            printNum(c + 1, n);
        }
        
    }
}
