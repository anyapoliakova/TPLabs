import java.util.Scanner;

public class Lab2 {

  public static void main(String[] args) {
   Point3d Pnt1 = GetPoint();
    System.out.println("First point is " + Pnt1);  
   Point3d Pnt2 = GetPoint();
    System.out.println("Second point is " + Pnt2);
   Point3d Pnt3= GetPoint();
    System.out.println("Third point is " + Pnt3);
   Equality(Pnt1, Pnt2, Pnt3);
   computeArea(Pnt1, Pnt2, Pnt3);
  }
  
  public static double GetCoord() {
    Scanner CoordIn = new Scanner(System.in);
    Double xyz = CoordIn.nextDouble();  
    //CoordIn.close(); 
    return xyz;
  }

  public static Point3d GetPoint() {
    System.out.println("Input the first coordinate:");    
    Double x = GetCoord();
    System.out.println("Input the second coordinate:");
    Double y = GetCoord();
    System.out.println("Input the third coordinate:");
    Double z = GetCoord();
    Point3d Point = new Point3d(x, y, z);
    return Point;
  }

  public static void Equality(Point3d P1, Point3d P2, Point3d P3) {
    if (P1.equals(P2)) {
      System.out.println("Points P1 and P2 are equal");
    } else if (P2.equals(P3)) {
      System.out.println("Points P2 and P3 are equal");
    } else if (P2.equals(P3)) {
      System.out.println("Points P2 and P3 are equal");
    }else {
      System.out.println("Points are not equal");
    }
  }
  
  
  /**public static double countDistanceTo(Point3d Pnt1, Point3d Pnt2, Point3d Pnt3) {
    //System.out.println("Distance between P1 and P2 is");
    Double AB = Pnt1.distanceTo(Pnt2);
    //System.out.println(AB);
    //System.out.println("Distance between P2 and P3 is");
    Double BC = Pnt2.distanceTo(Pnt3);
    //System.out.println(BC);
    //System.out.println("Distance between P3 and P1 is");
    Double CA = Pnt3.distanceTo(Pnt1);
    //System.out.println(CA);
  } **/
  
  public static double computeArea(Point3d Pnt1, Point3d Pnt2, Point3d Pnt3) {
    Double a = Pnt1.distanceTo(Pnt2);
    Double b = Pnt2.distanceTo(Pnt3);
    Double c = Pnt3.distanceTo(Pnt1);
   // System.out.println("Triangle's semiperimeter is");
    Double s = (a+b+c)/2;
    System.out.println("Triangle's semiperimeter is " + s);
   // System.out.println("Triangle's area is");
    Double Ar = Math.sqrt(s*(s-a)*(s-b)*(s-c));
    System.out.println("Triangle's area is " + Ar);
    return Ar;
  }
}
