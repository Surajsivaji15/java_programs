import java.io.*;

class login
{
    DataInputStream obj=new DataInputStream(System.in);

    login()
    {
        try{
            System.out.println("Enter Firstname ;");
            obj.readLine();
            System.out.println("Enter Lastname ;");
            obj.readLine();
            System.out.println("Enter mailid ;");
            obj.readLine();
            System.out.println("Enter Phnumber ;");
            int a=Integer.parseInt(obj.readLine());
            System.out.println("Enter Password ;");
            obj.readLine();
            System.out.println("YOUR LOGIN WAS SUCCESSFUL !!!");
            
        }catch(Exception s){}
    }

}
class loginimport
{
    public static void main(String args[])
    {
        login asd=new login();
    }
}

