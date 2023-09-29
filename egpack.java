package suraj;

public class egpack
{ 
    String name;
    String city;

    public egpack(String name,String city)
    {
        this.name=name;
        this.city=city;

    }
public void displayegpack()
    {
        System.out.println("Customer name= "+name);
        System.out.println("Customer city= "+city);

    }
}