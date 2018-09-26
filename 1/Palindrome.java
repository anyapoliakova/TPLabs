import java.util.Scanner;
public class Palindrome {
  
  public static void main(String[] args) {
    System.out.println("Input the word:");
    Scanner in = new Scanner(System.in);
    String wrd = in.nextLine(); 
    if (isPal(wrd)) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not Palindrome");
    } 
    in.close();
  }
   
  private static boolean isPal(String z) {
    int i = z.length() - 1;
    int j = 0;
    while (i > j) {
      if (z.charAt(i) != z.charAt(j)) {
        return false;
      }
      i--;
      j++;
    }
    return true;
  }
}
