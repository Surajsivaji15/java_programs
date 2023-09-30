import java.util.*;

class sample
{
  Scanner s=new Scanner(System.in);
  sample()
    {
        System.out.println("Enter the first number= ");
        int x= s.nextInt();                
        System.out.println("Enter the second number= ");
        int y= s.nextInt();
        if (x>y)
          {
            System.out.println(x + " is greater than "+ y);
          }
        else if(x<y)
          {
            System.out.println(x + " is lesser than "+ y);
          }
        else
          {
            System.out.println(x + " is equal to "+ y);
          }  
          

    }

}
class imprtcond
{
  public static void main(String args[])
    {
        new sample();
    }

}