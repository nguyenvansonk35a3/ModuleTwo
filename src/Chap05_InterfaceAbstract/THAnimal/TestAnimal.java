package Chap05_InterfaceAbstract.THAnimal;

public class TestAnimal {

    public static void main(String[] args) {
        //Khoi tao va test Animal
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            //test Chicken
            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howtoEat());
            }
            //test Tiger
            if (animal instanceof Tiger) {
                Edible edible = (Tiger) animal;
                System.out.println(edible.howtoEat());
            }
        }

        //test Fruit
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }

    }
}
