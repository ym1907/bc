package DataBasics;

public class Demo04Test {
    public static void main(String[] args) {
        Demo04Node node1 = new Demo04Node(10);
        Demo04Node node2 = new Demo04Node(20);
        Demo04Node node3 = new Demo04Node(30);

        node1.add(node2);
        node1.add(node3);

        node1.showNext();
        node2.showNext();
        node3.showNext();

    }
}
