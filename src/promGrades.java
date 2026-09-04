import java.util.Scanner;

public class promGrades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of grades you want to add: ");
        int numGrades = Integer.parseInt(input.nextLine());
        int[] grades = new int[numGrades];
        int sumGrades = 0;
        for(int i=0; i< grades.length; i++){
            System.out.printf("Grade [%d] = ",i);
            grades[i] = Integer.parseInt(input.nextLine());
            sumGrades += grades[i];
        }
        var average = sumGrades / numGrades;
        System.out.println("The grade avg is: "+ average);
    }
}
