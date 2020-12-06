package DataBasics;

public class Demo04Node {

    private int num;
    private Demo04Node node;

    public Demo04Node(int num){
        this.num = num;
    }

    public int getNum(){
        return this.num;
    }

    public Demo04Node getNode(){
        return this.node;
    }

    public void add(Demo04Node node){
        Demo04Node oldNode = this.node;
        this.node = node;
        node.node = oldNode;
    }

    public void delNext(){
        this.node = this.node.node;
    }

    public boolean hasNext(){
        if(this.node!= null){
            return true;
        }
        return false;
    }

    public int next(){

        return this.node.num;
    }


}
