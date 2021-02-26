package homeWork3.pattern.memento;

public class TextEditor {
    private String title = "";
    private String text = "";

    public void writeTitle(String s){
        title += s;
    }
    public void writeText(String s){
        text += s;
    }
    public Memento createBackUp(){
        return new Memento(this);
    }

    @Override
    public String toString() {
        return "TextEditor{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    static class Memento{
        private final String title;
        private final String text;
        private final TextEditor textEditor;
        public Memento(TextEditor editor) {
            this.title = editor.title;
            this.text = editor.text;
            this.textEditor = editor;
        }
        public void restore(){
            this.textEditor.title = title;
            this.textEditor.text = text;
        }
    }

}
