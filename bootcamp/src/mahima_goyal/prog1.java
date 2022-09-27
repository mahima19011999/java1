package mahima_goyal;

class prog1{ 
static int Age; 
static String FirstName; 
static String LastName; 
static { 
System.out.println("Static Block"); 
Age=24; 
FirstName="mahima"; 
LastName="Goyal"; 
} 
static void disp() { 
System.out.println("FirstName is: " +FirstName); 
System.out.println("LastName is: " +LastName); 
System.out.println("Age: " +Age); 
} 
public static void main(String[] args) 
{ 
System.out.println(FirstName +" " +LastName + " " +Age ); 
disp(); 
} 
}
