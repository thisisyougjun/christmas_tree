public class Main {
    public static void main(String[] args) throws Exception {
        
        int r=10; //row
        int l=0;  //line
        for (int i =0; i < r; i++) {
            for (int j = r-1; j > i; j--) {
                System.out.print(" ");
            }
            for ( l = 0; l < 2*i+1; l++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 0; i <=2; i++) {
            for (int j = 0; j <l/2-1; j++) {
                System.out.print(" ");
            } 
            System.out.println("***");

        }
    }
}
