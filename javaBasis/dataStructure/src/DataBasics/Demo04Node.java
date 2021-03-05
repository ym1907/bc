package DataBasics;

//单向链表
public class Demo04Node {
//    节点内容
    private int num;

//    下一个节点
    private Demo04Node node;

    public Demo04Node(int num){
        this.num = num;
    }

//    当前节点后追加节点
    public void add(Demo04Node node){
        Demo04Node oldNode = this.node;
        this.node = node;
        node.node = oldNode;
    }

//    链表末端追加节点
    public Demo04Node append(Demo04Node node){
        //当前节点
        Demo04Node currentNode = this;
        //获取到最后一个节点
        while(currentNode.hasNext()){
            if(node.equals(currentNode)){
                throw new RuntimeException("当前节点已存在");
            }
            Demo04Node nextNode = currentNode.next();
            currentNode = nextNode;
        }
        currentNode.node = node;
        return this;
    }

//    显示所有节点值
    public void show(){
        Demo04Node currentNode = this;
        System.out.print("[");
        while(true){
            if(currentNode.isLast()){
                System.out.print(currentNode.getNum());
                break;
            }
            System.out.print(currentNode.getNum() + ",");
            currentNode = currentNode.node;
        }
        System.out.println("]");
    }

    //    当前节点值
    public int getNum(){
        return this.num;
    }

    //    返回下一个节点
    public Demo04Node next(){
        return this.node;
    }

    //    删除下一个节点
    public void delNext(){
        this.node = this.node.node;
    }

    //    是否有下一个节点
    public boolean hasNext(){
        return this.node != null;
    }

    //    是否是最后一个节点
    public boolean isLast(){
        return this.node == null;
    }
}
