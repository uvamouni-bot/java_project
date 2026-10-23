
import java.util.Scanner;

class User {
    String name;

    void getUser() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        name = sc.nextLine();
    }
}

class Student extends User {
    int regNo;

    void getStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Register Number: ");
        regNo = sc.nextInt();
    }
}

class Quiz extends Student {
    void startQuiz() {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("\n--- ONLINE QUIZ ---");
        System.out.println("1. Java is a?");
        System.out.println("a) Programming Language");
        System.out.println("b) Database");
        System.out.println("c) Operating System");
        System.out.print("Answer: ");

        char ans = sc.next().charAt(0);

        if (ans == 'a' || ans == 'A') {
            score++;
        }

        System.out.println("\nStudent Name: " + name);
        System.out.println("Register No: " + regNo);
        System.out.println("Score: " + score + "/1");
    }
}

public class multilevel{
    public static void main(String[] args) {
        Quiz q = new Quiz();

        q.getUser();
        q.getStudent();
        q.startQuiz();
    }
}
