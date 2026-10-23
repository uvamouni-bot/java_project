
class Quiz {

    public Quiz() {
        System.out.println("=== ONLINE QUIZ APPLICATION ===");
    }

    public static void welcome() {
        System.out.println("Welcome to the Java Quiz!");
        System.out.println();
    }

    // Method to display a question
    public void display(String question) {
        System.out.println(question);
    }

    // Overloaded method to display a question and answer
    public void display(String question, String answer) {
        System.out.println(question);
        System.out.println("Answer: " + answer);
        System.out.println();
    }

    private void endQuiz() {
        System.out.println("=== QUIZ COMPLETED ===");
    }

    public void startQuiz() {

        display("Question 1:");
        display(
            "Which language is platform independent?\nA) C\nB) Java\nC) C++\nD) Python",
            "B) Java"
        );

        display("Question 2:");
        display(
            "Which keyword is used to create an object in Java?\nA) class\nB) new\nC) this\nD) static",
            "B) new"
        );

        display("Question 3:");
        display(
            "Which package contains the Scanner class?\nA) java.io\nB) java.lang\nC) java.util\nD) java.net",
            "C) java.util"
        );

        endQuiz();
    }
}

public class onlinequizsmethod
{
    public static void main(String[] args) {
        Quiz.welcome();

        Quiz q = new Quiz();
        q.startQuiz();
    }
}
