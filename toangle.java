package compass;

// Import Libraries
import java.lang.*;
import java.io.*;
import java.util.*;

public class toangle {

    public static void getangle(){
        // Initialize variables
        int North = 0;
        int North_east = 45;
        int North_west = 315;
        int North_alt = 360;
        int East = 90;
        int West = 270;
        int South = 180;
        int South_east = 135;
        int South_west = 225;

        // Input + Output Variables
        int bearing = 0;
        int base = 0;
        int angle = 0;
        char dirA = 'A';
        char dirB = 'B';

        Scanner in = new Scanner(System.in);

        /* Take Input */
        String compassString = in.next();

        in.close();

        /* Parse Input */
        int compassLength = compassString.length();

        // Get Primary Compass Direction
        dirA = compassString.toUpperCase().charAt(0);
        
        // Get Angle and Secondary Compass Direction
        switch (compassLength) {
            case 1:
                angle = 0;
                dirB = '0';
                break;
            case 2:
                dirB = compassString.toUpperCase().charAt(1);
                angle = 45;
                break;

            case 3:
                angle = Integer.parseInt(compassString.substring(1, 2));
                dirB = compassString.toUpperCase().charAt(2);
                break;

            case 4:
                angle = Integer.parseInt(compassString.substring(1, 3));
                dirB = compassString.toUpperCase().charAt(3);
            break;
        
            default:
                System.out.println("Invalid");
                System.exit(0);
        }

        // Angles can't be larger then 45
        if (angle > 45) {
            System.out.println("Invalid");
            System.exit(0);
        }
        

        /* Directional math */

        // get base angle
        switch (dirA) {
            case 'N':
                base = 0;
                break;
            case 'E':
                base = 90;
                break;
            case 'S':
                base = 180;
                break;
            case 'W':
                base = 270;
                break;
            default:
                System.out.println("Invalid");
                System.exit(0);
                break;
        }

        // Reverse to subtract when needed
        if (dirA == 'N' && dirB == 'W' || dirA == 'E' && dirB == 'N' || dirA == 'S' && dirB == 'E' || dirA == 'W' && dirB == 'S') {
            angle = -angle;
            if (dirA == 'N') {
                base = 360;
            }
        }

        /* Get Bearing */
        bearing = base + angle;

        /* Output */
        System.out.println("Compass " + compassString + " is a bearing of " + bearing);
    }
}


