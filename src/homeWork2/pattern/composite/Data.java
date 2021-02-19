package homeWork2.pattern.composite;

public class Data implements File{
    private final long size;

    public Data(long size) {
        this.size = size;
    }

    @Override
    public long getSize() {
        return size;
    }
}
