class Customer
{
public static void main(String[] args)
{
SuperMarket shopkeeper = new SuperMarket();
shopkeeper.buy();
int result = shopkeeper.pay(100);
shopkeeper.calculate_profit();
System.out.println(result);
}
}
