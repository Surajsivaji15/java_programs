import java.io.DataInputStream;

class student()
{
    DataInputStream din=new DataInputStream(System.in);

    student()
    {
        try{
            System.out.println("enter the student name ;");
            din.readLine();
            System.out.println("enter the student age ;");
            int x=Integer.valueOf(din.readLine()).intValue();
        }catch(Exception s){}

    }
}
class importprgm1
{
    public static void main(String args[])
    {
        student obj=new student();
    }
}