import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;

class JavaCollection {
    public static void usingArrayList() {
        // dynamically size get increase by n + n/2 + 1;
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("viren");
        studentList.add("shiva");
        studentList.add("uma");
        studentList.add("ganesh");
        studentList.add("kartik");
        System.out.println(studentList);

        studentList.add(1, "ram");
        System.out.println(studentList);
    }

    private static void usingList() {
        List<Integer> list = new ArrayList<Integer>();
        // same can be used for linkedlist
        List<Integer> LL = new LinkedList<Integer>();

        List<Integer> newList = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(1, 5); // add 5 at index 1.
        System.out.println(list);

        newList.add(310);
        newList.add(510);

        list.addAll(newList);
        System.out.println(list);

        System.out.println(list.get(1)); // get element from list

        list.remove(1); // remove ele. at index 1
        System.out.println(list);

        list.set(1, 500000); // update ele. at index 1
        System.out.println(list);

        System.out.println(list.contains(100)); // if present: true, else: false

        for (int i = 0; i < list.size(); i++) {
            System.out.println("element at index " + i + " is: " + list.get(i));
        }

        for (Integer ele : list) {
            System.out.println("element are: " + ele);
        }

        // using iterator
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            System.out.println("using iterator: " + it.next());
        }

        list.clear();
        System.out.println(list);
    }

    private static void usingStack() {
        Stack<Integer> st = new Stack<>();

        st.push(1);
        st.push(10);
        st.push(100);
        st.push(1000);
        System.out.println(st);

        // only top ele. can be accessed
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
    }

    private static void usingQueue() {
        // Some of the commonly used methods of the Queue interface are:

        // add() - Inserts the specified element into the queue. If the task is
        // successful, add() returns true, if not it throws an exception.
        // offer() - Inserts the specified element into the queue. If the task is
        // successful, offer() returns true, if not it returns false.
        // element() - Returns the head of the queue. Throws an exception if the queue
        // is empty.
        // peek() - Returns the head of the queue. Returns null if the queue is empty.
        // remove() - Returns and removes the head of the queue. Throws an exception if
        // the queue is empty.
        // poll() - Returns and removes the head of the queue. Returns null if the queue
        // is empty.

        Queue<Integer> queue = new LinkedList<>();

        queue.offer(12);
        queue.offer(14);
        queue.offer(16);
        queue.offer(18);
        System.out.println(queue);

        System.out.println(queue.poll()); // pop out from the front and return as well
        System.out.println(queue);

        System.out.println(queue.peek()); // just get the front ele.
        System.out.println(queue);
    }

    private static void usingPriorityQueue() {
        // min heap
        // Queue<Integer> pq = new PriorityQueue<>();

        // max heap
        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(50);
        pq.offer(23);
        pq.offer(54);
        pq.offer(90);

        System.out.println(pq);

        System.out.println(pq.peek());

        pq.poll();
        System.out.println(pq);

    }

    private static void usingDequeue() {
        ArrayDeque<Integer> dq = new ArrayDeque<>();

        dq.offer(12);
        dq.offerFirst(23);
        dq.offerLast(89);
        dq.offer(44);

        System.out.println(dq);

        System.out.println(dq.peek());
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());

        dq.poll();
        System.out.println(dq);

        dq.pollFirst();
        System.out.println(dq);

        dq.pollLast();
        System.out.println(dq);
    }

    private static void usingHashSet() {

        // store with hashing
        // Set<Integer> set = new HashSet<>();

        // linked hashing means will store in chain
        // Set<Integer> set = new LinkedHashSet<>();

        // will store in sorted manner (BST in backend)
        Set<Integer> set = new TreeSet<>();

        set.add(23);
        set.add(23);
        set.add(56);
        set.add(43);
        set.add(32);
        set.add(89);

        System.out.println(set);

        System.out.println(set.contains(32));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

    }

    private static void usingHashMap() {
        // using hashing
        // Map<Integer, String> mp = new HashMap<>();

        // using BST => in sorted order
        Map<Integer, String> mp = new TreeMap<>();

        mp.put(91, "India");
        mp.put(1, "USA");

        mp.put(91, "india"); // it will override the value

        mp.remove(1);

        System.out.println(mp);

        System.out.println(mp.containsKey(91));
        System.out.println(mp.containsValue("india"));

        mp.putIfAbsent(7, "russia");
        System.out.println(mp);

        // using iterator
        for (Map.Entry<Integer, String> e : mp.entrySet()) {
            System.out.print(e + " ");

            System.out.print(e.getKey() + " ");

            System.out.println(e.getValue());
        }

        // using key set
        for (Integer i : mp.keySet()) {
            System.out.print(i + " ");

            System.out.println(mp.get(i));
        }
    }

    private static void usingArrayClass() {

        int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        Arrays.sort(a);

        // but to use binarySearch array must be sorted
        int index = Arrays.binarySearch(a, 3);
        System.out.println(index);

        Arrays.fill(a, -1); // will help in dp array

        for (int i : a) {
            System.out.println("ele is: " + i);
        }

    }

    private static void usingCollectionClass() {
        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(12);
        list.add(12);
        list.add(12);
        list.add(34);
        list.add(56);
        list.add(2);
        list.add(8);
        list.add(67);
        list.add(90);

        System.out.println(list);

        System.out.println("min ele.: " + Collections.min(list));
        System.out.println("max ele.: " + Collections.max(list));

        System.out.println(Collections.frequency(list, 12));

        Collections.sort(list);

        System.out.println(list);
    }

    public static void main(String[] args) {
        usingArrayList();
        usingList();
        usingStack();
        usingQueue();
        usingPriorityQueue();
        usingDequeue();
        usingHashSet();
        usingHashMap();
        usingArrayClass();
        usingCollectionClass();
    }
}
