class Shop//
{//Convention - class name first letter is capital 
//
int price, discount;//non-static variables
static String name = "ABCD Groceries";
public static void main(String[] args)
{
Shop prod1 = new Shop();
Shop prod2 = new Shop();
prod1.price = 100;
prod1.discount = 10;
prod2.price = 200;
prod2.discount = 20;
prod1.buy();//method//what you mean by buy or take or bring? Meth
prod2.buy();
//System.out.println(cash);
prod1.give_juice();
Shop.give_juice();
give_juice();
}
static void give_juice()
{
System.out.println("juice");
}
void buy()//Method Signature
{//Method definition /body
int cash = 500;
System.out.println("Buying for " + (price-discount));
System.out.println(cash);
}

}
