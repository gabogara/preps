package basicexercises.inheritance.animal;

public class Dog extends Animal{
    static void printSound(Animal animal){

    }
    @Override
    public void makeSound(){
        System.out.println("The dog is barking");
    }
    @Override
    public void eat(){
        System.out.println("The dog is eating");
    }
}
