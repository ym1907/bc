package DataBasics;

public class Demo04Test {
    public static void main(String[] args) {
        Demo04Node node1 = new Demo04Node(10);
        Demo04Node node2 = new Demo04Node(20);
        Demo04Node node3 = new Demo04Node(30);
        Demo04Node node4 = new Demo04Node(40);
        Demo04Node node5 = new Demo04Node(50);

        node1.add(node2);
        node2.add(node3);
        node3.add(node4);
        node4.add(node5);

        Demo04Node node = node1;
        while (node.hasNext()){
            node = node.getNode();
            System.out.println(node.next());
        }


    }
}
