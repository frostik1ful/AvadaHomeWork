package homeWork5.fastSorter;

import java.util.List;

public class FastSorter {
    private List<Integer> list;

    public List<Integer> sort(List<Integer> list) {
        this.list = list;
        sortStep(0, list.size() - 1);
        return this.list;

    }

    private List<Integer> sortStep(int left, int right) {
        if (left < right) {
            int leftIndex = left;
            int rightIndex = right;
            int midIndex = (leftIndex + rightIndex) / 2;
            int midElem = list.get(midIndex);

            int leftElem;
            int rightElem;


            while (leftIndex < rightIndex) {
                leftElem = list.get(leftIndex);
                rightElem = list.get(rightIndex);

                while (leftIndex < midIndex && leftElem <= midElem) {
                    leftIndex++;
                    leftElem = list.get(leftIndex);
                }

                while (rightIndex > midIndex && rightElem >= midElem) {
                    rightIndex--;
                    rightElem = list.get(rightIndex);
                }

                if (leftIndex < rightIndex) {
                    swapElements(list, leftIndex, rightIndex);

                    if (leftIndex == midIndex) {
                        midIndex = rightIndex;
                    } else if (rightIndex == midIndex) {
                        midIndex = leftIndex;
                    }
                }
            }
            sortStep(left, midIndex);
            sortStep(midIndex + 1, right);
        }
        return list;
    }

    private void swapElements(List<Integer> list, int first, int second) {
        int temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }
}
