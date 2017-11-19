import java.util.Scanner;

/**
 * Created by adavi on 18.11.2017.
 */
public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        MyWork myWork = new MyWork();

       String answerUser =  myWork.hello();
        myWork.budget(answerUser);
    }

}
