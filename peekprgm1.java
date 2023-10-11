import java.util.*;
class bikes
{
    LinkedList a1=new LinkedList();
    bikes()
    {
        a1.add("yamaha");
        a1.add("enfield");
        a1.add("tvs");
        a1.add("honda");

        System.out.println("peek element is "+a1.peek());
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
class peekprgm1
{
    public static void main(String args[])
    {
        new bikes();
    }
}