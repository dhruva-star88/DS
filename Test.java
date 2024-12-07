public class Test {
   public static void main(String[] args) {
       Testrun(4);
       Testrun(5);
   }
   public static void Testrun(int n){
        int c = 0;
            int num = 0;
        for(int i = 0; i<n; i++){
            c = c + 1;
            for(int j = 0; j<c; j++){
                num = num + 1;
                System.out.print(num + " ");
            }
            System.out.println(); 
        }
    }
}
       
