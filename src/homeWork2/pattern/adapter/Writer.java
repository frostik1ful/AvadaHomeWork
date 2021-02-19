package homeWork2.pattern.adapter;

public class Writer {
    private final String[] array = {"Angola", "Denmark", "Greece", "Italy", "Libya", "Serbia"};
    private final IPrinter printer;

    public Writer(IPrinter printer) {
        this.printer = printer;
    }

    public void writeToPrinter(){
        printer.printArray(array);
    }
}
