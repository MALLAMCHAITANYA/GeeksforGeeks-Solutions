// User function Template for Java
class Solution {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        // Your code here
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<arr.size();i++){
            pq.add(arr.get(i));
        }
        return pq;
    }
}