package Algorithm_Demo.Search_Demo.TileSearch_Demo.Demo2;

/**
 * @Author HHH
 * @Date 2025/4/19 23:16
 * @Day Day23
 */

//TileSearch    分块查找
//扩展的分块查找(无规律的数据)
//27,22,30,40,36   13,19,16,20   7,10   43,50,48
//按最大最小值范围分类
//注意:不同块间索引范围不能有交集

//1.创建块类  属性有: max:块中的最大值  min:块中的最小值 startIndex:起始索引 endIndex:结束索引
//2.创建数组blockArr存放每一个块对象的信息
//3.先查找blockArr确定要查找的数据属于哪一块
//4.再单独遍历这一块数据即可
public class TileSearchDemo2 {
    public static void main(String[] args) {
        //创建数组
        int[] arr = {27,22,30,40,36,
                    13,19,16,20,
                    7,10,
                    43,50,48};

        //给数组分块
        Block b1 = new Block(40,22,0,4);
        Block b2 = new Block(20,13,5,8);
        Block b3 = new Block(10,7,9,10);
        Block b4 = new Block(50,43,11,13);

        //定义数组管理三个块的对象(索引表)
        Block[] blockArr = {b1,b2,b3,b4};

        //将索引表,数组,查找的数num传入方法,查找num索引
        int index = TileSearch(blockArr, arr,7);

        //打印索引
        System.out.println(index);
    }

    //利用分块查找的原理，查询num的索引
    public static int TileSearch(Block[] blockArr,int[] arr,int num) {
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
    public static int findIndexBlock(Block[] blockArr,int num) {
        //循环查找num在哪一块当中
        for (int i = 0; i < blockArr.length; i++) {
            //当num满足该块取值范围,返回该块索引
            if(num >= blockArr[i].getMin() && num <= blockArr[i].getMax()){
                return i;
            }
        }

        //num不在该数组中
        return -1;
    }
}

class Block {                   //块
    private int max;            //块中的最大值
    private int min;            //块中的最小值
    private int startIndex;     //起始索引
    private int endIndex;       //结束索引

    public Block() {
    }

    public Block(int max, int min, int startIndex, int endIndex) {
        this.max = max;
        this.min = min;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
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