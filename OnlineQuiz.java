
class Quiz {

    Quiz(String name, int rollNo) {
        System.out.println("=== ONLINE QUIZ ===");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNo);

        System.out.println("\nQuestion 1:");
        System.out.println("Which language is platform independent?");
        System.out.println("A) C");
        System.out.println("B) Java");
        System.out.println("C) C++");
        System.out.println("D) Python");
        System.out.println("Answer: B) Java");

        System.out.println("\nQuestion 2:");
        System.out.println("Which keyword is used to create an object in Java?");
        System.out.println("A) class");
        System.out.println("B) new");
        System.out.println("C) this");
        System.out.println("D) static");
        System.out.println("Answer: B) new");

        System.out.println("\nQuestion 3:");
        System.out.println("Which package contains the Scanner class?");
        System.out.println("A) java.io");
        System.out.println("B) java.lang");
        System.out.println("C) java.util");
        System.out.println("D) java.net");
        System.out.println("Answer: C) java.util");
    }
}

public class OnlineQuiz{
    public static void main(String[] args) {
        Quiz q = new Quiz("Mouni", 101);
    }
}
