package tamilnadu.salem;
import tamilnadu.chennai.Office;
public class Branch extends Office
{
public static void main(String[] args)
{
Branch manager = new Branch();
manager.work();
manager.get_salary();
System.out.println(Branch.name);
}
}
