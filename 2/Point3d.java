import java.util.Scanner;
/**
 * A three-dimensional point class.
 **/
public class Point3d {

  /** X coordinate of the point **/
  private double xCoord;

  /** Y coordinate of the point **/
  private double yCoord;

  /** Z coordinate of the point **/
  private double zCoord;

  /** Constructor to initialize point to (x, yб z) value. **/
  public Point3d(double x, double y, double z) {
    xCoord = x;
    yCoord = y;
    zCoord = z;
  }

  @Override
  public String toString(){
    return "x: " + xCoord+ ", y: " + yCoord + ", z: " + zCoord;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
   /** result = prime * result + xCoord;
    result = prime * result + yCoord;
    result = prime * result + zCoord;**/
    result = prime * result + (int) xCoord;
    result = prime * result + (int) yCoord;
    result = prime * result + (int) zCoord;
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Point3d other = (Point3d) obj;
    if (xCoord != other.xCoord)
      return false;
    if (yCoord != other.yCoord)
      return false;
    if (zCoord != other.zCoord)
      return false;
    return true;
  }

  public double distanceTo(Point3d P1) {
    return Math.sqrt(
        Math.pow(xCoord - P1.xCoord, 2) + Math.pow(yCoord - P1.yCoord, 2) + Math.pow(zCoord - P1.zCoord, 2));
  }
  /** No-argument constructor: defaults to a point at the origin. **/
  public Point3d() {
    // Call three-argument constructor and specify the origin.
    this(0, 0, 0);
  }

  /** Return the X coordinate of the point. **/
  public double getX() {
    return xCoord;
  }

  /** Return the Y coordinate of the point. **/
  public double getY() {
    return yCoord;
  }
  
  /** Return the Z coordinate of the point. **/
  public double getZ() {
    return zCoord;
  }

  /** Set the X coordinate of the point. **/
  public void setX(double val) {
    xCoord = val;
  }

  /** Set the Y coordinate of the point. **/
  public void setY(double val) {
    yCoord = val;
  }
  
  /** Set the Y coordinate of the point. **/
  public void setZ(double val) {
    zCoord = val;
  }

 
}
