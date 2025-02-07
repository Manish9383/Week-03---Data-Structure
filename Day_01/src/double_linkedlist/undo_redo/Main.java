package double_linkedlist.undo_redo;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addTextState("State 1");
        editor.addTextState("State 2");
        editor.addTextState("State 3");

        System.out.println("Current: " + editor.getCurrentState());

        System.out.println("Undo: " + editor.undo());
        System.out.println("Undo: " + editor.undo());

        System.out.println("Redo: " + editor.redo());
        System.out.println("Current: " + editor.getCurrentState());
    }
}
