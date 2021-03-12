package homeWork5;

import homeWork5.binarySearcher.BinarySearcher;
import homeWork5.fastSorter.FastSorter;
import homeWork5.tree.Node;
import org.junit.Assert;

import java.util.*;

public class Test {

    @org.junit.Test
    public void fastSortAndBinarySearchTest() {
        List<Integer> listToSort = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 15; i++) {
            listToSort.add(random.nextInt(100));
        }

        System.out.println(listToSort);

        List<Integer> sortedList = new ArrayList<>(listToSort);

        FastSorter fastSorter = new FastSorter();
        fastSorter.sort(listToSort);
        System.out.println(listToSort);
        Collections.sort(sortedList);

        Assert.assertEquals(listToSort, sortedList);

        BinarySearcher binarySearcher = new BinarySearcher();

        listToSort.forEach(n -> Assert.assertTrue(binarySearcher.search(listToSort, n)));

    }

    @org.junit.Test
    public void wideTreeTest() {
        int[] nums = {2, 4, 16, 21, 5, 1, 6, 8, 7, 3};
        List<Integer> wideList = new ArrayList<>();
        Node firstNode = new Node(12);

        for (int i : nums) {
            firstNode.addNode(new Node(i));
        }

        LinkedList<Node> list = new LinkedList<>();
        list.add(firstNode);
        while (!list.isEmpty()) {
            Node node = list.pollFirst();

            System.out.println(node.getValue());
            wideList.add(node.getValue());
            if (node.getLeftNode() != null) {
                list.add(node.getLeftNode());
            }
            if (node.getRightNode() != null) {
                list.add(node.getRightNode());
            }

        }
        List<Integer> testList = List.of(12,2,16,1,4,21,3,5,6,8,7);
        for (int i = 0; i < wideList.size(); i++) {
            Assert.assertEquals(wideList.get(i),testList.get(i));
        }

    }
}
