import MOUNI.COLLEGE.Quiz;
import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        Quiz q = new Quiz();

        q.input(sc);
        q.startQuiz(sc);
        q.display();

        sc.close();
    }
}