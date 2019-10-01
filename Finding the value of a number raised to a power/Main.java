import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        //Try your logic here
            Scanner sc = new Scanner(System.in);
      int base = sc.nextInt();
      int exponent = sc.nextInt();
      int i=1;
      int temp = base;
      while(i < exponent)
      {
        temp = temp*base;
        i++;
      }
      System.out.print(temp);
    }
}