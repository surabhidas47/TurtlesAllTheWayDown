//package PACKAGE_NAME;

import java.time.Duration;
import java.time.Instant;

/**
 * Created by kristofer on 7/14/20.
 */
public class Turtles {

    GCD gcd = new GCD();

    public static void main(String [] args){
        Instant start = Instant.now();
        GCD.gcd(1440, 408);
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start,finish).toNanos();
        System.out.println(timeElapsed);

        Instant start2 = Instant.now();
        GCD2.gcd2(1440, 408);
        Instant finish2 = Instant.now();
        long timeElapsed2 = Duration.between(start2,finish2).toNanos();
        System.out.println(timeElapsed2);

    }





}
