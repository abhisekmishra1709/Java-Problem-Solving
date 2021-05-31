// Java Program to return a List of integer with values less than K
import java.util.*;
class SmallerthanK{        
    static List<Integer> getSmaller(int arr[], int k)    
        {        
        List<Integer> al = new ArrayList<Integer>();                
        for(int i=0; i<arr.length; i++)        
            {            
            if(arr[i] < k) 
            al.add(arr[i]);
            }  
        return al; 
        }      
public static void main (String[] args)
    {
// Create a ArrayList 
    int arr[] = {10, 40, 80, 30, 20, 15};                
    List<Integer> al = getSmaller(arr, 30);                
    for(Integer x: al)            
        System.out.println(x);    
    }
}