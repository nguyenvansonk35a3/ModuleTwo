package Chap05_InterfaceAbstract.THAnimal;

public class Tiger extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Tieng keu Tiger!";
    }

    @Override
    public String howtoEat() {
        return "Tiger an thit ";
    }

}
