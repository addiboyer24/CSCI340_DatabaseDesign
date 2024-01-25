public class ExampleObject{
    private String name;

    private int age;

    public ExampleObject(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "{" + "\"name\": \"" + this.name + "\", \"age\": " + this.age + "}";
    }

    public static void main(String[] args) {
        ExampleObject myObject = new ExampleObject("Addison Boyer", 27);
        System.out.println(myObject); // json version of object to introduce state persistence.
    }
}