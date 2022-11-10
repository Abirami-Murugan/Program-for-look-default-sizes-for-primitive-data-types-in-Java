package tamilnadu.salem;
import tamilnadu.chennai.Office;
public class Sub_Branch extends Office
{
public static void main(String[] args)
{
Sub_Branch manager = new Sub_Branch();
manager.work();
manager.get_salary();
System.out.println(Sub_Branch.name);
}
public void declare_holiday()
{
System.out.println("holiday");
}
}
