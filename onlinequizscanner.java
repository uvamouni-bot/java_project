
import java.util.Scanner;

class Quiz {

    Scanner sc = new Scanner(System.in);

    void startQuiz() {
        int score = 0;
        char answer;

        System.out.println("ONLINE QUIZ APPLICATION");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.println("\nSTUDENT DETAILS");
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);

        System.out.println("\nQuestion 1:");
        System.out.println("Which language is platform independent?");
        System.out.println("A) C");
        System.out.println("B) Java");
        System.out.println("C) C++");
        System.out.println("D) Python");

        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);

        if (answer == 'B' || answer == 'b') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! Correct Answer: B) Java");
        }

        System.out.println("\nQuestion 2:");
        System.out.println("Which keyword is used to create an object in Java?");
        System.out.println("A) class");
        System.out.println("B) new");
        System.out.println("C) this");
        System.out.println("D) static");

        System.out.print("Enter your answer: ");
        answer = sc.next().charAt(0);

        if (answer == 'B' || answer == 'b') {
            System.out.println("Correct!");
            score++;
        } else {
            System.out.println("Wrong! Correct Answer: B) new");
        }

        System.out.println("\nRESULT");
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Your Score: " + score + "/2");
    }
}

public class onlinequizscanner{
    public static void main(String[] args) {
        Quiz q = new Quiz();
        q.startQuiz();
    }
}
