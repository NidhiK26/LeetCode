class Solution {
    public boolean isMonotonic(int[] nums) {
         int inc=0;
       int dec=0;
                for(int i=0;i<nums.length-1;i++){
                    if(nums[i]<=nums[i+1]){ //inc
                        inc++;
                    }
                }
                for(int i=0;i<nums.length-1;i++){
                    if(nums[i]>=nums[i+1]){ //dec
                        dec++;
                    }
                }

                if(inc==nums.length-1 || dec==nums.length-1)
                return true;
                else
                return false;

    }

}