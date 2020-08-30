package SparseArray;

public class Demo01SparseArray {
    public static void main(String[] args) {
        //新建二维数组并赋值
        int chessArr[][] = new int[11][11];
        chessArr[1][2] = 1;
        chessArr[2][3] = 2;
        chessArr[4][5] = 2;
        System.out.println("原始二维数组：");
        for(int[] row : chessArr){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }

        //将二维数组转成稀疏数组
        //1.遍历二维数组得到非0数的个数
        int sum = 0;
        for(int[] row : chessArr){
            for(int data :row){
                if(data!=0){
                    sum++;
                }
            }
        }

        //2.创建对应的稀疏数组
        int sparseArr[][] = new int[sum+1][3];
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //遍历二维数组，将非0数存入到稀疏数组中
        int count = 0;//用于记录是第几个非0数字
        for(int i=0;i<11;i++){
            for(int j=0;j<11;j++){
                if(chessArr[i][j]!=0){
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr[i][j];
                }
            }
        }
        // 输出稀疏数组的形式
        System.out.println();
        System.out.println("得到稀疏数组为：");
        //sparseArr.length表示稀疏数组的行数
        //printf(String format, Object... args) String中表示的为指定的输出格式
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);
        }
        System.out.println();

        //稀疏数组 ——> 二维数组
        int chessArr2[][] = new int[sparseArr[0][0]][sparseArr[0][1]];
        for(int i = 1;i<sparseArr.length;i++){
            chessArr2[sparseArr[i][0]][sparseArr[i][1]] = sparseArr[i][2];
        }
        for(int[] row : chessArr2){
            for(int data : row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
