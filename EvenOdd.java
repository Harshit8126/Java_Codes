#Program to check whether the no is odd Or Even:
@Harshit Verma.3

import java.util.Scanner;

class CheckEvenOdd
{
  public static void main(String args[])
  {
    int num;
    System.out.println("Enter an Integer number:");
    Scanner input = new Scanner(System.in);
    num = input.nextInt();

    if ( num % 2 == 0 )
        System.out.println("Entered number is even");
     else
        System.out.println("Entered number is odd");
  }
}
