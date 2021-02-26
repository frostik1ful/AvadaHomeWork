package homeWork3.pattern.memento;

import java.util.LinkedList;


public class ControlPanel {
    private final TextEditor textEditor;
    private final LinkedList<TextEditor.Memento> mementos = new LinkedList<>();

    public ControlPanel(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void writeTitle(String s) {
        mementos.add(textEditor.createBackUp());
        textEditor.writeTitle(s);
    }

    public void writeText(String s) {
        mementos.add(textEditor.createBackUp());
        textEditor.writeText(s);
    }

    public void stepBack() {
        if (mementos.size() > 0) {
            mementos.pollLast().restore();
        }

    }
}
