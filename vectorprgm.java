import java.util.*;
class names
{
    Vector<String> v=new Vector<String>();
    names()
    {
        v.add("surya");
        v.add("suraj");
        v.add("ram");
        v.add("raj");

        Iterator<String> itr=v.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}
class vectorprgm
{
    public static void main(String args[])
    {
        new names();
    }
}