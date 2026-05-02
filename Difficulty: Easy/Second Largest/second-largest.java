class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int large1=arr[0];
        int large2=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>large1){
                large2=large1;
                large1=arr[i];
            }
            else if(arr[i]>large2 && arr[i]!=large1){
                large2=arr[i];
            }
        }
        if(large2==0) return -1;
        return large2;
    }
}