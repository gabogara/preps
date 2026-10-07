package basicexercises.instancevsstatic;

public class ClassAndClassNested {
    public static void main(String[] args) {
        String s1 = "Maria";
        String s2 = "Jose";
        ClassAndClassNested c1 = new ClassAndClassNested();
        ClassAndClassNested.Person p1 =  c1.new Person(s1);
        System.out.println("You entered: " + p1.firstName);
//        System.out.println("You entered: " + p2.firstName);
    }

    public class Person{
        String firstName;

        public Person(){}

        public Person(String firstName){
            this.firstName = firstName;
        }

    }
}
