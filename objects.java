public class objects {
    private final String  name = "Cezary";
    private final String email = "example@gmail.com";
    private final int age = 20;

    public static void main(String[] args){
        objects MyObj = new objects();
        System.out.println("Name: " + MyObj.name + "\nEmail: " + MyObj.email + "\nAge:" + MyObj.age);
    }
}
