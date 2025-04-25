import java.util.Arrays;

/**
 * @Author HHH
 * @Date 2025/4/22 22:50
 * @Day Day26
 */
public class Test {
    public static void main(String[] args) {
        int[] nums = {2,2,3};
        System.out.println(removeElement(nums,2));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        if(nums.length == 0) return 0;

        if(nums.length == 1 && nums[0] == val) return 0;

        //从数组首位开始寻找val
        int i = 0;
        //从数组末尾开始寻找非val
        int j = nums.length - 1;
        //记录数组中val的数量
        int count = 0;

        while(true){

            while(i <= j && nums[i] != val  ) i++;


            if(i <= j && nums[i] == val){
                nums[i] = -1;
                count++;
            }

            while(i < j && nums[j] == val  ){
                nums[j] = -1;
                count++;
                j--;
            }

            if(i <= j && nums[i] == -1 && nums[j] != val && nums[j] != -1){
                nums[i] = nums[j];
                nums[j] = -1;
                i++;
                j--;
            }

            if(i > j) return nums.length - count;

        }
    }
}
