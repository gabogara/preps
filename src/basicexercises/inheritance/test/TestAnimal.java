package basicexercises.inheritance.test;

import basicexercises.inheritance.animal.Animal;
import basicexercises.inheritance.animal.Cat;
import basicexercises.inheritance.animal.Dog;

public class TestAnimal {
     static void printSound(Animal animal){
        animal.makeSound();
    }
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        //animal1.makeSound();
        printSound(animal1);
        Dog toto = new Dog();
        //toto.makeSound();
        printSound(toto);
        Cat cat1 = new Cat();
        //cat1.makeSound();
        printSound(cat1);
        Animal animalDog = new Dog();
        printSound(animalDog);
    }
}
