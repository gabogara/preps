public class formatingStr {
    public static void main(String[] args) {
        var name = "Gabo";
        var age = 32;
        var salary = 2000.80;

        // str formatting
        var message = String.format("Name: %s, Age: %d, Salary: $%.2f", name,age,salary);
        System.out.println("message = " + message);

        System.out.printf("Name: %s, Age: %d, Salary: $%.2f", name, age, salary);


        // large format
        var workerId = 5;
        var largeMsg = """
                %nDetail person: \s
                -------------------------
                \tName: %s
                \tAge: %d
                \tWorker ID: %04d
                \tSalary: %.2f
                """.formatted(name, age,workerId, salary);
        System.out.println("largeMsg = " + largeMsg);

        // using
    }
}
