class name
{
    name()
    {

    }
    public void getdata(String x)
    {
        System.out.println("My name is Suraj");
    }
}
class city extends name
{
    city()
    {

    }
    public void getdata(String x)
    {
        System.out.println("My city name is ooty");       
    }
}
class override
{
    public static void main(String args[])
    {
        name obj=new name();
        obj.getdata("Suraj");
        city obj1=new city();
        obj1.getdata("Surya");
    }

}