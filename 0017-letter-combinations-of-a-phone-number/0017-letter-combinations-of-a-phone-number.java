class Solution {
    String combinations[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> generateCombinations(String digits){
        List<String> finalResult = new ArrayList<>();
        if(digits.length() == 0)return finalResult;
        else if(digits.length() == 1){
            String currentValues = combinations[Character.getNumericValue(digits.charAt(0))];
            for(int i =0;i<currentValues.length();i++)finalResult.add(String.valueOf(currentValues.charAt(i)));
            return finalResult;
        }
        String currentValue = combinations[Character.getNumericValue(digits.charAt(0))];
        List<String> result = generateCombinations(digits.substring(1));
        
        for(int i=0;i<currentValue.length();i++){
            for(String str : result){
                String pushed = currentValue.charAt(i)+str;
                finalResult.add(pushed);
            }
        }
        return finalResult;
    }
    public List<String> letterCombinations(String digits) {
        return generateCombinations(digits);
    }
}