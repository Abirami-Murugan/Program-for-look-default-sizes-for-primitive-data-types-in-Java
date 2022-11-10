class SuperMarket
{
public static void main(String[] args)
{
SuperMarket manager = new SuperMarket();
manager.calculate_profit();
}
void buy()
{
System.out.println("Buying");
}
int pay(int amount)
{
System.out.println("payments " +amount);
return 10;
}
private void calculate_profit()
{
System.out.println("profit");
}
}
