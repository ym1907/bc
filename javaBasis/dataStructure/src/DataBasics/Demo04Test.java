package DataBasics;

public class Demo04Test {
    public static void main(String[] args) {
        Demo04Node node1 = new Demo04Node(10);
        Demo04Node node2 = new Demo04Node(20);
        Demo04Node node3 = new Demo04Node(30);

        node1.append(node2).append(node3);

        node1.add(new Demo04Node(15));
        node1.append(new Demo04Node(40));
        node1.show();

        System.out.println(node1.next().next().getNum());

        System.out.println(node1.isLast());

        node2.delNext();
        System.out.println(node1.next().next().getNum());

        node1.append(node2);
    }
}
