package stackBasedApplication;

public class Stack_Arr {

/* Java program to implement basic stack 
operations */
    static final int MAX = 10000; 
    int size; 
    int totalSize;
    int a[] ;
    
    /** defauly contructor 
     */
     public Stack_Arr() 
    { 
        size =0;
        a = new int[100];
    } 
     
     /**
      * constructor specifically for challege 3 
      * @param int[] arr
      * @return
      */

     public Stack_Arr(int[] arr) {
    	 	size= arr.length;
    	 	totalSize=size;
    	 	a = arr; 
     } 
     
    
    boolean isEmpty() 
    { 
        return (size < 1); 
    } 

    boolean push(int x) 
    { 
        if (size >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
            return false; 
        } 
        else { 
            a[size++] = x; 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (size < 1) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[--size]; 
            return x; 
        } 
    } 
  
    int peek() 
    { 
        if (size < 1) { 
            System.out.println("Stack Underflow"); 
            return 0; 
        } 
        else { 
            int x = a[size-1]; 
            return x; 
        } 
    } 
    
    public String toString() {
    String result= " "; 
    for(int i = totalSize-1; i>=0;i-- ) {
    	result = result + a[i] + " ";
    }
     return result;	
    }
}
