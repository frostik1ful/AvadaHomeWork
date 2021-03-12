package homeWork5.binarySearcher;

import java.util.List;

public class BinarySearcher {
    private List<Integer> list;
    private int element;
    private boolean isFounded;

    public boolean search(List<Integer> list, int element) {
        this.list = list;
        this.element = element;
        return searchStep(0, list.size() - 1);
    }

    private boolean searchStep(int left, int right) {
        int midIndex = (right + left) / 2;
        int midElement = list.get(midIndex);
        if (element < midElement) {
            searchStep(left, --midIndex);
        } else if (element > midElement) {
            searchStep(++midIndex, right);
        } else {
            System.out.println("Founded ! " + midElement);
            isFounded = true;

        }
        return isFounded;
    }
}
