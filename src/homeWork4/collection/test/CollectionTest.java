package homeWork4.collection.test;

import homeWork4.collection.key.Key;
import homeWork4.collection.user.Student;
import homeWork4.collection.user.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class CollectionTest {

    @Test
    public void ListSpeedTest(){
        long linkedListInsertTime;
        long arrayListInsertTime;

        long linkedListGetTime;
        long arrayListGetTime;

        LinkedList<User> linkedList = new LinkedList<>();
        ArrayList<User> arrayList = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            User student = new User("Name");
            linkedList.add(student);
            arrayList.add(student);
        }
        User student = new User("Name");
        arrayListInsertTime = System.nanoTime();
        arrayList.add(0,student);
        arrayListInsertTime = System.nanoTime() - arrayListInsertTime;

        linkedListInsertTime = System.nanoTime();
        linkedList.add(0,student);
        linkedListInsertTime = System.nanoTime() - linkedListInsertTime;
        System.out.println("arrayInsertTime "+arrayListInsertTime+" linkedInsertTime "+linkedListInsertTime);



        linkedListGetTime = System.nanoTime();
        linkedList.get(50000);
        linkedListGetTime = System.nanoTime() - linkedListGetTime;

        arrayListGetTime = System.nanoTime();
        arrayList.get(50000);
        arrayListGetTime = System.nanoTime() - arrayListGetTime;

        System.out.println("arraygetTime "+arrayListGetTime+" linkedgetTime "+linkedListGetTime);

        Assert.assertTrue(linkedListInsertTime < arrayListInsertTime);
        Assert.assertTrue(linkedListGetTime > arrayListGetTime);

    }
    @Test
    public void listTest(){
        Stack<User> stack = new Stack<>();
        User first = new User("first");
        User second = new User("second");
        stack.push(first);
        stack.push(second);

        Assert.assertEquals(second,stack.peek());
    }
    @Test
    public void queueTest(){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();
        priorityQueue.add("first");
        priorityQueue.add("second");

        arrayDeque.addLast("first");
        arrayDeque.addFirst("second");

        Assert.assertEquals(priorityQueue.peek(),arrayDeque.pollLast());
        Assert.assertNotEquals(priorityQueue.size(),arrayDeque.size());

    }
    @Test
    public void setTest(){
        HashSet<Integer> hashSet = new HashSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        hashSet.add(5);
        hashSet.add(4);
        System.out.println(hashSet);

        linkedHashSet.add(5);
        linkedHashSet.add(4);
        System.out.println(linkedHashSet);

        Iterator<Integer> hashSetIter = hashSet.iterator();
        Iterator<Integer> linkedHashSetIter = linkedHashSet.iterator();

        hashSetIter.next();
        Assert.assertEquals(hashSetIter.next(),linkedHashSetIter.next());


        Comparator<User> nameComparator = Comparator.comparing(User::getName);

        TreeSet<User> treeSet = new TreeSet<>(nameComparator);
        User Dima = new User("Dima");
        User Kostya = new User("Kostya");
        treeSet.add(Kostya);
        treeSet.add(Dima);

        System.out.println(treeSet);
        Assert.assertEquals(treeSet.pollFirst(),Dima);
    }
    @Test
    public void mapTest(){
        HashMap<Key,Student> map = new HashMap<>();
        Student student1 = new Student("name1",0);
        Student student2 = new Student("name2",0);
        Student student3 = new Student("name3",0);

        Key key1 = new Key("key1");
        Key key2 = new Key("key2");
        Key key3 = new Key("key3");
        key2.setFakeHashCode(key1.hashCode());
        key3.setFakeHashCode(key1.hashCode());

        map.put(key1,student1);
        map.put(key2,student2);
        map.put(key3,student3);

        System.out.println(map.size());
        Assert.assertEquals(3,map.size());

        LinkedHashMap<Integer,Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(5,1);
        linkedHashMap.put(4,2);
        linkedHashMap.put(3,3);

        System.out.println(linkedHashMap);

        Assert.assertEquals(linkedHashMap.get(5), Integer.valueOf(1));

        TreeMap<Key, Student> treeMap = new TreeMap<>();

        Key keyA = new Key("a");
        Key keyB = new Key("b");
        Key keyC = new Key("c");

        treeMap.put(keyC,student3);
        treeMap.put(keyA,student1);
        treeMap.put(keyB,student2);


        System.out.println(treeMap);
        Iterator<Student> iterator = treeMap.values().iterator();

        Assert.assertEquals(iterator.next(),student1);
        Assert.assertEquals(iterator.next(),student2);
        Assert.assertEquals(iterator.next(),student3);


    }
}
