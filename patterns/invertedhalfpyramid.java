public class invertedhalfpyramid {
    public static void main(String[] args) {
        // to print the inverted half pyramid
        int n=4;
        //outer loop
        for(int i=n;i>=1;i--){
            //inner loop
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
