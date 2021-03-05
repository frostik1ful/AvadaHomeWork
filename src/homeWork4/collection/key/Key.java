package homeWork4.collection.key;

import java.util.Objects;

public class Key implements Comparable<Key>{
    private Integer fakeHashCode = null;
    private final String keyWord;

    public Key(String keyWord) {
        this.keyWord = keyWord;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("Key equals called");

        if (this == o) return true;
        if (!(o instanceof Key)) return false;
        Key key = (Key) o;
        return Objects.equals(fakeHashCode, key.fakeHashCode) &&
                Objects.equals(keyWord, key.keyWord);
    }

    @Override
    public int hashCode() {
        if (fakeHashCode != null){
            return fakeHashCode;
        }
        return Objects.hash(fakeHashCode, keyWord);
    }

    @Override
    public String toString() {
        return "Key{" +
                "keyWord='" + keyWord + '\'' +
                '}';
    }

    public void setFakeHashCode(Integer fakeHashCode) {
        this.fakeHashCode = fakeHashCode;
    }

    @Override
    public int compareTo(Key o) {
        return keyWord.compareTo(o.keyWord);
    }
}
