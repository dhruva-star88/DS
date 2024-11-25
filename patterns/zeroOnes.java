public class zeroOnes{
    public static void main(String[] args) {
        zeroOne(4);
    }
    public static void zeroOne(int n) {
        int c = 0;
        for (int i=0; i<n; i++){
            c = c + 1;
            for(int j =0; j<c; j++){
                if(i % 2 == 0 && j % 2 == 0 || i % 2!=0 && j % 2 != 0){
                    System.out.print("1" + " ");
                }
                else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    
    }
}