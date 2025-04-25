package Algorithm_Demo.Search_Demo.InterpolationSearch_Demo.Demo1;

/**
 * @Author HHH
 * @Date 2025/4/19 22:20
 * @Day Day23
 */

//InterpolationSearch   插值查找
//除mid外基本与二分查找一致,是二分查找的优化

//前提条件:
    //数组内的数据分布比较均匀
    //数组中的数据必须是有序的
    //如果数据是乱的，先排序再用查找得到的索引没有实际意义，只能确定当前数字在数组中是否存在，因为排序之后数字的位置就可能发生变化了

//插值查找的过程
    //min和max表示当前要查找的范围
    //mid是在min和max中间所有索引中较接近的索引
    //如果要查找的元素在mid的左边，缩小范围时min不变，max等于mid减1
    //如果要查找的元素在mid的右边，缩小范围时max不变，min等于mid加1

//mid = min + ((num - arr[min]) / (arr[max] - arr[min])) * (max - min)

public class InterpolationSearchDemo1 {
}
