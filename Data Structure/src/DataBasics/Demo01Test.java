package DataBasics;

public class Demo01Test {
    public static void main(String[] args) {
        Demo01Array arr = new Demo01Array();
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.delete(5);
        arr.show();
        System.out.println("数组的长度为：" + arr.size());
        System.out.println("索引位置为3的是：" + arr.get(3));
        arr.insert(2,22);
        System.out.println("索引位置为3的是：" + arr.get(3));
        arr.set(4,41);
        arr.show();

        System.out.println("线性查找元素20的索引位置在：" + arr.selectIndex(20));

        arr.show();
        System.out.println("二分查找元素60的索引位置在：" + arr.binarySearch(50));

    }
}
