class Solution {
    public ArrayList<Integer> frequencyCount(int[] arr) {
        // code here
        LinkedHashMap<Integer,Integer>map=new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        ArrayList<Integer>list=new ArrayList<>();
        for(int v:map.values()){
            list.add(v);
        }
        return list;
    }
}