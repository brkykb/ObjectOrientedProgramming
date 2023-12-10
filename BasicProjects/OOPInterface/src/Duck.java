public class Duck extends Animal implements Moveable,Swimmable,Flyable{
    @Override
    public void move() { System.out.println("Duck Moves"); }

    @Override
    public void swim() { System.out.println("Duck Swims"); }

    @Override
    public void fly() { System.out.println("Ducks Flies"); }
}
