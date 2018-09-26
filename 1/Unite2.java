import java.util.Scanner;

public class Unite2 {
  public static void main(String[] args){
    System.out.println("Input 1 to get Prime numbers. \n Input 2 to check if the line is palindrome.");
    Scanner s = new Scanner(System.in);
    int input = s.nextInt();
    SN numb = new SN();
    Palindrome pal = new Palindrome();
    switch(input)
    {
      case 1: numb.main(null);
      break;
      case 2: pal.main(null);
      break;
    }
    s.close();
  }
}
