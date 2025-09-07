// Here we Explore While Loop in Java

/* Explain:- If We want to write 1 t0 10 using If/else it can be possible, but it can not good coding and 
 it's can be time taken, So that Using Loops we Write a Single line for this and it can be display 10 at a time */

 // In While loop, Check the condition First then Print the Statement

public class Day6_While_Loop {
    public static void main(String[] args){
           
             int n = 1;
             while(n<=10){
                System.out.println("This is My First While Loop " + n); // "n" is number of iterations
                n++; 
             }
             /* While Loop works as first initilize the value and check the condition,
                if the condition is True then only its Enter into Loop and Print the Statement
                and increment the n is 1 to 2, its repeat upto the condition is True, Then Once
                its false ,it come out of the loop
              */

              // To print in Reverse the Numbers code is:-
              /*
                    int n = 10;
                      while(n>=1){
                      System.out.println("This is My First While Loop " + n); // "n" is number of iterations
                      n--; 
                      }
               */
    }
}
