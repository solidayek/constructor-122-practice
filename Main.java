/*
Complete Dog.java by:
-filling in the attributes
-creating the constructor

Instantiate 3 pizzas and print them out by:
-creating a Pizza class
-filling out the attributes
-creating the constructor
-use this code for the toString() method: 

    public String toString()

    {

        return size + " inch " + type + " pizza with " + toppings;

    }

-create the 3 pizzas and print them out

-your output should look like this:
12 inch Veggie pizza with Tomatoes, onions, olives
15 inch Cheese pizza with Cheese
20 inch Meat pizza with Pepperoni, sausage, bacon*/
class Main 
{
	public static void main(String[] args) 
	{
    	Dog myDog = new Dog("Kino", "male");

      
      System.out.println(myDog.toString());

    	
    	//instantiate 3 pizzas below and print them out below
     Pizza pizza1 = new Pizza(12, "Veggie", "Tomatoes,onions, olives");
     Pizza pizza2 = new Pizza(15, "Cheese", "Cheese");
     Pizza pizza3 = new Pizza(20, "Meat", "Pepperoni, sausage, bacon");


     System.out.println(pizza1.toString());
     System.out.println(pizza2.toString());
     System.out.println(pizza3.toString());





	}
}