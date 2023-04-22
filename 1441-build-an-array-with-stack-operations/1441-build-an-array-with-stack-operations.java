class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
          int input =1;
         for(int i:target){
            while(input<i){
                ans.add("Push");
                ans.add("Pop");
                input++;
            }
            ans.add("Push");
            input++;
         }
         return ans;

    }
}