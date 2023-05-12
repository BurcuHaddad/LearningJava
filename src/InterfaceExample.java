//Interface
interface Farm {
    public void animalTypes(); //interface method (does not have a body)
    public void sleep(); //interface method
}

class Stable implements Farm {
    public void animalTypes() {
        //The body of animalTypes() is provided here
        System.out.println("The stable has: Foals, horses and ponies");
    }
    public void sleep() {
        System.out.println("Zzzz");
    }
}

class InterfaceExample {
    public static void main(String[] args) {
        Stable myStable = new Stable(); //Create stable object
        myStable.animalTypes();
        myStable.sleep();
    }
}
