//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String, Integer> PhoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
    
    
    PhoneBook.put (name , phone ); 
     in.nextLine();

        }
        while(in.hasNext()){
           String s = in.next();
            // Write code here
     if (PhoneBook.containsKey(s))
         System.out.println(s+"="+PhoneBook.get(s));       
     else {
                System.out.println("Not found");
            }}

        in.close();
    }
}

