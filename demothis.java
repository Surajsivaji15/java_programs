
class sample
{
  sample(int x,int y,int z)
   {
     System.out.println(x+y+z);
   }
  sample(sample x)
   {
    x.getdata(10,12,15);
   }
  public void getdata(int x,int y,int z)
   {
     System.out.println(x*y*z);
   }
}

class demothis
{
  public static void main(String args[])
   {
     sample obj=new sample(10,12,15);
     sample obj1=new sample(obj);     
   }
}
