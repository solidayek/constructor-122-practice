public class Dog 
{
    //attributes
    String name;
    String breed;

    
    //constructor
    public Dog(String dogName, String dogBreed)
    {
      name = dogName;
      breed = dogBreed;
    
    }

    
    // This method should work after you add the
    // new instance variable and update the constructor.
    // DO NOT modify this method.
    public String toString()
    {
        return name + " is a " + breed;
    }
}
