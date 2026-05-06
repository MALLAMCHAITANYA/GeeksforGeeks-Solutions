class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        
        int startIndex=0;
        int endIndex=k;
        int maxSum=sum;
        
        while(endIndex<arr.length){
            sum-=arr[startIndex];
            startIndex++;
            
            sum+=arr[endIndex];
            endIndex++;
            
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}