public class Pizza 
{
    //attributes
    int size;
    // String topping1;  //i.e tomatoes
    // String topping2; //i.e onions
    // String topping3; //i.e olives
    String topping; //i.e olives

    String type;

    
    //constructor
    public Pizza(int pizzaSize, String pizzaType, String pizzaTopping)
    {
      size = pizzaSize;
      topping = pizzaTopping;
      type = pizzaType;

    
    }

    
    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    //12 inch Veggie pizza with Tomatoes, onions, olives

    public String toString()
    {
        return  Integer.toString(size) + " inch " + type +" pizza with " + topping + "." ;
    }

}