public class Animal{

    private int animalId;

    public Animal(int animalId){
        this.animalId = animalId;
    }

    public String speak(){
        return "Blah";
    }
    public static void main(String[] args) {
        Animal myAnimal = new Animal(1);
        System.out.println(myAnimal);
    }
}