import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String userInput = "";
        System.out.println("Type something: ");
        userInput = keyboard.next();

        while (userInput != "") {
            System.out.println(userInput);
            System.out.println("Please enter STOP if you no longer want to play?");
            userInput = keyboard.next();
            if(userInput.equalsIgnoreCase("stop")){
                break;
            }
        }

    }
}
