package homeWork2.pattern.decorator;

public class DatabaseService {
    private String temp;
    public void saveText(String text){
        temp = text;
        System.out.println("saving text "+text);
    }
    public String getText(){
        return temp;
    }
}
