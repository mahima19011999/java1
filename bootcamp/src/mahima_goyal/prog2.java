package mahima_goyal;
         import java.util.ArrayList;
         import java.util.Scanner;

public class prog2 {

    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<String>();
//        
//        Scanner sc =new Scanner(System.in);
//        String input=sc.next();
//        a1.add(input);
//        while(! "XDONE" .equals(input)){
//            System.out.println(input);
//      }
//      sc.close();
      
      ArrayList<String> names = new ArrayList<String>();
      String userInput;
      Scanner scanner = new Scanner(System.in);
      while(true) {
          userInput = scanner.next();
          if(userInput.equals("XDONE")) {
              break;
          } else {
              names.add(userInput);
          }
      }
      scanner.close();
  }

}
