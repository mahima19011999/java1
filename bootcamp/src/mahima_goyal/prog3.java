package mahima_goyal;
         import java.util.Scanner;
         import java.lang.Math;

public class prog3 {

    public static void main(String[] args) {
        int option;
        double radius, circumference,area;
        Scanner sc = new Scanner (System.in);
        System.out.println("******Menu******");
        System.out.println("Enter Radius: ");
        radius=sc.nextInt();
        System.out.println("\n1.Calculate Area of Circle");
        System.out.println("2.Calculate Circumference of a Circle");
        System.out.println("3.Exit");
        option=sc.nextInt();
        switch(option)
        {
        case 1:
            System.out.println("Area of Circle is: ");
            area=(Math.PI*(radius*radius));
            System.out.println(area);
            
            break;
        case 2:
        	System.out.println("Circumference of Circle is: ");
            circumference=2*3.17*radius;
            System.out.println(circumference);
            
            break;
        case 3:
            
            exit();
            
            break;
            
        default:System.out.println("Invalid Choice");    
        }
        sc.close();
    }
       private static void exit() { 
       }
}

