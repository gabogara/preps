import java.util.Random;


    public class selectingFoodMenu{
        public static void main(String[] args) {
            String dinner = chooseDinner("Pasta", "Beans", "Grilled Chicken", "Pulled Pork");
            System.out.println(dinner);
        }
    public static String chooseDinner(String... meals){
            if(meals.length == 0){
                return "There is not options for you!";
            }
            System.out.printf("Randomly choosing %d dinner options... %n", meals.length);
            Random random = new Random();
            return meals[random.nextInt(meals.length)];
        }
    }