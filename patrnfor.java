class sample
{
    sample()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
class patrnfor
{
    public static void main(String args[])
    {
        sample ob=new sample();
    }
}