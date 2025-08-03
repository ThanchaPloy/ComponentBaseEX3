import java.util.Scanner;

public class MainArena {
    public static void main(String[] args) {
        Subscriber subscriber = new Subscriber(1);
        Subscriber subscriber2 = new Subscriber(2);

        ScoreSource scoreSource = new ScoreSource();
        scoreSource.addScoreListener(subscriber);
        scoreSource.addScoreListener(subscriber2);

        Scanner scanner = new Scanner(System.in);
        String score = scanner.nextLine();
        while(score != ""){
            scoreSource.setScoreLine(score);
            score = scanner.nextLine();
        }
        scanner.close();
        System.out.println("All input are show");
    }
}
// "C:\Users\Asus\OneDrive - KMITL\Desktop\KMITL\3rd year\ComponentB\EX3"