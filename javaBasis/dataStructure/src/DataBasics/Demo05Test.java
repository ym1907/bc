package DataBasics;

public class Demo05Test {
    public static void main(String[] args) {
        Demo05LoopNode node1 = new Demo05LoopNode(10);
        Demo05LoopNode node2 = new Demo05LoopNode(20);
        Demo05LoopNode node3 = new Demo05LoopNode(30);
        Demo05LoopNode node4 = new Demo05LoopNode(40);

        node1.add(node2);
        node2.add(node3);
        node3.add(node4);

        System.out.println(node1.next().getNum());
        System.out.println(node2.next().getNum());
        System.out.println(node3.next().getNum());
        System.out.println(node4.next().getNum());
    }
}
