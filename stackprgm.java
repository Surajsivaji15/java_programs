import java.util.*;
class students
{
    Stack<String> s=new Stack();
    students()
    {
        s.push("pranesh");
        s.push("sarnesh");
        s.push("surya");
        s.push("surya");
        s.push("suraj");
        s.push("thamanna");
        System.out.println("Student names ;"+s);
        String names=s.peek();
        System.out.println("First rank ;"+names);
    }
}
class stackprgm
{
    public static void main(String args[])
    {
        new students();
    }
}