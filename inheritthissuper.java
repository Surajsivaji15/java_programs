class son
{
    String name;
    int age;

    son()
    {
        name="Suraj";
        age=24;
        this.displayson();
    }
    public void displayson()
    {
        System.out.println("Son name="+name);
        System.out.println("Son age="+age);
    }
}
class mother extends son
{
    mother()
    {
        super();
        name="Padmavathi";
        age=45;
        this.displaymother();
    }
    public void displaymother()
    {
        System.out.println("Mother name="+name);
        System.out.println("Mother age="+age);
    }
}
class father extends mother
{
    father()
    {
        super();
        name="Sivaji";
        age=55;
        this.displayfather();
    }
    public void displayfather()
    {
        System.out.println("Father name="+name);
        System.out.println("Father age="+age);
    }   
}
class inheritthissuper
{
    public static void main(String args[])
    {
        father obj=new father();
    }
}