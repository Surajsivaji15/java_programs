class sample
{
    sample()
    {
      StringBuffer sb=new StringBuffer("PRAVEEN");
      sb.replace(0,7,"SURAJ");
      System.out.println(sb);

    }
}
class sbreplace
{
    public static void main(String args[])
    {
        new sample();
    }
}