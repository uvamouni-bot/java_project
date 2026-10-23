import java.util.Scanner;

abstract class Quiz {
    abstract void askQuestion();

    void displayResult(int score, long time) {
        System.out.println("\n--- Quiz Result ---");
        System.out.println("Score: " + score + "/2");
        System.out.println("Time Taken: " + time + " seconds");
    }
}

class JavaQuiz extends Quiz {
    Scanner sc = new Scanner(System.in);
    int score = 0;

    @Override
    void askQuestion() {
        String[] questions = {
            "1. Which keyword is used to create a class in Java?",
            "2. Which method is the starting point of a Java program?"
        };

        String[][] options = {
            {"A. class", "B. create", "C. new", "D. object"},
            {"A. start()", "B. main()", "C. run()", "D. begin()"}
        };

        char[] answers = {'A', 'B'};

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
}
public class reference{

    static void startQuiz(Quiz q) {
        long startTime = System.currentTimeMillis();

        q.askQuestion();

        long endTime = System.currentTimeMillis();
        long timeTaken = (endTime - startTime) / 1000;

        JavaQuiz quiz = (JavaQuiz) q;
        quiz.displayResult(quiz.score, timeTaken);
    }

    public static void main(String[] args) {
        JavaQuiz quiz = new JavaQuiz();
        startQuiz(quiz);
    }
}