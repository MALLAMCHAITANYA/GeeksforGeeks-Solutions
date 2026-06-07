class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            int compliment=target-arr[i];
            if(set.contains(compliment)){
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
}