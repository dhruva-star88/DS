public class numTri {
    public static void main(String[] args) {
        Tri(4);
    }
    public static void Tri(int n){
        int c = 0;
        int num = 0;
        for (int i = 1; i <= n; i++) {
            c = c + 1;
            for (int j = 1; j <=c ; j++){
                num = num + 1;
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
    }
} 
