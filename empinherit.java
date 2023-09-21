
class employee
{
    String name;
    int age;
    
    employee()
        {
            name="Suraj";
            age=24;
        }
        public void displayemployee()
        {
            System.out.println("Employee name ="+name);
            System.out.println("Employee age="+age);
        }        }

class leader extends employee
{
  leader()
    {
        name="Ramesh";
        age=30;
    }
    public void displayleader()
    {
        System.out.println("Leader name="+name);
        System.out.println("Leader age="+age);
    }
}
class empinherit
{
    public static void main(String args[])
    {
        leader obj=new leader();
        employee obj1=new employee();
        
        obj1.displayemployee();   
        obj.displayleader();
    }
}
