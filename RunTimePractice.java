import java.util.*;

public class RunTimePractice{
    
    public static int findNumsofRepetitions(String s, char c){
        int sum=0; //O(1)
        for(int i=0; i< s.length() ; i++){  //n+1 time
            if(s.charAt(i) == c){ //linear time
                sum++;
            }
        }
        return sum; //O(1)
    }
    
    //brute force!
    public static int[] findNumsofRepetitions2(String s, char[] c){
       int[] sums = new int[c.length];
        for(int i=0; i< s.length();i++){ //quadratic running time
            for(int j=0; j < c.length; j++){
                if(s.charAt(i) == c[j]){
                    sums[j]=sums[j]+1;
                }
            }
        }
        return sums; 
    }
    
    public static int[] findNumsofRepetitions3(String s, char[] c){
        //O(n+n) as string and character array are not guaranteed to be equal in length. If one is bigger, that is dominant. 
        int[] sums = new int[c.length];
        HashMap<Character, Integer> map = new HashMap<>();
        //gets occurance of every character in the string and adds the total to 
        for(int i=0; i < s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), 1);
            }else{
                int sum= map.get(s.charAt(i));
                map.put(s.charAt(i), sum+1);
            }
        }
        
        for(int j=0; j< c.length; j++){
            int sum;
            if(!map.containsKey(c[j])){
                sums[j]=0; //not in the hashmap
            }else{
                sums[j] = map.get(c[j]); //how many repetitions this character has. 
            }
        }
        
        return sums;
    }

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        System.out.println(findNumsofRepetitions("ghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababa", 'a'));
        long endTime = System.currentTimeMillis();
        long duration = endTime-startTime;
        System.out.println("1 Test " + duration + "ms");
        
        char[] a = {'a', 'b'};
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumsofRepetitions2("ghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababa", a));
        endTime = System.currentTimeMillis();
        duration = endTime-startTime;
        System.out.println("2 Test " + duration + "ms");
        
        startTime = System.currentTimeMillis();
        System.out.println(findNumsofRepetitions3("ghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababaghjdshdasabcbbasbjabjbjcdbjcbjabsjbgfldklsfsouhsflsdkjhgfewoijafkllcsdlksdvnlkncslvnvnlxknnlknxlcknoleifjnsnaaxzababa", a));
        endTime = System.currentTimeMillis();
        duration = endTime-startTime;
        System.out.println("3 Test " + duration + "ms");
    }

}