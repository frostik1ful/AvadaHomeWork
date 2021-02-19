package homeWork2.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements File{
    private final List<File> files = new ArrayList<>();

    public void addFile(File file){
        files.add(file);
    }

    @Override
    public long getSize() {
        return files.stream().mapToLong(File::getSize).sum();
    }

}
