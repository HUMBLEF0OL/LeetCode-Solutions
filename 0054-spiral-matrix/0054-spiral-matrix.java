class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0,right = matrix[0].length-1,bottom=matrix.length-1,top=0;
        int direction = 0;
        List<Integer> result = new ArrayList<>();
        while(left<= right && top <= bottom){
            // move left to right
            int i=0;
            if(direction%4 == 0){
                i = left;
                while(i<=right){
                    result.add(matrix[top][i++]);
                }
                top++;
                direction++;
            } else if(direction%4==1){
                // top to bottom in right direction
                i = top;
                while(i<=bottom){
                    result.add(matrix[i++][right]);
                }
                right--;
                direction++;
            } else if(direction%4==2){
                // right to left in bottom direction
                i = right;
                while(i>=left){
                    result.add(matrix[bottom][i--]);
                }
                bottom--;
                direction++;
            }else if(direction%4==3){
                // bottom to top in left direction
                i = bottom;
                while(i>=top){
                    result.add(matrix[i--][left]);
                }
                left++;
                direction++;
            }
                
        }
        return result;
    }
}