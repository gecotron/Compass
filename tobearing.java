package compass;

// Import Libraries
import java.lang.*;
import java.io.*;
import java.util.*;

public class tobearing {
    public static void getbearing() {
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
        Scanner in = new Scanner(System.in);

        // Take Input
        int bearing = in.nextInt();
        in.close();

        /* Here we start figuring out what the bearing is closest to and the annoying math that goes along with it */

        // Get rid of outside integers

        /*int ab = Math.abs(bearing);
        if (ab > 365) {
            int answer = ab % 360;
            if (bearing < 0) {
                bearing = 360 - answer;
            } else {
                bearing = answer;
            }
            System.out.println(bearing);
        }*/
        
        if (bearing < 0) {
            bearing = 360 + bearing;
        }

        // North - North-east detection

        // Equal to North
        if (bearing == North) {
            System.out.println("Bearing 0 is N");
        }

        // Closer to North
        else if (bearing < North_east) {
            int angle = bearing - 0;
            System.out.println("Bearing " + bearing + " is " + "N" + angle + "E");
        }

        // Equal to North-East
        else if (bearing == North_east) {
            System.out.println("Bearing 45 is NE");
        }

        // Closer to East
        else if (bearing < East) {
            int angle = (bearing - 90)*-1;
            System.out.println("Bearing " + bearing + " is " + "E" + angle + "N");
        }

        // East - South-east detection

        // Equal to East
        else if (bearing == East) {
            System.out.println("Bearing 90 is E");
        }
        // Closer to East
        else if (bearing < South_east) {
            int angle = bearing - 90;
            System.out.println("Bearing " + bearing + " is " + "E" + angle + "S");
        }

        // Equal to South-East
        else if (bearing == South_east) {
            System.out.println("Bearing 135 is SE");
        }

        // Closer to South
        else if (bearing > South_east && bearing < South) {
            int angle = (bearing - 180)*-1;
            System.out.println("Bearing " + bearing + " is " + "S" + angle + "E");
        }

        // South - South-west detection

        // Equal to South
        else if (bearing == South) {
            System.out.println("Bearing 180 is S");
        }

        // Closer to South
        else if (bearing < South_west) {
            int angle = bearing -  180;
            System.out.println("Bearing " + bearing + " is " + "S" + angle + "W");
        }

        // Equal to South-West
        else if (bearing == South_west) {
            System.out.println("Bearing 315 is NW");
        }

        // Closer to West
        else if (bearing > South_east && bearing < West) {
            int angle = (bearing - 270)*-1;
            System.out.println("Bearing " + bearing + " is " + "W" + angle + "S");
        }

        // West - North-west detection

        // Equal to West
        else if (bearing == West) {
            System.out.println("Bearing 270 is W");
        }

        // Closer to West
        else if (bearing < North_west) {
            int angle = bearing -  270;
            System.out.println("Bearing " + bearing + " is " + "W" + angle + "N");
        }

        // Equal to North-West
        else if (bearing == North_west) {
            System.out.println("Bearing 225 is SW");
        }

        // Closer to North
        else if (bearing > North_west && bearing < North_alt) {
            int angle = (bearing - 360)*-1;
            System.out.println("Bearing " + bearing + " is " + "N" + angle + "W");
        }
        else if (bearing >= North_alt) {
            System.out.println("Invalid");
        }
    }
}

