import java.util.Scanner;

public class Question6NBA {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Whats your favorite team?");
        String userAnswers = keyboard.nextLine().toUpperCase();



        NBAteams usersTeam = NBAteams.valueOf(userAnswers);

        System.out.println("Your favorite team is the " + usersTeam + " from " + usersTeam.getCity());
    }
}
