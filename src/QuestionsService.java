import java.util.*;

public class QuestionsService
{

    int nums[] = new int[5]; // array of 5 integer
    Questions questions[] = new Questions[5]; // array of References

    Scanner sc = new Scanner(System.in);
    Questions randomQuestions[]=new Questions[3];

    int score=0;
    int choice=0;
    String choiceInText;
    public QuestionsService() {

        questions[0] = new Questions(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Questions(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Questions(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Questions(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Questions(5, "size of boolean", "1", "2", "4", "8", "1");

    }

    public void playQuiz() {
        randomQuestionGenerator();
        int i=0;
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

            }
        };



        for(Questions q : randomQuestions)
        {
            System.out.println(q.getQid() +" " +q.getTitle());
            System.out.println("OPTIONS : ");
            System.out.println("1 -"+q.getOption1());
            System.out.println("2 -"+q.getOption2());
            System.out.println("3 -"+q.getOption3());
            System.out.println("4 -"+q.getOption4());


            getChoice();

            switch (choice)
            {
                case 1->choiceInText=q.getOption1();
                case 2->choiceInText=q.getOption2();
                case 3->choiceInText=q.getOption3();
                case 4->choiceInText=q.getOption4();

            }
            if(choiceInText.equals( q.getAnswer()))
            {
                System.out.println("Correct answer");
                score=score+2;

            }
            else
            {
                System.out.println("Wrong Answer");
                score--;
            }
            System.out.println("Your Score is "+score);
        }

        System.out.println("Your Total score is "+ score);

    }


    void getChoice()
    {
        System.out.println("Enter your choice");
        choice = sc.nextInt();


        if (choice<5 && choice>0)
        {
            System.out.println(" you choose option "+ choice);
        }
        else
        {
            System.out.println("enter a correct option number");
            getChoice();

        }
    }

    public void randomQuestionGenerator()
    {
        int count =0;
        Random random = new Random();
        int randomPointer= 0;
        Integer randomCount[]=new Integer[questions.length];
        int i=0;
        while(count < randomQuestions.length)
        {

            randomPointer=random.nextInt(questions.length);
            //System.out.println(randomPointer);

            if(!(Arrays.asList(randomCount).contains(randomPointer)))
            {
                randomQuestions[count] = questions[randomPointer];
                count++;
            }
            randomCount[i]=randomPointer;

        }
    }
}
