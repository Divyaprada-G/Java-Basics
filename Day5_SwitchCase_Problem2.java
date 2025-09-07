//
public class Day5_SwitchCase_Problem2 {
    public static void main(String[] args){
         int n = 16;
         switch(n%2){
            case 0:
              System.out.println("The Given Number is Even Number");
              break;
            case 1:
              System.out.println("The Given Number is Odd Number");
              break;
              
            default:
              System.out.println("Please Enter Positive Integer");  
         }
    }
     
}
