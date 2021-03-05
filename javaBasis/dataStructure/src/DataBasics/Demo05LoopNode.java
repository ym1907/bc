package DataBasics;

//循环链表
public class Demo05LoopNode {
    //    节点内容
    private int num;

    //    下一个节点
    private Demo05LoopNode node = this;//关键点this

    public Demo05LoopNode(int num){
        this.num = num;
    }

    //    当前节点后追加节点
    public void add(Demo05LoopNode node){
        Demo05LoopNode oldNode = this.node;
        this.node = node;
        node.node = oldNode;
    }

    //    当前节点值
    public int getNum(){
        return this.num;
    }

    //    返回下一个节点
    public Demo05LoopNode next(){
        return this.node;
    }

    //    删除下一个节点
    public void delNext(){
        this.node = this.node.node;
    }
}
