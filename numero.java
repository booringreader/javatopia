// generate a random number, take input from the user, output accuracy of input, repeat for k cycles
import java.lang.Math;
import java.util.Scanner;
public class numero{
    public static void main(String args[]){
        // input variables
        Scanner sc = new Scanner(System.in);
        int input;
        int k = 3; // specifies the number of tries a user gets
        
        // graphic for gaming setup
        //
        
        // defining range for the randInt
        int max=50, min=1; 
        int range = (max-min) + 1; // 50 numbers possible

        // generate random number
        int randInt = (int)(Math.random() * max);

        // test
        System.out.println("randInt: " + randInt);
        // game logic
        while(k!=0){
            System.out.print("guess the number: ");
            input = sc.nextInt();
            if(randInt == input){
                System.out.println("You win");
                return;
            }else if((randInt-input)>0){
                System.out.println("go higher maggot 🤡");
                k--;
            }else if((randInt-input)<0){
                System.out.println("stay down to earth icarus 😬");
                k--;
            }
        }
    }
}
