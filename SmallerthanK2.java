// Java Program to return a List of integer with values less than K taking both inputs from user
import java.util.*;
class SmallerthanK2{        
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
int n,k;  
Scanner sc=new Scanner(System.in);  
System.out.print("Enter the number of elements you want to store: ");  

n=sc.nextInt();  

int[] array = new int[n];  
System.out.println("Enter the elements of the array: ");  
for(int i=0; i<n; i++)  
{  

array[i]=sc.nextInt();  
}  
System.out.println("Array elements are: ");  

for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  

System.out.print("Enter the value of K: ");  
k=sc.nextInt();
             
List<Integer> al = getSmaller(array, k);                
for(Integer x: al)            
System.out.println(x);    
}
}