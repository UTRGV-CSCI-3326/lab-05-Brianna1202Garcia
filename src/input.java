import java.util.Scanner;

public class input {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);
       
       //Get and store the user's name. (Store as text)
       String user_name;
       user_name = scanner.nextLine();
       //Get and store the user's age. (Store as a whole number)
       int user_age;
       user_age = scanner.nextInt();
       //Get and store the user's weight. (Store it as a real number)
       double user_weight;
       user_weight = scanner.nextDouble();
       //Get and store if the user is a smoker. (Store it as either true or false)
       Boolean user_smoker;
       user_smoker = scanner.nextBoolean();
       //Output all of the information back to the user.        
       System.out.println(user_name + user_age + user_weight + user_smoker);
    }
}
