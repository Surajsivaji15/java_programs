class sample extends Thread
{
    Thread t=new Thread(this);
    sample()
    {
        for(int i=0;i<10;i++)
        {
            try{
                System.out.println(i);
                t.sleep(2000);
            }catch(Exception d){}
        }
      
    }
}



class threadprgm
{
    public static void main(String asd[])
    {
        sample obj=new sample();
        
    }
}