import java.util.*;

class JosephusProblem {
    
    static int josephus(int N, int K)
    {
        LinkedList<Integer> list = new LinkedList<>();
        
        // Add elements numbered from 0 to N-1 
        // in LinkedList
        for(int i=0; i<N; i++)
            list.add(i);
            
        Iterator<Integer> it = list.iterator();
        
        // Run this loop until there is only 
        // one element left in the list
        while(list.size()>1)
        {
            int count = 1;
            
            // Find Kth element
            while(count< K)
            {
                while(it.hasNext() && count <= K)
                {
                    it.next();
                    count++;
                }
                
                // If this is true, it means we have reached
                // end of list and count is less than k
                // So, we will move iterator from end to first
                // and increment count
                if(count < K)
                {
                    it = list.iterator();
                    it.next();
                    count++;
                }
                
                // Remove the Kth element
                it.remove();
            }
        }
        
        // Return the first element which is the only
        // element left
        return list.getFirst();
    }
    
    public static void main (String[] args) {
        
        //int n = 7, k = 3;
        int n,k;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter n value :");
        n=sc.nextInt();

        System.out.println("Enter k value :");
        k=sc.nextInt();
        
        System.out.println("Survivor is :" + "\n" + josephus(n, k));
        
    }
}