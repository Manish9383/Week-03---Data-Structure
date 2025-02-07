package double_linkedlist.undo_redo;

public class TextEditor {
    private History history;

    public TextEditor() {
        history = new History();
    }

    public void addTextState(String text) {
        history.addState(text);
    }

    public String undo() {
        return history.undo();
    }

    public String redo() {
        return history.redo();
    }

    public String getCurrentState() {
        return history.getCurrentState();
    }
}
