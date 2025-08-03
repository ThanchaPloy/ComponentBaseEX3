public class Subscriber implements ScoreListener {
    int ID;

    public Subscriber(int ID) {
        this.ID = ID;
    }
    @Override
    public void ScoreChange(ScoreEvent event) {
        // Handle the score update event
        System.out.println("Live result to "+ ID +": " + event.getScoreLine());
    }
    
}
