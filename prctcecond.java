import java.util.*;

class lpyear
{
    Scanner s=new Scanner(System.in);
    lpyear()
    {
        int x=s.nextInt();
        if(x%4==0)
          {
            System.out.println("The given year is a leap year");
          }
        else
          {
            System.out.println("The given year is not a leap year");
          }  

    }
}
class prctcecond
{
    public static void main(String args[])
    {
      new lpyear();
    }
}