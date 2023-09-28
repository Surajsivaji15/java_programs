class sample
{
    sample(int x,int y)
    {
        System.out.println(x+y);
    }
    sample(String str)
    {
        System.out.println(str);
    }
}
class prgmcons
{
    public static void main(String args[])
    {
        sample obj=new sample(10,20);
        sample obj1=new sample("Suraj");
    }
}    
