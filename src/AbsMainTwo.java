class AbsMainTwo {
    public static void main(String[] args) {
        //create an obj of the Student class (inherits attributes and methods from AbsMain)
        Student myObj = new Student();

        System.out.println("Name: " + myObj.fname);
        System.out.println("Age " + myObj.age);
        System.out.println("Graduation Year: " + myObj.graduationYear);
        myObj.study();
    }
}
