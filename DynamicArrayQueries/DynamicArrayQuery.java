/*
Given N (number of sequences), Q(number of queries) and Q queries, execute each query. 
Two types of query given by 1 or 2 in first input of 
each line. 

Create a list seqList of N empty sequences. 

Query 1: 1 x y
	Find sequence seq at index ((x XOR lastAns)%N) in seqList 
	Append integer y to sequence seq
	
Query 2: 2 x y
	Find sequence seq at index ((x XOR lastAns)%N) in seqList 
	Assign lastAns to the value of (y % size) in seq
	Print lastAns


*/
import java.util.*;

public class DynamicArrayQuery {
    
    public static void main(String[] args) {

        int lastAns=0; 

        Scanner sc = new Scanner(System.in);
        int numSeqs = sc.nextInt();
        int numQuers = sc.nextInt();
        
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<>(); 
        for(int i=0; i<numSeqs; i++){
            seqList.add(new ArrayList<Integer>());
        }
        
        for(int i=0; i<numQuers ; i++){
            int queryType = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt(); 
            
            ArrayList<Integer> seq = seqList.get((x^lastAns) % numSeqs);
            if(queryType==1){
                seq.add(new Integer(y)); 
            }else{
                lastAns = seq.get(y % seq.size());
                System.out.println(lastAns);
            }

        }
        sc.close();
        
        
    }
    
}