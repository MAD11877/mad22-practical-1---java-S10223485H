import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int temp = num;

    for(int i=0;i<num;i++)
    {  
      for(int j=0;j<temp;j++)
      {
        System.out.print("*");
      }
      System.out.println();
      temp-=1;
    } 

  }
}
