package DataBasics;

public class Demo04Test {
    public static void main(String[] args) {
        Demo04Node node1 = new Demo04Node(10);
        Demo04Node node2 = new Demo04Node(20);
        Demo04Node node3 = new Demo04Node(30);
        Demo04Node node4 = new Demo04Node(40);
        Demo04Node node5 = new Demo04Node(50);

        node1.append(node2).append(node3).append(node4).append(node5);

        System.out.println(node1.next().next().next().next().getNum());

        System.out.println(node1.isLast());

        node2.delNext();
        System.out.println(node1.next().next().getNum());


//        int aaa = node1.append(node2).append(node3).getNum();
//        System.out.println(aaa);
    }
}
