public class Recursion_sample{
    public static int recursion_count_even_num(int[] nums,int i,int result){
        if(i==nums.length){
            return result;
        }

        if(nums[i]%2==0){
            result = result + 1;
        }

        return recursion_count_even_num(nums,i+1,result);
    }

    public static int count_even_num(int[] nums){
        int result = 0;
        return recursion_count_even_num(nums,0,result);
    }
    public static void main(String args[]){
        int[] nums = {2,5,8,10,12,11,14,17};
        System.out.println(count_even_num(nums));
    }
}