//Two Sum Problem...
//Brute force Approach..

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}

// Better Approach Using HashMap data structure..


//Optimal Approach using two pointers low and high..
//Two pointer Approach..

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(left < right){
            if(nums[left]+nums[right] == target){
                ans[0] = left;
                ans[1] = right;
            }
            else if(nums[left]+nums[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return ans;
    }
}
