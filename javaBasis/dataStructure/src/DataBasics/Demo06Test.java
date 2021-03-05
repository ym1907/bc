package DataBasics;

public class Demo06Test {
    public static void main(String[] args) {
        Demo06DoubleLoopNode node1 = new Demo06DoubleLoopNode(10);
        Demo06DoubleLoopNode node2 = new Demo06DoubleLoopNode(20);
        Demo06DoubleLoopNode node3 = new Demo06DoubleLoopNode(30);
        Demo06DoubleLoopNode node4 = new Demo06DoubleLoopNode(40);

        node1.after(node2);
        node2.after(node3);
        node3.after(node4);

        System.out.println(node1.getData());
        System.out.println(node1.getNext().getData());
        System.out.println(node1.getPrevious().getData());

    }
}
