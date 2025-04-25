package Algorithm_Demo.Search_Demo.TileSearch_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/19 22:33
 * @Day Day23
 */

//TileSearch    分块查找
// 7,10   13,19,16,20    27,22,30,40,36    43,50,48
//分块的原则1:前一块中的最大数据,小于后一块中所有的数据(块内无序，块间有序)
//分块的原则2:块数数量一般等于数字的个数开根号   比如:16个数字一般分为4块左右
//核心思路:先确定要查找的元素在哪一块,然后在块内挨个查找

//1.创建块类  属性有: max:块中的最大值 startIndex:起始索引 endIndex:结束索引
//2.创建数组blockArr存放每一个块对象的信息
//3.先查找blockArr确定要查找的数据属于哪一块
//4.再单独遍历这一块数据即可
public class TileSearchDemo1 {
    public static void main(String[] args) {
        int[] arr = {16,5,9,12,21,18,
                32,23,37,26,45,34,
                50,48,61,52,73,66};

        //创建三个块的对象
        Block b1 = new Block(21,0,5);
        Block b2 = new Block(45,6,11);
        Block b3 = new Block(73,12,17);

        //定义数组管理三个块的对象(索引表)
        Block[] blockArr = {b1,b2,b3};

        //调用方法,传递索引表,数组,要查找的元素
        int index = tileSearch(blockArr,arr,26);

        //打印一下
        System.out.println(index);

    }

    //利用分块查找的原理，查询num的索引
    private static int tileSearch(Block[] blockArr,int[] arr,int num) {
        //确定num在哪一块当中
        int index = findIndexBlock(blockArr,num);
        //判断num是否在块中
        if(index == -1){
            return -1;
        }

        //获取块的起始索引
        int  startIndex = blockArr[index].getStartIndex();
        //获取块的结束索引
        int  endIndex = blockArr[index].getEndIndex();

        //在块中循环查找
        for (int i = startIndex; i <= endIndex; i++) {
            if (num == arr[i]) {
                return i;
            }
        }

        //没有找到num
        return -1;
    }

    //定义一个方法,用来确定num在哪一块当中
    private static int findIndexBlock(Block[] blockArr,int num){

        //循环查找num在哪一块当中
        for (int i = 0; i < blockArr.length; i++) {
            //从0索引开始遍历blockArr,如果number小于max,那么就表示number是在这一块当中的
            //当num小于该块最大值时,返回该块索引
            if (num <= blockArr[i].getMax()) {
                return i;
            }
        }

        //num大于所有块的最大值
        return -1;
    }

}


class Block {    //块
    private int max;            //块中的最大值
    private int startIndex;     //起始索引
    private int endIndex;       //结束索引

    public Block() {
    }

    public Block(int max, int startIndex, int endIndex) {
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}

