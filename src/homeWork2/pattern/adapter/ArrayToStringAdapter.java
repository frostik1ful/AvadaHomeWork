package homeWork2.pattern.adapter;

public class ArrayToStringAdapter implements IPrinter{
    private final Printer printer;

    public ArrayToStringAdapter(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printArray(String[] array) {
        StringBuilder builder = new StringBuilder();

        for (String s : array) {
            builder.append(s).append(" ");
        }

        printer.print(builder.toString());
    }
}
