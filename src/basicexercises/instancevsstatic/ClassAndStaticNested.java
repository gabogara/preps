package basicexercises.instancevsstatic;

public class ClassAndStaticNested {
    public static void main(String[] args) {
        String s1 = "Maria";
        String s2 = "Jose";
        ClassAndStaticNested.Person p1 = new ClassAndStaticNested.Person(s1);
        ClassAndStaticNested.Person p2 = new ClassAndStaticNested.Person(s2);
        System.out.println("You entered: " + p1.firstName);
        System.out.println("You entered: " + p2.firstName);
        System.out.println(p2.getFirstName());
        System.out.println("The pay rate is: " + Person.RATING );
        System.out.println(Person.getRATING());
    }

    static class Person{
        String firstName;
        static int RATING = 4;

        public Person(){}

        public Person(String firstName){
            this.firstName = firstName;
        }
        public String getFirstName(){
            return firstName;
        }

        public static int getRATING(){
            return RATING;
        }


    }
}
