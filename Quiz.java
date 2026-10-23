
package MOUNI.COLLEGE;

import java.util.*;

public class Quiz
{
    String name;
    int id, score;

    public void input(Scanner sc)
    {
        System.out.println("Enter Student Name:");
        name = sc.nextLine();

        System.out.println("Enter Student ID:");
        id = sc.nextInt();
    }

    public void startQuiz(Scanner sc)
    {
        score = 0;

        System.out.println("\n===== ONLINE QUIZ =====");

        System.out.println("\n1. Which language is used for Java programming?");
        System.out.println("1. Python");
        System.out.println("2. Java");
        System.out.println("3. C");
        System.out.println("4. HTML");
        System.out.println("Enter your answer:");
        if (sc.nextInt() == 2)
            score++;

        System.out.println("\n2. Which keyword is used to create a class?");
        System.out.println("1. class");
        System.out.println("2. create");
        System.out.println("3. object");
        System.out.println("4. define");
        System.out.println("Enter your answer:");
        if (sc.nextInt() == 1)
            score++;

        System.out.println("\n3. Which keyword is used for inheritance?");
        System.out.println("1. implements");
        System.out.println("2. import");
        System.out.println("3. extends");
        System.out.println("4. package");
        System.out.println("Enter your answer:");
        if (sc.nextInt() == 3)
            score++;
    }

    public void display()
    {
        System.out.println("\n================================");
        System.out.println("       ONLINE QUIZ RESULT");
        System.out.println("================================");
        System.out.println("Student Name : " + name);
        System.out.println("Student ID   : " + id);
        System.out.println("Total Marks  : 3");
        System.out.println("Score        : " + score + "/3");
        System.out.println("================================");
    }
}
