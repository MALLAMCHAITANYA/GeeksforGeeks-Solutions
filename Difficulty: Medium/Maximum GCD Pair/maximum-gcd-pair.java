// User function Template for Java

class Solution {
    static int MaxGcd(int n, int a[]) {
        // complete the function here
        int max=0;
        
        for(int num:a){
            max=Math.max(num,max);
        }
        
        int freq[]=new int[max+1];
        
        for(int k:a){
            freq[k]++;
        }
        
        for(int i=max;i>=1;i--){
            int count=0;
            for(int j=i;j<=max;j+=i){
                count=count+freq[j];
            }
            if(count>=2){
                return i;
            }
        }
        return 1;
    }
}