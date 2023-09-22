class maths
{
    maths()
    {

    }
    public void getdata(int x,int y)
    {
        System.out.println("the addition of two numbers="+(x+y));
    }
}
class maths1 extends maths
{
    maths1()
    {

    }
    public void getdata(int x,int y)
    {
        System.out.println("the multiple of two numbers="+(x*y));
    }
}
class override1
{
    public static void main(String args[])
    {
       maths ref;
       maths obj=new maths();
       maths1 obj1=new maths1();
       ref=obj;
       ref.getdata(10,12);
    }
}