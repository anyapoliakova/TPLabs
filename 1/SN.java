import java.util.Scanner;
public class SN {
  
  public static void main(String[] args) {
    System.out.println("Input the number:");
    Scanner n = new Scanner(System.in);
    int number = n.nextInt(); 
    System.out.println("1"); 
    for (int k = 2; k < number; k++) {
      if(Check(k)) System.out.println(k);
    }
    n.close();
  }

  private static boolean Check(int z) {
    for (int i=2; i<z; i++) {
      if (z%i == 0) 
      return false;
    }
    return true;
  }
}
