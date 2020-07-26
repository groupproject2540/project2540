package gp;

public class Stack {
	  /* Java program to implement basic stack 
    operations */
 int cap; 
 int last;
 int a[] ;
 char name;

 /** defauly contructor 
 */
 public Stack(int cap,char n) 
 { 
     this.cap =cap;
     last = -1;
     a = new int[cap];
     name= n;
 } 

 public Stack(){
     
 }

 /**
  * constructor specifically for challege 3 
  * @param int[] arr
  * @return
  */

 public Stack(int[] arr,int last){
     cap= arr.length;
     this.last = last; 
     a = arr; 
 } 

 public int size(){
     return last+1;
 }

 boolean isEmpty() 
 { 
     return (last < 0); 
 } 

 boolean push(int x) 
 { 
     if (last >= (cap)) { 
         System.out.println("Stack Overflow"); 
         return false; 
     } 

     else if(last!=-1&&x>a[last]) {
    	 System.out.println("Int "+x+" is bigger then then number on top of Stack");   //follow rule
    	 return false;
     }
     else { 
         a[++last] = x; 
         return true; 
     } 
 } 

 int pop() 
 { 
     int x = a[last--]; 
     return x; 
 } 

 int peek() 
 { 
     return a[last]; 
 } 

 public String toString() {
     String result= "top| "; 
     for(int i =last; i>=0 ;i-- ) {
         result = result + a[i] + " ";
     }
     return result+ " |bottom";	
 }

}
