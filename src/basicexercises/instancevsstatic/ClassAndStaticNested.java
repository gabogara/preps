package basicexercises.instancevsstatic;

public class ClassAndStaticNested {
    public static void main(String[] args) {
        String s1 = "Maria";
        String s2 = "Jose";
        ClassAndStaticNested.Person p1 = new ClassAndStaticNested.Person(s1);
        ClassAndStaticNested.Person p2 = new ClassAndStaticNested.Person(s2);
        System.out.println("You entered: " + p1.firstName);
        System.out.println("You entered: " + p2.firstName);
    }

    static class Person{
        String firstName;

        public Person(){}

        public Person(String firstName){
            this.firstName = firstName;
        }

    }
}
