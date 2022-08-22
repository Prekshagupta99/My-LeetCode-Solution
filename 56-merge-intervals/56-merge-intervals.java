class Solution {
     public static class pair implements Comparable<pair>{
int st;
int et;
public int compareTo(pair o){
    if(this.st!=o.st){
        return this.st-o.st;
    }
    else{
        return this.et-o.et;
    }
}
     }
    
    
    
    public int[][] merge(int[][] intervals) {
        int n=intervals.length;
         List<pair> arr=new ArrayList<>();
         for(int i=0;i<n;i++){
                int x=intervals[i][0];
                int y=intervals[i][1];
              pair mp=new pair();
              mp.st=x;
              mp.et=y;
              arr.add(mp);
        }
        Stack<Integer> stk=new Stack<>();
        Collections.sort(arr);
        pair p=arr.get(0);
        stk.push(p.st);
        stk.push(p.et);
        
        for(int i=1;i<n;i++){
        pair temp= arr.get(i);  
            if(stk.peek()>=temp.st && stk.peek()<temp.et){
                stk.pop();    //1
                stk.push(temp.et);
            }
            else if(stk.peek()>temp.et){
                continue;    //2
            }
            else if(stk.peek()<temp.st){
                stk.push(temp.st);     //3
                stk.push(temp.et);
            }
        }
        
        
        int[][] result=new int[stk.size()/2][2];
        for(int i=result.length-1;i>=0;i--){
        int x=stk.pop();
        int y=stk.pop();
            result[i][0]=y;
            result[i][1]=x;
        }
        return result;
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         List<int[]> res = new ArrayList<>();
        
//         if(intervals.length == 0 || intervals == null)
//             return res.toArray(new int[0][]);
        
        
//         int start = intervals[0][0];
//         int end = intervals[0][1];
        
//         for(int[] i: intervals){
//             if(i[0] <= end){
//                 end = Math.max(end, i[1]);
//             }else{
//                 res.add(new int[]{start, end});
//                     start = i[0];
//                                 end = i[1];
//             }
//         }
//                                 res.add(new int[]{start, end});
//                                 return res.toArray(new int[0][]);
    }
}