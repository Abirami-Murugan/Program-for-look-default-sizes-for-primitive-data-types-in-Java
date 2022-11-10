class Calculator{
public static void main(String[] args)
{
Calculator calc = new Calculator();
calc.add(); 
int box= calc.subtract();
System.out.println(box);
calc.multiply(box,10);
calc.multiply(box,10,10);
calc.multiply(box,10,5.2f);
}
void multiply(int no1, int no2, float no3)
{
System.out.println(no1*no2*no3);
}
void multiply(int no1, int no2, int no3)
{
System.out.println(no1*no2*no3);

}
void multiply(int no1,int no2)
{
System.out.println(no1*no2);
}
int subtract()
{
int no1 = 10, no2 = 5;
return no1 - no2;
}
void add()
{
System.out.println(5+5);
}

}
