public class Cat extends Animal implements Moveable,Swimmable{

    @Override
    public void move(){ System.out.println("Cat Moves"); }

    @Override
    public void swim(){ System.out.println("Cat Swims"); }
}
