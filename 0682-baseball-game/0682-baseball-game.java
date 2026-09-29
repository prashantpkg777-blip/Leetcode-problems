import java.util.*;

class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();

        for(String opr: operations){

            if(opr.equals("C")){
                // remove previous element
                stack.pop();
            }
            else if(opr.equals("D")){
                // store double of last element
                int last = stack.peek();
                stack.push(last*2);
            }
            else if(opr.equals("+")){
                // store the sum of previous two element
                int last = stack.pop();
                int secondLast = stack.peek();

                stack.push(last);
                stack.push(last + secondLast);
            }
            else{
                // store new record
                stack.push(Integer.parseInt(opr));
            }

        }
        int sum =0;
        for(int score: stack){
            sum += score;
        }

        return sum;
    }
}