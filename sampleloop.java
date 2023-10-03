import java.util.*;

class sample
{
    Scanner ss=new Scanner(System.in);
    String s="yes";

    sample()
    {
       do {
        System.out.println("Enter the location");
        String x=ss.nextLine();

        }while(s.equals("yes"));
    }
}
class sampleloop
{
    public static void main(String args[])
    {
        sample ob=new sample(); 
    }
}
    