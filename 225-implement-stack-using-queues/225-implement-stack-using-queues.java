class MyStack {
Queue<Integer> first;
    Queue<Integer> second;
    public MyStack() {
        first=new LinkedList<Integer>();
        second=new LinkedList<Integer>();
    }
    
    public void push(int x) {
        first.add(x); 
    }
    
    public int pop() {
         if(first.size()==0)
            return -1;
        int x=0;
      //   System.out.print(first);
        while(first.size()!=1)
        { second.add(first.peek());
        first.remove();
        }
        x=first.remove();
       Queue<Integer> q=first; 
        first=second;
        second=q;
       //System.out.print(second);
        return x; 
    }
    
    public int top() {
        if(first.size()==0)
            return -1;
        int x=0;
      //   System.out.print(first);
        while(first.size()!=1)
        { second.add(first.peek());
        first.remove();
        }
        x=first.peek();
        first.remove();
        second.add(x);
       Queue<Integer> q=first; 
        first=second;
        second=q;
       //System.out.print(second);
        return x;
    }
    
    public boolean empty() {
          if(first.isEmpty())
            return true;
        else
            return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */