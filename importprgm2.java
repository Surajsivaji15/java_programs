import java.io.*;

class marks
{
    DataInputStream ob=new DataInputStream(System.in);
     
 marks()
  {
     try{
        System.out.println("Marks scored in TAMIL ; " );
        int a=Integer.parseInt(ob.readLine());
        System.out.println("Marks scored in ENGLISH ;");
        int b=Integer.parseInt(ob.readLine());
        System.out.println("Marks scored in MATHS ;");
        int c=Integer.parseInt(ob.readLine());
        System.out.println("Marks scored in SCIENCE ;");
        int d=Integer.parseInt(ob.readLine());
        System.out.println("Marks scored in SOCIAL ;");
        int e=Integer.parseInt(ob.readLine());
        System.out.println("Total marks="+(a+b+c+d+e));
     }catch(Exception e){}
  }

}
class importprgm2
{
    public static void main(String args[])
    {
        marks obj=new marks();
    }
}
