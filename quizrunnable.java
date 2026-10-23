class QuizThread implements Runnable {
    int competition;

    QuizThread(int competition) {
        this.competition = competition;
    }

    public void run() {
        String[] questions;

        if (competition == 1) {
            questions = new String[] {
                "1. Which keyword is used to create a class in Java?",
                "2. Which method is the starting point of a Java program?"
            };
        } else {
            questions = new String[] {
                "1. Which symbol is used for single-line comments in Java?",
                "2. Which keyword is used to inherit a class in Java?"
            };
        }

        System.out.println("\nCompetition " + competition);

        for (int i = 0; i < 2; i++) {
            System.out.println(questions[i]);
        }
    }
}

public class quizrunnable{
    public static void main(String[] args) {
        QuizThread quiz1 = new QuizThread(1);
        QuizThread quiz2 = new QuizThread(2);

        Thread t1 = new Thread(quiz1);
        Thread t2 = new Thread(quiz2);

        t1.start();
        t2.start();
    }
}