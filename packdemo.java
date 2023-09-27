import suraj.pack1;

class packs extends pack1
{
    int pswrd;

    packs(String firstname ,String lastname ,String gender,int pswrd)
     {
        super(firstname,lastname,gender);
        this.pswrd=pswrd;
     }
     public void displaypacks()
     {
        System.out.println("Enter the pswrd ;"+pswrd);
     }
}
class packdemo
{
   public static void main(String args[])
   {
      packs obj=new packs("Suraj","Surya","male",1234);
      obj.displaypack1();
      obj.displaypacks();
   }
}