class Food
{
int price;

Food(int price)
{
this.price=price;
}

void show()
{
System.out.println("\nPRICE: "+price);
}}

class Veg extends Food
{
String name,ing;

Veg(int price,String name,String ing)
{
super(price);
this.name=name;
this.ing=ing;
}

void show()
{
super.show();
System.out.println("NAME: "+name);
System.out.println("ING: "+ing);
}}

class NonVeg extends Food
{
String name,type;

NonVeg(int price,String name,String type)
{
super(price);
this.name=name;
this.type=type;
}

void show()
{
super.show();
System.out.println("NAME: "+name);
System.out.println("TYPE: "+type);
}}

public class FoodInh
{
public static void main(String[]st)
{
Veg v1= new Veg(260,"Cheese Butter Masala","Cheese, Butter");
NonVeg n1= new NonVeg(300,"Butter Chicken","Chicken");

v1.show();
n1.show();
}}