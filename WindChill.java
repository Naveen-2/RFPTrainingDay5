
import java.lang.Math;

public class WindChill{
    public static void main(String[] args){
        //get inputs from command-line and parse to double
		double t = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
        double w = 35.74 + (0.6215 * t) + ((0.4275*t) - 35.75) * Math.pow(v, 0.16);

        System.out.println("Entered temperature is " + t + " degrees Farenheit.");
        System.out.println("Entered Wind speed is " + v + " miles per hr.");
        System.out.println("Calculated Wind Chill is " + w + ".");
    }
}