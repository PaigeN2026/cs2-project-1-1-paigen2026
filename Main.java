public class Main {

   public static void main(String []args) {
      // PROBLEM 1
      System.out.println("Problem #1");

      // DECLARE VARIABLES 
      int distanceKm = 380000;
      int speedKmSec = 10; // km per sec
      int speedKmMin = speedKmSec * 60; // km per min
      int speedKmHr = speedKmMin * 60; // km per hour
      int timeHr = distanceKm / speedKmHr; // time equation

      // PRINT total hours to get to the moon
      System.out.println("It would take " + timeHr + " hours to get to the moon." );

      // PROBLEM 2
      System.out.println("Problem #2");

      // DECLARE VARIABLES 
      int horiSpeed = 2000;
      int veriSpeed = 3000;

      // square hori and veri 
      // add together for speed change
      // then square root the total
      int horiSquared = horiSpeed * horiSpeed; 
      int veriSquared = veriSpeed * veriSpeed;
      int totalChange = horiSquared + veriSquared;
      double result2 = Math.sqrt(totalChange);

      // PRINT the total speed change
      System.out.println("The total speed change was " + result2 + "m/sec.");

      // Problem 3
      System.out.println("Problem #3");

      // 3a
      System.out.println("a)");

      // convert radius from kilometers to meters
      int radiusKm = 1731;
      double radiusM = radiusKm * 1000;

      // convert layer from millimeters to meters  
      double layerMm = 1;
      double layerM = layerMm / 1000;

      // sqrt the radius 
      double result3 = radiusM * radiusM;
      double surfArea = 4 * Math.PI * result3; 
      double surfVol = surfArea * layerM; 

      // PRINT the surface volume
      System.out.println("There are " + surfVol + " cubic meters of surface volume present in layer that is 1 millimeter thick.");

      // 3b
      System.out.println("b)");

      // mass equal density times volume
      int density = 3000;
      double massKm = density * surfVol;

      // convert km to tons
      double massTon = massKm / 1000;

      // PRINT metric tons of reglith
      System.out.println("There are " + massTon + " metric tons of regolith found in the surface volume of 3a.");

      // 3c
      System.out.println("c)");

      // find 25% of surfVol
      double surfVol2 = surfVol / 4;

      // convert surfVol to liters
      double surfVol2L = surfVol2 * 1000;

      System.out.println("There are " + surfVol2L + "L of water that could be recovered");
   }
}
