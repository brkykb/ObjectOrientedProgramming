public class Zoo {

    Animal []animals;

    public Zoo(Animal[] animals){
        this.animals=animals;
    }
    public void printAnimals(){
        for(Animal r: animals){
            System.out.println(r);
        }
    }
}
