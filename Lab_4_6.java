public class Lab_4_6 {
    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String s = args[0];


        for (int i = 0; i < s.length(); i++) {
          char ch=args[i].charAt(0);

            if(ch <= 'A' && ch >= 'Z'){ 
                System.out.println(""+ch);
                return;
  
       }
        
        
     }
  } 
 
  
}