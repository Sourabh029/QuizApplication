
public class QuestionsService
{

    int nums[] = new int[5]; // array of 5 integer
    Questions questions[] = new Questions[5]; // array of References

    public QuestionsService() {

        questions[0] = new Questions(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Questions(2, "size of double", "2", "6", "4", "8", "8");
        questions[2] = new Questions(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Questions(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Questions(5, "size of boolean", "1", "2", "4", "8", "1");

    }

    public void playQuiz() {
        for(Questions q : questions)
        {
            System.out.println(q.getTitle());
        }
    }
}
