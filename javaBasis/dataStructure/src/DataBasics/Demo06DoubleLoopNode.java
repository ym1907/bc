package DataBasics;

public class Demo06DoubleLoopNode {
    //上一个节点
    private Demo06DoubleLoopNode previous = this;
    //下一个节点
    private Demo06DoubleLoopNode next = this;
    //节点数据
    private int data;

    public Demo06DoubleLoopNode(int data){
        this.data = data;
    }

    //增加节点
    public void after(Demo06DoubleLoopNode node){
        //原来的下一个节点
        Demo06DoubleLoopNode oldNext = next;
        //新节点作为下一个节点的节点
        this.next = node;
        //新节点的上一个节点为当前节点
        node.previous = this;
        //新节点的下一个节点为当前节点下一个节点
        node.next = oldNext;
        //原来节点的下一个节点的上一个节点为新节点
        oldNext.previous = node;
    }

    //下一个节点
    public Demo06DoubleLoopNode getNext(){
        return this.next;
    }

    //上一个节点
    public Demo06DoubleLoopNode getPrevious(){
        return this.previous;
    }

    //当前节点值
    public int getData(){
        return this.data;
    }

}
