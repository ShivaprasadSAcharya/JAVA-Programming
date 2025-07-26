import java.util.*;

public class BottomStack {
    public static void pushToBottom(int data, Stack<Integer> s){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushToBottom(data,s);
        s.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushToBottom(4,s);

        while (!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}
