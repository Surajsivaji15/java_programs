interface one
{
   public void getone();
}
interface two extends one
{
   public void gettwo();
}
class student1
{
    String name1;
    int age1;

    student1()
    {
       name1="Pravin";
       age1=21;
    }
    
}
class student2 extends student1 implements two
{
    String name;
    int age;

    student2()
    {
       name="Surya";
       age=21;
    }
    @Override
    public void getone()
    {
        System.out.println("Student1 name="+name1);
        System.out.println("Student1 age="+age1 );
    }
    public void gettwo()
    {
        System.out.println("Student2 name="+name);
        System.out.println("Student2 age="+age);
    }
}
class prgrminterface
{
    public static void main(String args[])
    {
       student2 obj=new student2();
       obj.getone();
       obj.gettwo();
    }
}