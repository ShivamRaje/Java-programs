/*
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1 
5 4 3 2 1  
*/ 
import java.util.*;
class Pattern5
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number  : ");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++)
    {
      for(int j=n;j>=1;j--)
      {
        System.out.print(j+" ");
      }
      System.out.println();
    }
    sc.close();
  }
}