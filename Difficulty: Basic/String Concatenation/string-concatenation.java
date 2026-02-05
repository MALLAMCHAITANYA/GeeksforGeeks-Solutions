// User function Template for Java
class Solution {
    public static String concatenateStrings(ArrayList<String> arr) {
        // Your code here
        String str="";
        for(int i=0;i<arr.size();i++){
            str+=arr.get(i);
        }
        return str;
    }
}