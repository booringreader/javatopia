
// reversing a string using stack implementation with arraylists 
import java.util.ArrayList;
import java.util.Scanner;

public class strrev {
    static class stack{
        // implement stack in ArrayList
        // push(), pop(), peek(), isEmpty() operations

        static ArrayList<Character> list = new ArrayList<>();

        // returns 1 if the size of stack object (arraylist on the floor) is empty
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push character datatype (since we'll deal with strings) into the stack (arraylist under the hood)
        public static void push(char data){
            list.add(data);
        }

        // remove character datatype from the end of the arraylist (if not empty)
        public static char pop(){
            if(isEmpty()){
                System.out.println("stack empty");
                return '\'';
            }
            char output = list.get(list.size()-1);
            list.remove(list.size()-1);
            return output;
        }

        // retrieve charater datatype from the arraylist (if not empty)
        public static char peek(){
            if(isEmpty()){
                System.out.println("stack empty");
                return '\'';
            }
            return list.get(list.size()-1);
        }
    }

    public static void reverse(String str, stack st) { // takes string and stack object as argument
        char c;
        for(int i=0; i<str.length(); i++){
            c = str.charAt(i);
            st.push(c);
        }
        while(!st.isEmpty()){
            System.out.print(st.pop() + " ");
        }
    }

    public static void main(String args[]) {
        stack st = new stack();
        String inputStr;
        Scanner sc = new Scanner(System.in);
        inputStr = sc.nextLine();
        reverse(inputStr, st);
    }
}