class student1
{
    public void getdata()
    {
        System.out.println("Student1 name is Suraj");
        System.out.println("Student1 city is Ooty");
    }
}
class student2
{
    public void getdata1()
    {
        System.out.println("Student2 name is Pravin");
        System.out.println("student2 city is salem");
    }
}
class method2
{
    public static void main(String args[])
    {
        new student1().getdata();
        new student2().getdata1();
    }
}