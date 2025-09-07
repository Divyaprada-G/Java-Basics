// IF ELSE Example Program 1:-
// Check the Given Year is Leap Year Or Not

public class Day4_if_else_Example_Problem2 {
    public static void main(String[] args){
        int year = 2005;
        
        if(year%4==0 && year%100 != 0){
            System.out.println("The Given Year is " + year + " Leap Year");
        }
        else if(year%400==0){
            System.out.println("The Given Year is " + year + " Leap Year");
        }
        else{
            System.out.println("The Given Year is " + year + " Not a Leap Year");
        }
    }    
}
