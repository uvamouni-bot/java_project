import java.util.Scanner;


class InvalidAnswerException extends Exception {

    InvalidAnswerException(String message) {
        super(message);
    }
}

class OnlineQuiz {

    void checkAnswer(char answer) throws InvalidAnswerException {

        if (answer != 'A' && answer != 'B' &&
            answer != 'C' && answer != 'D') {

            throw new InvalidAnswerException(
                "Invalid answer! Please enter A, B, C or D."
            );
        }

        if (answer == 'A') {
            System.out.println("Correct Answer!");
        } else {
            System.out.println("Wrong Answer!");
        }
    }

    void displayQuestions() {

        System.out.println("\n===== ONLINE QUIZ =====");

        System.out.println(
            "1. Which keyword is used to create a class in Java?"
        );
        System.out.println("A. class");
        System.out.println("B. new");
        System.out.println("C. create");
        System.out.println("D. object");

        System.out.println(
            "\n2. Which method is the starting point of a Java program?"
        );
        System.out.println("A. main()");
        System.out.println("B. start()");
        System.out.println("C. run()");
        System.out.println("D. begin()");
    }
}

public class exception{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        OnlineQuiz quiz = new OnlineQuiz();

        quiz.displayQuestions();

        try {

            System.out.print("\nEnter answer for Question 1: ");
            char answer1 = sc.next().toUpperCase().charAt(0);
            quiz.checkAnswer(answer1);

            System.out.print("Enter answer for Question 2: ");
            char answer2 = sc.next().toUpperCase().charAt(0);
            quiz.checkAnswer(answer2);

        } catch (InvalidAnswerException e) {

            System.out.println("Exception: " + e.getMessage());

        } finally {

            System.out.println("\nQuiz completed.");
            sc.close();
        }
    }
} 