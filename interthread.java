class OnlineQuiz {

    private String question;
    private String answer;


    synchronized void askQuestion(String question) {

        this.question = question;

        System.out.println("\nQuestion: " + question);

        try {
            wait();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Correct Answer: " + answer);
    }


    synchronized void giveAnswer(String answer) {

        this.answer = answer;

        System.out.println("Answer received: " + answer);

        notify();
    }
}


class QuestionThread extends Thread {

    OnlineQuiz quiz;

    QuestionThread(OnlineQuiz quiz) {
        this.quiz = quiz;
    }

    public void run() {

        quiz.askQuestion("Which keyword is used to create a class in Java?");

        quiz.askQuestion("Which method is the starting point of a Java program?");
    }
}


class AnswerThread extends Thread {

    OnlineQuiz quiz;

    AnswerThread(OnlineQuiz quiz) {
        this.quiz = quiz;
    }

    public void run() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        quiz.giveAnswer("class");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        quiz.giveAnswer("main()");
    }
}

public class interthread{

    public static void main(String[] args) {

        OnlineQuiz quiz = new OnlineQuiz();

        QuestionThread q = new QuestionThread(quiz);
        AnswerThread a = new AnswerThread(quiz);

        q.start();
        a.start();
    }
