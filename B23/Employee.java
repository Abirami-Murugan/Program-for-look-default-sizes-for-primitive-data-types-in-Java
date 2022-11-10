public class Employee implements Rules
{
//javac Employee.java
public static void main(String[] args)
{
/*Employee emp = new Employee(); 
emp.work(); 
emp.give_salary(); 
emp.watch_movies();*/
Rules manager = new Employee();//Dynamic binding
manager.work();
manager.give_salary();
System.out.println(manager.no_of_leaves);
}
public void watch_movies()	{		}
public void work(){		}

public void give_salary()	{		}

}
