abstract class info
{
    info()
    {

    }
    public void getdata()
    {

    }
    
    abstract public void getdata1(String name,String name1);
}
class info1 extends info
{
    info1()
    {

    }

    public void getdata1(String name,String name1)
    {
      System.out.println(name);
      System.out.println(name1);
    }
}
class prgmabs
{
    public static void main(String asd[])
    {
        info1 obj=new info1();
        obj.getdata1("hari","pravin");
    }
}
