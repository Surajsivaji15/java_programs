class players
{
    String name;
    int age;
    static String game="CRICKET";
    static String country="INDIA";

    players(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void displayplayers()
    {
        System.out.println("Player name = "+name);
        System.out.println("Player age = "+age);
        System.out.println("Player game = "+game);
        System.out.println("Player country = "+country);
    }
}
class staticprgm1
{
    public static void main(String args[])
    {
       players ob=new players("Virat kholi",34);
       ob.displayplayers();
       players ob1=new players("Rohit sharma",36);
       ob1.displayplayers();
       players ob2=new players("Suryakumar yadav",30);
       ob2.displayplayers();
       players ob3=new players("Shubam gill",23);
       ob3.displayplayers();
    }
}