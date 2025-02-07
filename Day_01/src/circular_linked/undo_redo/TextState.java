package circular_linked.undo_redo;

public class TextState {
    String text;

    public TextState(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
