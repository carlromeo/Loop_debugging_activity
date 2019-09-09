import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String answer, userInput = "";

        answer = "Chelsea";

        System.out.println("Which team will win the Premier League this season?");
        userInput = keyboard.nextLine();

        while (!userInput.equalsIgnoreCase(answer))
        {
            System.out.println("\nHahaha, no chance in hell" + " " + userInput + " " + "is winning this season!");
            System.out.println("Nice try though! Now try another team. Maybe this time, you'll pick the real champions!!!");
            userInput = keyboard.nextLine();
        }
            System.out.println("Maaa Man!!! Go Blues!!!");
            keyboard.close();
    }
}
