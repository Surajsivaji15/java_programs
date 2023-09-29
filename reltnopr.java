import java.io.*;

class relational
{
DataInputStream ob=new DataInputStream(System.in);
   relational()
      {
        try{
            System.out.println("Enter first number = ");
            int a =Integer.parseInt(ob.readLine());
            System.out.println("Enter second number = ");
            int b =Integer.parseInt(ob.readLine());
            System.out.println(a==b);
            System.out.println(a!=b);
            System.out.println(a>b);
            System.out.println(a<b);
            System.out.println(a<=b);
            System.out.println(a>=b);
        }catch(Exception s){}
      }
}
class reltnopr
{
    public static void main(String args[])
    {
        relational obj=new relational();
    }
}