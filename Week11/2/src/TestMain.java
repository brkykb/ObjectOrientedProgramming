public class TestMain {

    public static void main(String args[]) {

        Cat cat = new Cat();
        Duck duck = new Duck();
        Eagle eagle = new Eagle();

        Animal[] animals = new Animal[]{cat, duck, eagle};

        for (Animal a : animals) {

            if (a instanceof Swimmable){
                ((Swimmable)a).swim();
            }
            if(a instanceof Flyable){
                ((Flyable)a).fly();
            }
            if(a instanceof Moveable){
                ((Moveable)a).move();
            }
        }
    }
}
