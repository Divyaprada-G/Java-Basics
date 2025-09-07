// Here we Explore Do While Loop in Java

/* Explain:- If We want to write 1 t0 10 using If/else it can be possible, but it can not good coding and 
 it's can be time taken, So that Using Loops we Write a Single line for this and it can be display 10 at a time */

 // In Do While loop, Print the Statement at least one if the Condition is False also
 // Its print first Statement, then Check the Condition

public class Day6_Do_While_Loop {
    public static void main(String[] args){
         int i = 1;
         do{
            System.out.println("This is My First Do While Loop " + i);
            i++;
         }while(i<=10);
    
       
             /* Do While Loop works as first initilize the value and Print the Statement First
                then increment, then Check the condition, in this if the condition is False is Print
                the statement at least once.
              */

              
              // To print in Reverse the Numbers code is:-
              /*  int i = 10;
                do{
                 System.out.println("This is My First Do While Loop " + i);
                 i--;
                }while(i>=1);
              */  
      }            

}
