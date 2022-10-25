package compass;

// Import compass tools
import java.util.Scanner;
import java.lang.*;
import compass.toangle;
import compass.tobearing;

public class Main {
    public static void main(String[] args) {
        // Create Scanner
        Scanner in = new Scanner(System.in);

        System.out.println("(1) convert bearing to compass \n(2) convert compass to bearing");
        System.out.print("Choose: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                // bearing to compass
                tobearing.getbearing();
                break;
            case 2:
                // compass to bearing
                toangle.getangle();
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
