// reversing a string using stack implementation with arraylists 
import java.util.Arraylist;
public class strrev{
    // we won't need to check for stack full, since arraylist is allocated dynamically
    public class stack{
        static Arraylist <Character> st = new Arraylist<>(); // every first order member of a static class must be static

        public static boolean isempty(){ // checks whether the stack is empty
            // if empty returned 1, else 0;
            return st.size()==0; // size() method for arraylist; .length for arrays 
        }

        public static void push(char str){
            st.add(str); 
        }

        public static char pop(){
            if(isempty()){
                System.out.println("empty stack");
                return '\'';
            }
            // int output = st.get(st.size()-1);
            // st.remove(st.size()-1);
            // return output; 
            return st.remove(st.size()-1);
        }

        public static char peek(){
            if(isempty()){
                 System.out.println("empty stack");
                 return '\''; // returning ' means the stack is empty
            }
            char output = st.get(st.size()-1);
            return output;
        }
    }

    // stack implementation ends
    
    //string reversal function
    public static void reverse(String inputstr, stack st){
        for(int i=0; i<inputstr.length(); i++){
          st.add(inputstr.toChar(i));
        } 
        while(!st.isempty()){
            System.out.print(st.pop() + " ");
        }
    }
    public static void main(String args[]){
        String inputStr = "COMPLIMENTARY HELLO WORLD STRING";
        stack st = new stack();
        reverse(inputStr, st);
    } 
}
