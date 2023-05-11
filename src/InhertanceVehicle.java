class InhertanceVehicle {
    protected String brand = "Ford"; //Vehicle attribute
    public void honk() {   //Vehicle method
        System.out.println("Tuut, tuut");
    }
}

class Car extends InhertanceVehicle {
    private String modelNames = "Mustang"; // Car attribute
    public static void main(String[] args) {

        //Create myCar object
        Car myFastCar = new Car();

        //Call the honk() method on the myCar object
        myFastCar.honk();

        //Display the value of the brand attribute and the value of the modelName
        System.out.println(myFastCar.brand + " " + myFastCar.modelNames);
    }
}
