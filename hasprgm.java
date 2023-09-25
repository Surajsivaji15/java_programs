class institute
{
    String name;
    int courses;

    institute(String name,int courses)
    {
       this.name=name;
       this.courses=courses;
    }
}
class student
{
    String name;
    String course;
    institute add;

    student(String name,String course,institute add )
    {
      this.name=name;
      this.course=course; 
      this.add=add;
    }
    public void displaydetails()
    {
       System.out.println("Student Name="+name);
       System.out.println( "Student Course="+course);
       System.out.println("Institute name="+add.name);
       System.out.println("Institute course="+add.courses);
    }
}
class hasprgm
{
    public static void main(String args[])
    {
        institute obj=new institute("I18N solution",6);
        student obj1=new student("Hari","Java developer",obj);
        obj1.displaydetails();
    }
}
