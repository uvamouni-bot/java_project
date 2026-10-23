import java.util.Scanner;

interface QuizRules {
    void showRules();
}

interface QuizQuestions {
    void askQuestions();
}

class OnlineQuiz implements QuizRules, QuizQuestions {

    Scanner sc = new Scanner(System.in);
    int score = 0;

    public void showRules() {
        System.out.println("----- Online Quiz Rules -----");
        System.out.println("1. There are 2 questions.");
        System.out.println("2. Each correct answer gives 1 mark.");
    }

    public void askQuestions() {

        String[] questions = {
            "1. Which keyword is used to inherit a class?",
            "2.Which symbol is used for addition?",
        };

        String[][] options = {
            {"A. implement", "B. inherits", "C. extends", "D. super"},
            {"A. *", "B. +", "C. -", "D. /"}
        };

        char[] answers = {'C', 'B'};

        for (int i = 0; i < 2; i++) {

            System.out.println("\n" + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Enter your answer: ");
            char userAnswer = sc.next().toUpperCase().charAt(0);

            if (userAnswer == answers[i]) {
                score++;
                System.out.println("Correct!");
            } else {
                System.out.println("Wrong!");
            }
        }
    }

    void displayResult() {

        int percentage = (score * 100) / 2;

        System.out.println("\n----- Quiz Result -----");
        System.out.println("Score      : " + score + "/2");
        System.out.println("Percentage : " + percentage + "%");

        if (percentage >= 50) {
            System.out.println("Result     : PASS");
        } else {
            System.out.println("Result     : FAIL");
        }
    }
}

public class quizinterface{

    // Call by reference
    static void startQuiz(OnlineQuiz quiz) {

        quiz.showRules();

        System.out.println("\n----- Quiz Started -----");

        quiz.askQuestions();

        quiz.displayResult();
    }

    public static void main(String[] args) {

        OnlineQuiz quiz = new OnlineQuiz();

        startQuiz(quiz);
    }
}