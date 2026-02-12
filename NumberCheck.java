import java.util.Scanner;
public class NumberCheck {

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number>0){
            System.out.print("The number is positive.");
        } else if (number<0) {
            System.out.print("The number is negative.");
        } else{
            System.out.print("The number is zero.");
        }
        scanner.close();
    }


}
