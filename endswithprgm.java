class sample
{
    sample()
    {
       String msg="good morning to everyone";
       System.out.println(msg.endsWith("good morning"));
       System.out.println(msg.endsWith("everyone"));
    }
}
class endswithprgm
{
    public static void main(String args[])
    {
        new sample();
    }
}