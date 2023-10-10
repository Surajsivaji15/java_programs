import java.util.*;
class fruits
{
    ArrayList a=new ArrayList();
    fruits()
    {
        a.add("mango");
        a.add("apple");
        a.add("orange");
        a.add("graphes");

        Iterator itr=a.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        
    }
}
class arraylist2
{
    public static void main(String args[])
    {
        new fruits();
    }
}