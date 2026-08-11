public class emailGenerator {
    static String createEmail(String firstName,String lastName,String company,String domain){
        var fullName = String.join(".", firstName, lastName);
        var result = fullName + "@" + company + domain;
        return result;
    }
    public static void main(String[] args) {
        String fName  = "Gabriel";
        String lName = "Restrepo";
        String comp = "intuit";
        String dom = ".com";
        var result_function = createEmail(fName,lName,comp,dom);
        System.out.println(result_function);
    }
}
