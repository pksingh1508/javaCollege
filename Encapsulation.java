/*
 * The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users. To achieve this, you must: declare class variables/attributes as private provide public get and set methods to access and update the value of a private variable
 */
public class Encapsulation {
    public static void main(String[] args) {
       Person pObj = new Person();
       // gives error because name is private
        //    pObj.name = "john";

        pObj.setName("Abhinav Singh");
        System.out.println("The name of the Person classs is : " + pObj.getName());

    }
}
