// Here we Explore the Logical Operator in Java
/*
  Logical Operators are:
       AND:- (&&)
       OR:- (||)
       NOT:- (!)
 */

public class Day3_Logical_Operator {
    public static void main(String[] args){
         int a = 10;
         int b = 20;

         boolean result1 = a<b && b>a;  
         /*Here is Check the Both the condition, if one condition is false it Gives False. Its Must Satisfy Both the Codition.'
          if in both the condition, One condition if False it gives False.
         */
         System.out.print("If a<b && b>a: ");
         System.out.println(result1);

         boolean result2 = a>b || a<b; 
         /* Here is Check the First condition is true then it is not check the second condition, if first condition is false 
         then its check the second condition, Here One Condition is true it Gives True. */
         System.out.print("If a>b || b<a: ");
         System.out.println(result2);

         /* Here It Check the both the Condition is Equal or not */
         boolean result3 = a!=b;
         System.out.print("If a!=b: ");
         System.out.println(result3);
    }
    
}
