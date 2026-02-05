// User function Template for Java

class Solution {
    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        // Your code here
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        ArrayList<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        return list;
    }
}