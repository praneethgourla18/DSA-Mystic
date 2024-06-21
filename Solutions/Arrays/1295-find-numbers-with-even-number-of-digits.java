class Solution {
    public int findNumbers(int[] arr) {
        int res=0;
        for(int i=0;i<arr.length;i++){
            int count=0;

            int num=arr[i];
            
            while(num>0){
                count++;
                num=num/10;

            }
            if(count%2==0){
                res++;
            }
        }
        return res;
    }
}