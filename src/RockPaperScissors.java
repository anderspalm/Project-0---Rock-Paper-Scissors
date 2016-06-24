/**
 * Created by andeski on 6/24/16.
 */
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RockPaperScissors {

// file writer

    public static int counter = 0;
    //    public static int win = 0;
//    public static int lose;
//    public static int tied;
    private static List<String> human_history = new ArrayList<>();
    private static List<String> com_history = new ArrayList<>();
    private static List<String> success_history = new ArrayList<>();
    private static List<String> final_say_human = new ArrayList<>();
    private static List<String> final_say_comp = new ArrayList<>();

    public static void main(String[] args) {
        String[] history_array = new String[100];
        home();

    }

    public static void home() {
        System.out.println('\n');
        System.out.println("Welcome, please choose an option below");
        System.out.println("This is a best out of three game");
        System.out.println('\n');
        System.out.println("-------------- Begin ---------------");
        System.out.println('\n');
        System.out.println("Type 'play' or 'history' to commence");
        System.out.println('\n');

        Scanner scanner = new Scanner(System.in);
        String input_one = scanner.nextLine();
        String menu_input = input_one.toLowerCase();

        if (menu_input.equals( "play") ){
            play();
        }
        else if (menu_input.equals("history")) {
            history();
        }
        else {
            home();
        }
    }

    public static void history() {

        if (counter < 3) {
            System.out.println("There is nothing to display");
            home();
        }
        else {
            System.out.println("------------- Human history ---------------");
            for(int i = 0; i < human_history.size(); i += 3) {
                System.out.print(human_history.get(i) + " ");
                System.out.print(human_history.get(i + 1) + " ");
                System.out.println(human_history.get(i + 2) + " ");
            }
//            System.out.println("You have won the challenge " + "\n" + final_say_human.size() + " times.");
            System.out.println('\n');
            System.out.println("------------ Computer history ------------");
            for(int i = 0; i < com_history.size(); i += 3) {
                System.out.print(com_history.get(i) + " ");
                System.out.print(com_history.get(i + 1) + " ");
                System.out.println(com_history.get(i + 2) + " ");
            }

//            System.out.println("The computer has won " + "\n" + final_say_comp.size() + " times.");
            Scanner scanner = new Scanner(System.in);
            System.out.println('\n');
            System.out.println("Do you want to return to the main menu");
            System.out.println("Type 'yes' or 'no' ");
            String input_three = scanner.nextLine();
            String play_input = input_three.toLowerCase();
            if (play_input.equals("yes")) {
                home();
            } else {

            }
        }
    }


    public  static void play() {
        System.out.println('\n');
        if (counter == 1) {
            System.out.println("----------- 2 more tries -----------");
        }
        if (counter == 2) {
            System.out.println("------------ 1 more try ------------");
        }
        System.out.println("Please choose rock, paper or scissors");
        Scanner scanner = new Scanner(System.in);
        String input_two = scanner.nextLine();
        String play_input = input_two.toLowerCase();
        String[] computer_array = {"rock", "paper", "scissors"};
        String step = (computer_array[new Random().nextInt(computer_array.length)]);
        String random = step.substring(0, 1).toUpperCase() + step.substring(1);

        if ((play_input.equals("rock")) || (play_input.equals("paper")) || (play_input.equals("scissors"))) {

            switch (play_input) {

                case "rock":
                    System.out.println('\n');
                    System.out.println("usr: Rock");
                    System.out.println("com: " + random);
                    System.out.println('\n');
                    human_history.add("Rock");
                    com_history.add(random);

                    if (random.equals("Rock")) {
                        System.out.println("Please try again");
//                        tied = tied + 1;
                        if ((counter % 3) == 0) {
                            home();
                        } else {
                            play();
                        }
                    } else if (random.equals("Paper")) {
                        System.out.println("You lose");
                        counter = counter + 1;
                        success_history.add("Loss");
//                        lose = lose + 1;
                        if ((counter % 3) == 0) {
                            home();
                        } else {
                            play();
                        }
                    } else {
                        System.out.println("You won!");
                        counter = counter + 1;
                        success_history.add("Win");
//                        win = win + 1;
                        if ((counter % 3) == 0) {
                            home();
                        } else {
                            play();
                        }
                    }
                    break;
                case "scissors":
                    System.out.println("usr: Scissors");
                    System.out.println("com: " + random);
                    System.out.println('\n');
                    human_history.add("scissors");
                    com_history.add(random);
                    if (random.equals("Rock")) {

                        System.out.println("you lost");
                        counter = counter + 1;
                        success_history.add("Loss");
//                        lose = lose + 1;
                        if ((counter % 3) == 0) {
                            home();
                        } else {
                            play();
                        }
                    } else if (random.equals("Paper")) {


                        System.out.println("You won!");
                        counter = counter + 1;
//                        win = win + 1;
                        success_history.add("Win");
                        if ((counter % 3) == 0) {
                            home();
                        } else {
                            play();
                        }
                    } else {
                        System.out.println("you tied!");
//                        tied = tied + 1;
                        if ((counter % 3) == 0) {
                            home();
                        } else {
                            play();
                        }
                    }
                    break;
                case "paper":
                    System.out.println("usr: Paper");
                    System.out.println("com: " + random);
                    System.out.println('\n');
                    human_history.add("paper");
                    com_history.add(random);
                    if (random.equals("Rock")) {
                        System.out.println("you won!");
                        counter = counter + 1;
                        success_history.add("Win");
//                        win = win + 1;
                        if ((counter % 3) == 0) {
                            home();
                        } else {
                            play();
                        }
                    } else if (random.equals("Paper")) {
                        System.out.println("you tied!");
//                        tied = tied + 1;
                        if ((counter % 3) == 0) {
                            home();
                        } else {
                            play();
                        }
                    } else {
                        System.out.println("you lost");
                        counter = counter + 1;
                        success_history.add("Loss");
//                        lose = lose + 1;
                        if ((counter % 3) == 0) {
                            home();
                        } else {
                            play();
                        }
                    }
            }

            if ((counter % 3) == 0) {
                win_lose_tie_count();
            }
        }
        else {
            System.out.println("You wrote " + play_input);
            System.out.println("Please type one of the following");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            play();
        }


    }

    public static void win_lose_tie_count() {

//        for(int i = 0; i < success_history.size(); i += 3) {
//            if ((success_history.get(i).equals("Win")) && (success_history.get(i + 1).equals("Win") ) && (success_history.get(i + 2).equals("Win"))){
//                final_say_human.add("Win");
//            }
//            else if ((success_history.get(i).equals("Win")) && (success_history.get(i + 1).equals("Win") ) && (success_history.get(i + 2).equals("Loss"))){
//                final_say_human.add("Win");
//            }
//            else if ((success_history.get(i).equals("Win")) && (success_history.get(i + 1).equals("Loss") ) && (success_history.get(i + 2).equals("Win"))){
//                final_say_human.add("Win");
//            }
//            else if ((success_history.get(i).equals("Loss")) && (success_history.get(i + 1).equals("Win") ) && (success_history.get(i + 2).equals("Win"))){
//                final_say_human.add("Win");
//            }
//            else if ((success_history.get(i).equals("Loss")) && (success_history.get(i + 1).equals("Loss") ) && (success_history.get(i + 2).equals("Win"))){
//                final_say_comp.add("Loss");
//            }
//            else if ((success_history.get(i).equals("Loss")) && (success_history.get(i + 1).equals("Win") ) && (success_history.get(i + 2).equals("Loss"))){
//                final_say_comp.add("Loss");
//            }
//            else if ((success_history.get(i).equals("Win")) && (success_history.get(i + 1).equals("Loss") ) && (success_history.get(i + 2).equals("Loss"))){
//                final_say_comp.add("Loss");
//            }
//            else if ((success_history.get(i).equals("Loss")) && (success_history.get(i + 1).equals("Loss") ) && (success_history.get(i + 2).equals("Loss"))){
//                final_say_comp.add("Loss");
//            }
//            else {
//                System.out.println("Something went wrong here, it seems you haven't played yet");
//            }
//        }
    }

}
