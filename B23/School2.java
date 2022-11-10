class School2
{
int roll_no;//Instance Specific Variable
//non-static variable
static int min_pass = 35;
public static void main(String[] args)
{
School student1 = new School();//Instance - Object


System.out.println(School.min_pass);
System.out.println(min_pass);
School student2 = new School();
School student3 = new School();
System.out.println(student1.min_pass);
student1.roll_no = 123;//=->Assignment operator
student2.roll_no = 234;
student3.roll_no = 456;
System.out.println(student1.roll_no);
System.out.println(student2.roll_no);
System.out.println(student3.roll_no);
//System.out.println(roll_no);
//non-static variable roll_no cannot be referenced from a static context

}
}
