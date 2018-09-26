import java.util.Scanner;

public class Unite{
  public static void main(String[] args){
    System.out.println("Input 1 to get Prime numbers. \n Input 2 to check if the line is palindrome.");
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();
    switch(input)
    {
      case 1: SN();
      break;
      case 2: Palindrome();
      break;
    }
    s.close();
  }


  static void SN() {
    System.out.println("Input the number:");
    Scanner n = new Scanner(System.in);
    int number = n.nextInt();
    System.out.println("1");
    for (int k = 2; k < number; k++) {
      if (Check(k))
        System.out.println(k);
    }
    n.close();
  }

  private static boolean Check(int z) {
    for (int i = 2; i < z; i++) {
      if (z % i == 0)
        return false;
    }
    return true;
  }

static void Palindrome() {
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
