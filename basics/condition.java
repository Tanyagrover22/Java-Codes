import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        //if statement
         Scanner scan =new Scanner(System.in);
        int age= scan.nextInt();
        if (age>18) {
            System.out.println("The person is adult");
        }
            else{
                System.out.println("The person is not adult");
            }
            
        

    }
}
