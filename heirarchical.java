
import java.util.Scanner;

class Quiz {
    Scanner sc = new Scanner(System.in);

    void quizInfo() {
        System.out.println("--- ONLINE QUIZ ---");
    }
}

class Student extends Quiz {
    void attendQuiz() {
        int score = 0;

        System.out.println("1. Java is a?");
        System.out.println("a) Language");
        System.out.println("b) Database");
        System.out.print("Answer: ");

        char ans = sc.next().charAt(0);

        if (ans == 'a' || ans == 'A') {
            score++;
        }

        System.out.println("Your Score: " + score + "/1");
    }
}

class Teacher extends Quiz {
    void createQuiz() {
        System.out.println("\nTeacher created a Java Quiz.");
    }
}

public class heirarchical{
    public static void main(String[] args) {
        Student sc = new Student();
        Teacher t = new Teacher();

        t.quizInfo();
        t.createQuiz();

        sc.quizInfo();
        sc.attendQuiz();
    }
}
