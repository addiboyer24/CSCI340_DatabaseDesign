public class LargeAnimal extends Animal{

    String dietType;

    public LargeAnimal(int animalId, String dietType){
        super(animalId);
        this.dietType = dietType;
    }

    public String speak(){
        return "Blah Large Animal";
    }
    public static void main(String[] args) {
        LargeAnimal myLargeAnimal = new LargeAnimal(1, "Keto");
        System.out.println(myLargeAnimal.speak());
    }
}