public class MainClass {
    public static void main(String[] args){
        Animal a1=new Animal("Eagle",AnimalTypes.BIRD);
        Animal a2=new Animal("Salmon",AnimalTypes.FISH);
        Animal a3=new Animal("Bear",AnimalTypes.MAMMAL);
        Animal a4=new Animal("Snake",AnimalTypes.REPTILE);

        Animal[]animals={a1,a2,a3,a4};
        Zoo zoo=new Zoo(animals);
        zoo.printAnimals();
    }
}
