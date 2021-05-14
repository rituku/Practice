package array;

public class subsetusingrecursion {
static int count = 0;
	static void powerSet(String str, int index, String curr)  
    {  
    int n = str.length(); 
   // int count = 0;
    // base case  
    if (index == n) 
    {  
        System.out.println(curr); 
        count++;
        return;  
    }  
  
    // Two cases for every character  
    // (i) We consider the character  
    // as part of current subset  
    // (ii) We do not consider current  
    // character as part of current  
    // subset  
    powerSet(str, index + 1, curr + str.charAt(index));  
    powerSet(str, index + 1, curr); 
    }  
  
 
public static void main(String[] args)  
{ 
    String str = "abc";  
    int index = 0; 
    String curr=""; 
    powerSet(str,index,curr);  
  System.out.println(count);
    }
}
