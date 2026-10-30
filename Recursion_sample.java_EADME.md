Problem:
       Find even numbers from given numbers using recursion
Aproach:
      Recursion instead of loop concept each recursive call has it's own block of stack frame.
      Wait untill pass the base case then unwinds from where it is passed (previous call)
Example:
      int[] nums = {2,5,8,10,12,11,14}
      base case:
              if(index==nums.length)
      call untill travarse all data element from the given array
Time Complexity:
      O(n) = travarse with in full array
Space Comlexity:
     Auxiliary Space Complexity: O(n) — Each recursive call creates a stack frame. The maximum recursion depth is proportional to the array size.
     Note: The counter variable uses O(1) space, but the recursive call stack requires O(n) space.

Problem:

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

      
      


      

