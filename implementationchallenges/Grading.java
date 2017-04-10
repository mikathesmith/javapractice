import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Grading{

    static int[] solve(int[] grades){
        // Complete this function
        int[] new_grades = new int[grades.length];
        for(int i=0; i<grades.length; i++){
            if(grades[i]>=38){ 
                //find closest multiple 
                int nextMultiple = (grades[i]/5)+1; 
                int roundup = nextMultiple*5; 
                if(grades[i] > roundup - 3){ //if i is no more than 3 below nextMultiple*5
                    new_grades[i]=roundup;
                }else{
                //otherwise grade unchanged
                    new_grades[i]=grades[i];
                }
            }else{
                //otherwise grade unchanged
                new_grades[i]=grades[i];
            }
        }
        return new_grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        for(int g: solve(grades)){
            System.out.println(g);
        }
        
    }
}
