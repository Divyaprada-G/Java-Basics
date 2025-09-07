/* NOTE: In the Java We Use New Void Function in the Same Class not Out Side of the Class.
         In Java only One Class, But More Void Function and That Void Function are Calling in the Main Function */

//Control Flow 
/*Here we Explore if, if/else, if/else if/else with Using an Example*/
public class Day4_if_else_Explain{
    public static void main(String[] args){
         
        // Here Check the N is Greater Then 10 or not. using Only if Statement
        int N = 20;
        if(N>10){
            System.out.println("This N is Greater Then 10");
        }
        System.out.println("The N is Not Greater Then 10, It is Lesser Then 10");


        // Call the New Function
        new_fun1();
        new_fun2();
    }
  /* Here Check the Output if the condition is True it prints Both but if condition is False Print only out of the loop,
      Because The Second Print Statement is Out of the loop its print both ifcondition is true, condition is false print 
        out of the loop */



   // Next we Explore if/else Statement
   // But Here we Use New Function for this and Call that Function in the Java Main Function

   public static void new_fun1(){
        // Here Check the Same Statement Using if/else to Print either The Given Condition is true or flase
        // Check the X is Greater Then 10 or not. using Only if/else Statement(HERE WE TAKE DIFFERENT VARIABLE NAME AS X)
        int X = 9;
        if(X > 10){
           System.out.println("The X is Greater Then 10");
        }else{
            System.out.println("The X is Less Than 10");
        }
   } 



   /* Okay It's All Good But if the we Put Condition Value as Same as X Value then it give What,
    Let's Find That Solution for that Using the if/else if/else Statement */

    public static void new_fun2(){
        // Take Different Variable Name Here
        int Y = 5;
        if(Y==10){
             System.out.println("This Y is Equal To 10");
        }else if(Y>10){
            System.out.println("The Y is Greater Then 10");
        }else{
            System.out.println("The Y is Less Then 10");
        }
    }
}   
