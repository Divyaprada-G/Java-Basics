// Here we Explore the DataTypes in Java 
/* DataTypes In Java are: 
  integer, Char, float, double, String, Boolean */
 
// Here we Explore all the datatypes in java and print all this in a Seperate Lines.

public class Day2_DataTypes{
    public static void main(String[] args){
        int a = 10;   
        char ch = 'c';
        float fl = 10.06f;   // In This java we must add "f" in after floating point value
        double du = 16.2037;
        String str = "Hello World";
        boolean bl = true;

        System.out.print("This is the Integer DataType: ");
        System.out.println(a);

        System.out.print("This is the Character DataType: ");
        System.out.println(ch);

        System.out.print("This is the Float DataType: ");
        System.out.println(fl);

        System.out.print("This is the Double DataType: "); 
        System.out.println(du);

        System.out.print("This is the String DataType: ");  
        System.out.println(str);

        System.out.print("This is the Boolean DataType: ");  
        System.out.println(bl);


        // In int we have Some Sub Types
        long l = 122343l;
        short s = 15;
        byte b = 13;

        System.out.print("This is the Long DataType in Integer: ");  
        System.out.println(l);

        System.out.print("This is the short DataType in Integer: ");  
        System.out.println(s);

        System.out.print("This is the byte DataType in Integer: ");  
        System.out.println(b);

    }
}