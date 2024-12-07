package Recursion;

public class printName {
    public static void main(String[] args) {
        PrintName(1, 5);
    }
    public static void PrintName(int i, int n){
        if (i > n){
            return;
        }
        else{
            System.out.println("Dhruva");
            PrintName(i + 1, n);
        }
    }
}
