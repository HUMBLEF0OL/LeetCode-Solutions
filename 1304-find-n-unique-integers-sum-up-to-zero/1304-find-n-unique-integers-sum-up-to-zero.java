class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int[n];
        int i = 1;
        if(n%2 ==0){
            arr[0]=1001;
            arr[n-1] = -1001;
        }
        while(i<n-1){
            int value = i;
            arr[i++]=value;
            arr[i++]=-value;
        }
        return arr;
    }
}