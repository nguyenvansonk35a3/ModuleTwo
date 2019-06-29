package Chap05_InterfaceAbstract.THAnimal;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Tieng keu chicken!";
    }

    @Override
    public String howtoEat() {
        return "Chicken an thoc!";
    }

}
