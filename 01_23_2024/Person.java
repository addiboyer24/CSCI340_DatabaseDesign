public class Person{
    private String name;

    private int age;

    private String favoriteColor;

    public Person(String name, int age, String favoriteColor){
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    public static void main(String[] args) {
        Person myPerson = new Person("Addison Boyer", 27, "Blue");
        System.out.println(myPerson);
    }

    public String toString(){
        return this.name + " " + this.age + " " + this.favoriteColor;
    }
}