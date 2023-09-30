class demo
{
    int x=12;
    demo()
    {
        if (x>0)
        {
            System.out.println("The given number is positive ");
        }
        else
        {
            System.out.println("The given number is negative ");
        }


    }
}
class cond2
{
    public static void main(String args[])
    {
       new demo();
    }
}
