class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] index=new int[nums.length];
        int i=0;
        while ( i <=nums.length) {
            if(nums[i]+nums[i+1]==target){
                
                index[0]=i;
                index[1]=i+1;
            }
        }
        return index;
        
        
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target=9;
        
twoSum(nums, target);
    }
}