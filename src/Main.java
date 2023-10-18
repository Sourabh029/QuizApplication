import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IllegalStateException {

        Scanner sc= new Scanner(System.in);
        QuestionsService service = new QuestionsService();


        System.out.println("Please enter your name");
        String name = sc.next();
        System.out.println(name+" Welcome to the Quiz, we are glad you are here");
        service.playQuiz();

    }
}