package Chap05_InterfaceAbstract.demoFly;

public class Bird implements Flyable {

    @Override
    public void fly() {
        System.out.println("Bird can fly...");
    }

    @Override
    public String fly2() {
        return "Son can fly....";
    }

    
    //test Bird
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.fly();
        System.out.println(bird.fly2());
    }

}
