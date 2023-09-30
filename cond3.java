class demo
{
    int x=10;
    int y=12;

    demo()
    {
        if(x>y)
        {
            System.out.println("The given number is smaller ");
        }
        else if(x==y)
        {
            System.out.println("The given number is equal");
        }
        else
        {
            System.out.println("The given number is larger");
        }

    }
    
}
class cond3
{
    public static void main(String args[])
    {
        new demo();
    }
}

