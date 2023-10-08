class employee
{
    String name;
    int id;
    static String company="Tekfilo";

    employee(String name,int id)
    {
        this.name=name;
        this.id=id;
    }
    public void displayemployee()
    {
        System.out.println("Employee name ; "+name);
        System.out.println("Employee id ; "+id);
        System.out.println("Company name ; "+company);
    }
}
class staticprgm
{
    public static void main(String arg[])
    {
        employee ob=new employee("Praveen",4523);
        ob.displayemployee();
    }
}