class sample
{
    int x=14,y=16,z=45;

    sample()
    {
        if(((x<y)&&(y<z)) || (x<z))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
class samplelog
{
    public static void main(String args[])
    {
        sample s=new sample();
    }
}