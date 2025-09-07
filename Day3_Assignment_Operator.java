// Here we Explore the Assignment Operator in Java
/*
  Assignment Operators are:
       Add:- (+=)
       Sub:- (-=)
       Mul:- (*=)
       div:- (/=)
       mod:- (%=) it's Gives a Reminder
       equal:- (=)
 */

public class Day3_Assignment_Operator {

     public static void main(String[] args){
          int num = 10;
          System.out.print("This Add of num is: ");
          System.out.println(num+=2);  // its is Equal to "num = num + 2"

          System.out.print("This Sub of num is: ");
          System.out.println(num-=2);  // its is Equal to "num = num - 2"

          System.out.print("This Mul of num is: ");
          System.out.println(num*=2);  // its is Equal to "num = num * 2"
          
          System.out.print("This Div of num is: ");
          System.out.println(num/=2);  // its is Equal to "num = num / 2"

          System.out.print("This Mod of num is: ");
          System.out.println(num%=2);  // its is Equal to "num = num % 2"
          
    }
    
}
