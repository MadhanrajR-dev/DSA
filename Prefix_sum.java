public class Prefix_sum{
    public static int[] prefix(int[] nums){
        int n = nums.length;
        int[] prefix = new int[n];

        prefix[0] = nums[0];

        for(int i = 1; i<n; i++){
            prefix[i] = prefix[i-1] + nums[i];
        }
        return prefix;
    }
    public static int rangeSum(int[] prefix,int left,int right){
        if(left==0){
            return prefix[right];
        }

        return prefix[right] - prefix[left-1];
    }
    public static void main(String args[]){
        int[] nums = {10,20,30,40,50};

        for(int sum : prefix(nums)){
            System.out.println("Prefix Sum Value: "+ sum);
        }
        System.out.println("Range Sum: "+rangeSum(prefix(nums),1,3));
    }
}