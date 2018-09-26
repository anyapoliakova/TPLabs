import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab2File {

public static void main(String[] args) {

    File file = new File("PntCrd.txt");
    Point3d[] points = new Point3d[3];

    try {

        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            double i = sc.nextDouble();
            points[0] = new Point3d(x, y, z);
            System.out.println("First point is " + points[0]);
        }
        sc.close();
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
 }
}
