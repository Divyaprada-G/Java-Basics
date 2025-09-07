// Here Today We Explore Switch Case Statement Using An Example
// The Basic/Default Example For this Switch Case is "Day of The Week"

public class Day5_SwitchCase_Problem1{
     public static void main(String[] args){
             int Day = 3;

             switch(Day){
                 case 1:
                   System.out.println("Monday");
                   break; // Break is used, Because if The Input is Matching to this case Then It's Break the Statement and Display That output
                 case 2:
                   System.out.println("Tuesday");
                   break;
                 case 3:
                   System.out.println("Wednesday");
                   break;
                 case 4:
                   System.out.println("Thursday");
                   break;
                 case 5:
                   System.out.println("Friday");
                   break;
                 case 6:
                   System.out.println("Saturday");
                   break;
                 case 7:
                   System.out.println("Sunday");
                   break;
                   
                 default:
                   System.out.println("Please Enter Positive Number Between the 1 to 7");
                   /* Default is used, because in case user enter Wrong input, its display Nothing 
                     so that we use Default then it Display Default Statement */    
             }
     }
}