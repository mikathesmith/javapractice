import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    
    public static void main(String[] args) {
        
        Stack<Character> leftBracket = new Stack<Character>();
        Stack<Character> rightBracket = new Stack<Character>();
        
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int a0 = 0; a0 < t; a0++){
            //Initialising variable 
            Boolean answer = false;
            String s = in.next();
            int index;
            List<Character> ans = new ArrayList<Character>(); 
            
            
            //Pushing to stack 
            for(index=0; index < (s.length()/2); index++){            
                leftBracket.push(s.charAt(index));     
            }
            for(int i = s.length()-1; i >= index; i--){  
                rightBracket.push(s.charAt(i));     
            }
            
            System.out.println(leftBracket.toString());
            System.out.println(rightBracket.toString());
            
            
            //Comparing brackets 
           for(int i=0; i < leftBracket.size(); i++){
                if(leftBracket.isEmpty() || rightBracket.isEmpty()){
                    ans.add('F');
                }
                char left = leftBracket.pop();
                char right = rightBracket.pop();
                if(left == '[' && right == ']'){
                    ans.add('T');
                }else if(left == '{' && right == '}'){
                    ans.add('T');
                }else if(left == '(' && right == ')'){
                    ans.add('T');
                }else{
                    ans.add('F');
                }             
            }
           
            //Printing answer 
            System.out.println(ans.toString());
            if(ans.contains('F')){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
    }
}
