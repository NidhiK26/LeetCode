class Solution {
public:
void generate(int index, int n, vector<int>nums, vector<vector<int>>&ans ){
    if(index==n){

    ans.push_back(nums);
    return;
    }
    for(int i=index; i<n;i++){
        swap(nums[i], nums[index]);
        generate(index+1,n,nums,ans);
        swap(nums[i], nums[index]);    }
}
    vector<vector<int>> permute(vector<int>& nums) {
        int n=nums.size();
        vector<vector<int>>ans;
        generate(0,n,nums,ans);
        return ans;
    }
};