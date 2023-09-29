package suraj;

public class egpack1 extends egpack
{
    int phnum;

    public egpack1(String name,String city,int phnum)
    {
        super(name, city);
        this.phnum=phnum;


    }
    public void displayegpack1()
    {
        System.out.println("Customer mobile number= "+phnum);
    }
    
}
class details
{
    public static void main (String args[])
    {
        egpack1 obj=new egpack1("Surya","Ooty",76393);
        obj.displayegpack();
        obj.displayegpack1();
    }
}
