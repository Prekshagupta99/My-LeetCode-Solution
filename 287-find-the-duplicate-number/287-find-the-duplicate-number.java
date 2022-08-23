class Solution {
    public int findDuplicate(int[] nums) {
        // int len = nums.length;
        // nums.sort();
        //     for(int i = 0; i<len ; i++)
        //         if(nums[i]==nums[i+1])
        //             return nums[i];
        // return 1;
        //------------2nd Method-------Couting the occurence------
        // int occurence[] = new int [len];
        // for(int i = 0 ; i < len ; i++){
        //     ++occurence[nums[i]];
        //     if(occurence[nums[i]]>1)
        //         return nums[i];
        //     }
        // return 0;
        int slow = nums[0];
        int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        fast = nums[0];
            while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
        
    }
}   
    
