class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int arr[] = new int[2];
        for(int i =0;i< s.length();i++){
            int charIndex = (int)s.charAt(i)-97;
            arr[1]+= widths[charIndex];
            if(arr[1]>100){
                arr[1] = widths[charIndex];
                arr[0]+=1;
            }
        }
        if(arr[1] !=0){
            arr[0]+=1;
        }
        return arr;
    }
}