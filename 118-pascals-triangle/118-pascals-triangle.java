import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        //return a list of lists
        ArrayList<List<Integer>> triangle = new ArrayList<List<Integer>>();
        for(int i = 0; i < numRows; i++){
            triangle.add(new ArrayList<Integer>());
            for(int j = 0; j < i + 1; j++){
                int next;
                // if on the outer wall of the triangle
                if(j == 0 || j == i){//j == i is equivalent to j == i + 1 - 1 which is rowSize - 1
                    next = 1; 
                }else{// if an inner cell of the triangle
                    next = triangle.get(i-1).get(j-1) + triangle.get(i-1).get(j); 
                }
                triangle.get(i).add(next);
            }
        }
        return triangle;
    }
}