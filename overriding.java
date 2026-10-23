import java.util.Scanner;

class Quiz {
    void quizInfo() {
        System.out.println("ONLINE QUIZ");
    }
}

class Student extends Quiz {
    @Override
    void quizInfo() {
        Scanner sc = new Scanner(System.in);

        int score = 0;

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

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

        System.out.println("\n--- RESULT ---");
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Score: " + score + "/1");
    }
}

class Teacher extends Quiz {
    @Override
    void quizInfo() {
        System.out.println(
            "\nTeacher can create and manage the quiz."
        );
    }
}

public class overriding{
    public static void main(String[] args) {
        Student s = new Student();
        Teacher t = new Teacher();

        s.quizInfo();
        t.quizInfo();
    }
}