public class ConstParams {
    int modelYear;
    String modelName;

    public ConstParams(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        ConstParams myCar = new ConstParams(1971, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
