package avgExercise;

public class Subject {
    private final String subjectName;
    private final int credits;
    private final double subjectValue;
    private final String teacher;

    public Subject(String subjectName, int credits, double subjectValue, String teacher) {
        this.subjectName = subjectName;
        this.credits = credits;
        this.subjectValue = subjectValue;
        this.teacher = teacher;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public int getCredits() {
        return credits;
    }

    public double getSubjectValue() {
        return subjectValue;
    }

    public String getTeacher() {
        return teacher;
    }
}