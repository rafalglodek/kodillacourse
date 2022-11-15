import java.util.Scanner;

public class Logic {
    public static void play() {
        System.out.println("1 - Rock"+'\n'+
                           "2 - Paper"+'\n'+
                           "3 - Scissors"+'\n'+
                           "x - Finish game"+'\n'+
                           "n - Restart game"
        );

        boolean end = false;
        int computerWin = 0;
        int playerWin = 0;

        for (int n = 0; n < 30; n++) {

            while (!end) {
                Scanner scan = new Scanner(System.in);

                int numberChosenByPlayer = 0;
                String letterChosenByPlayer = "k";

                if (scan.hasNextInt()) {
                    numberChosenByPlayer = scan.nextInt();
                    System.out.println(numberChosenByPlayer);
                } else {
                    letterChosenByPlayer = scan.nextLine();
                    System.out.println(letterChosenByPlayer);
                }

                int min = 1;
                int max = 3;
                int random_int = (int) Math.floor(Math.random() * (max - min + 1) + min);

                int playerWin1 = 0;
                int computerWin1 = 0;
                System.out.println(random_int);

                if (random_int == 1 && numberChosenByPlayer == 2) {
                    playerWin1 = 1;
                } else if (random_int == 2 && numberChosenByPlayer == 3) {
                    playerWin1 = 1;
                } else if (random_int == 3 && numberChosenByPlayer == 1) {
                    playerWin1 = 1;
                } else if (numberChosenByPlayer == 1 && random_int == 2) {
                    computerWin1 = 1;
                } else if (numberChosenByPlayer == 2 && random_int == 3) {
                    computerWin1 = 1;
                } else if (numberChosenByPlayer == 3 && random_int == 1) {
                    computerWin1 = 1;
                }

                playerWin = playerWin + playerWin1;
                computerWin = computerWin + computerWin1;

                if (playerWin > 3 || computerWin > 3) {
                    end = true;
                } else if (letterChosenByPlayer.equals("x")) {
                    end = true;
                } else if (letterChosenByPlayer.equals("n")) {
                     new RpsRunner().restart();

                }
                System.out.println(playerWin + " " + "You counts");
                System.out.println(computerWin + " " + "Computer counts");
            }
        }
        if (playerWin > 3) {
            System.out.println("You won");
        } else if (computerWin > 3) {
            System.out.println("Computer wins");
        }
    }
}
