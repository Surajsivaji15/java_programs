package suraj;

public class pack1
{
    public String firstname,lastname,gender;

    public pack1(String firstname,String lastname,String gender)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.gender=gender;
    }
    public void displaypack1()
    {
        System.out.println("Enter the first name ;"+firstname);
        System.out.println("Enter the last name ;"+lastname);
        System.out.println("Enter the gender "+gender);
    }
    
}
