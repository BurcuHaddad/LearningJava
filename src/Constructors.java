public class Constructors {
    int x; //Creating a class attribute

    //Create a class constructor for the class
    public Constructors() {
        x = 7; // Set initial value for the class attribute x
    }

    public static void main(String[] args) {
        Constructors myObject = new Constructors();
        //Created an onject of class Constructors and this will call the constructor.
        System.out.println(myObject.x);
    }
}

/* A constructor is a special method that is used to initialize objects.
It is called when an object of a class is created.
Can be used to set initial values for object attributes.
 */