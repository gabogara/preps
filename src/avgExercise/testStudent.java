package avgExercise;

public class testStudent {
    public static void main(String[] args) {
        Subject math = new Subject("Mathematics",15,14.23, "John Connor");
        Subject science = new Subject("Science",13,18.7,"Steven Sparrow");
        Subject history = new Subject("History",14,15.1,"Jose Peres");
        Subject[] subjects = {math,science,history};
        Student gabriel = new Student("Gabriel Restrepo", "w2345553",subjects);
        double avg= gabriel.avgStudent();
        System.out.printf("The student %s, who has the ID: %s, has grade point average of %.2f and took the following subjects: %n", gabriel.getName(),gabriel.getId(),avg);
        for(Subject subject: subjects ){
            System.out.printf("%s: %.2f Points %n",subject.getSubjectName(),subject.getSubjectValue());
        }
    }
}
