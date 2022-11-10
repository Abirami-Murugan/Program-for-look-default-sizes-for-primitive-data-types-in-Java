class School
{
int roll_no;//Instance Specific Variable
//non-static variable
public static void main(String[] args)
{
School student1 = new School();//Instance - Object
School student2 = new School();
School student3 = new School();
student1.roll_no = 123;//=->Assignment operator
student2.roll_no = 234;
student3.roll_no = 456;
System.out.println(student1.roll_no);
System.out.println(student2.roll_no);
System.out.println(student3.roll_no);
System.out.println(roll_no);
//non-static variable roll_no cannot be referenced from a static context

}
}
