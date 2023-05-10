abstract class AbsMain {
    public String fname = "John";
    public int age = 24;
    public abstract void study();
}

//Subclass
class Student extends AbsMain {
    public int graduationYear = 2018;
    public void study() {
        System.out.println("Studying all day long");
    }
}
