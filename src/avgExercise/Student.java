package avgExercise;

public class Student {
    private final String name;
    private final String id;
    private final Subject[] subjects;

    public Student(String name, String id, Subject[] subjects){
        this.name=name;
        this.id=id;
        this.subjects = subjects;
    }

    public double avgStudent(){
        if (subjects == null || subjects.length == 0) {
            return 0.0;
        }
        double sumSubjectValue =0.0;
        for(Subject subject: subjects){
            sumSubjectValue += subject.getSubjectValue();
        }
        return sumSubjectValue / subjects.length;
    }
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Subject[] getSubjects(){
        return subjects;
    }

}
