class Solution {
    public int maxProduct(int[] nums) {
        
        int product=Integer.MIN_VALUE;
        int prodStart=1, prodEnd=1;
        int n=nums.length;

        for(int i=0;i<n;i++){
            prodStart*=nums[i];
            prodEnd*=nums[n-1-i];

            product=Math.max(product, Math.max(prodStart, prodEnd));

            if(prodStart==0) prodStart=1;
            if(prodEnd==0) prodEnd=1;
        }

        return product;
    }
}