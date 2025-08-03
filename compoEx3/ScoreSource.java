import java.util.ArrayList;
import java.util.List;

public class ScoreSource {
    private List<ScoreListener> listeners = new ArrayList<>();
    private String score;

    public void addScoreListener(ScoreListener listener) {
        listeners.add(listener);
    }

    public void removeScoreListener(ScoreListener listener) {
        listeners.remove(listener);
    }

    public void setScoreLine(String score) {
        this.score = score;
        notifyListeners();
    }

    private void notifyListeners() {
        ScoreEvent event = new ScoreEvent(score);
        for (ScoreListener listener : listeners) {
            listener.ScoreChange(event);
        }
    }
}