package java_Arrays;

public class LC1480 {
    public static int[] runningSum(int[] nums) {
        int sum=0;
        int arr[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
            arr[i]=sum;
        }   return arr;
    }
    static void main(String[] args) {

    }
}
