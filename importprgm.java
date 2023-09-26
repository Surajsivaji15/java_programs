import java.io.DataInputStream;

class details
{
    DataInputStream din=new DataInputStream(System.in);
    details()
    {
        System.out.println("Enter your name :");
        try{
            din.readLine();
        }catch(Exception s){}
    }

}

class importprgm
{
    public static void main(String args[])
    {
       details obj=new details();
    }
}