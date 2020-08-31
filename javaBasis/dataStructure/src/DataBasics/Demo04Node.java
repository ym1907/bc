package DataBasics;

public class Demo04Node {

    private int num;
    private Demo04Node node;

    public Demo04Node(int num){
        this.num = num;
    }

    public void add(Demo04Node node){
        Demo04Node oldNode = this.node;
        this.node = node;
        node.node = oldNode;
    }

    public void delNext(){
        this.node = this.node.node;
    }

    public void showNext(){
        System.out.println(node.num);
    }


}
