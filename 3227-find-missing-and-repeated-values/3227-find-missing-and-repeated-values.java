class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length ;
        int ans[]=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            int ele=Math.abs(grid[i][j]);
            if (grid[(ele - 1) / n][(ele - 1) % n] < 0)  {
            ans[0]=ele;
              }  else{
          grid[(ele - 1) / n][(ele - 1) % n] *= -1;             
           }
        }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
              if(grid[i][j]>0)
             ans[1] = i * n + j + 1;     
                    }
           
        }
        return ans;
    }
}