public class ParameterConstructor {
    int modelYear;
    String modelName;

    // access modifier for constructor is either public or private or nothing
    private ParameterConstructor(int x, String y) {
        modelYear = x;
        modelName = y;
    }

    public static void main(String[] args) {
        ParameterConstructor obj = new ParameterConstructor(2000, "Mercedes-Benz");

         ParameterConstructor obj1 = new ParameterConstructor(2001, "Mercedes");
          ParameterConstructor obj2 = new ParameterConstructor(2002, "Mercedes-Benz-audi");

        System.out.println("Model Year : " + obj.modelYear + " Model Name : " + obj.modelName);

        System.out.println("Model Year : " + obj1.modelYear + " Model Name : " + obj1.modelName);

        System.out.println("Model Year : " + obj2.modelYear + " Model Name : " + obj2.modelName);
    }
}
