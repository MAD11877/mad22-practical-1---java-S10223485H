import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = in.nextInt();
    int [] array=new int[num];
    int mostValue = 0;
    int Total = 0;

    for(int i=0;i<num;i++)
    {  
      System.out.print("Enter an integer: ");
      array[i] = in.nextInt();
    }
    for (int j=0;j<num;j++) 
    {
      int temp = 0;
      for (int k=0;k<num;k++)
      {
         if (array[k] == array[j])
         temp++;
      }

      if (temp > Total) 
      {
         Total = temp;
         mostValue = array[j];
      }
    }
    System.out.println(mostValue);
  }
}
