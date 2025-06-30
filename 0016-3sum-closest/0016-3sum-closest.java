class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int answer=nums[0]+nums[1]+nums[2];
        int n=nums.length;

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    for(int k=0;k<n;k++){
                        int closest=nums[i]+nums[j]+nums[k];
                        if(i==j || j==k){
                            if(Math.abs(closest-target)<Math.abs(answer-target)){
                                answer=closest;
                            }
                        }
                    }
                }
            }
        }
        return answer;
    }
}