package gp;

import java.util.Scanner;

public class Hanoi{
    // 3 stack decleared in constructor by disk size 
    Stack A; 
    Stack B; 
    Stack C; 
   
    // 2 varaible indicate which disk on which rod is bring moved. GUI team use this to display 
    char curRod; 
    int curValue;

    // contrductor 
    public Hanoi(int disk){
    	A=new Stack(disk,'A');
    	B=new Stack(disk,'B');
    	C=new Stack(disk,'C');
    }
    
    // default with disk 3 for demo purpose
    public Hanoi(){
    	A=new Stack(3,'A');
    	B=new Stack(3,'B');
    	C=new Stack(3,'C');
    }
  
    // fill stack A from 1~n with smaller num on top 
    public void initA(){
    	for(int i=0,j=A.cap;i<A.cap;i++,j--) {
    		A.a[i]=j;
    		A.last++;
    	}
    }
   
    // recursive mover fucniton see youtube video on how to implement 
    public int move(int number,Stack from, Stack pass, Stack to){
    	int step=0;
    	if (number == 1){
            System.out.println("Disk 1 from "+ from.name + " to " + to.name);
           if(to.push(from.peek())==true) {
            	from.pop();
                step++;
            }
           displayall();
            
           
        }else {
            move(number - 1, from, to, pass);
            System.out.println("Disk "+ number + " from " + from.name + " to " + to.name);    
           if(to.push(from.peek())==true) {
        	from.pop();
            step++;
        }
           displayall();
        
            move(number - 1, pass, from, to);
        }
    	return step;
    }
    	
/*  play part
    public void playpart(int number) {
    	Scanner sc = new Scanner (System.in);
    	int step=0;
    	while(1>0) {
    		displayall();
    		System.out.println("move disk form towe =");
    		char t=sc.next().charAt(0);
    		switch(t) {
    		
    		case 'A':
    			if(A.isEmpty()) {
    				System.out.println("Tower A is emoty");
    				break;
    			}
    			System.out.println("move the disk "+A.a[A.last] +" to tower =");
    			t=sc.next().charAt(0);
    			if(t=='C') {
    				if (C.push(A.peek())) {
    					A.pop();
    					step++;
    				}
    				
    			}
    			else if(t=='B') {
    				if (B.push(A.peek())) {
    					A.pop();
    					step++;
    				}
    			}
    			else {
    				System.out.println("error,Enter the right tower name");
    			}
    			break;
    		
    			
    		case 'B':
    			if(B.isEmpty()) {
    				System.out.println("Tower B is emoty");
    				break;
    			}
    			System.out.println("move the disk "+B.a[B.last] +" to tower =");
    			t=sc.next().charAt(0);
    			if(t=='C') {
    				if (C.push(B.peek())) {
    					B.pop();
    					step++;
    				}
    			}
    			else if(t=='A') {
    				if (A.push(B.peek())) {
    					B.pop();
    					step++;
    				}
    			}
    			else {
    				System.out.println("error,Enter the right tower name");
    			}
    			break;	
    			
    		
    		case 'C':
    			if(C.isEmpty()) {
    				System.out.println("Tower C is emoty");
    				break;
    			}
    			System.out.println("move the disk "+C.a[C.last] +" to tower =");
    			t=sc.next().charAt(0);
    			if(t=='A') {
    				if (A.push(C.peek())) {
    					C.pop();
    					step++;
    				}
    			}
    			else if(t=='B') {
    				if (B.push(C.peek())) {
    					C.pop();
    					step++;
    				}
    			}
    			else {
    				System.out.println("error,Enter the right tower name");
    			}
    			break;	
    			
    			
    		default:
    			System.out.println("Enter the right tower name");
    	
    		}
    		if(checkwin()) {
    			System.out.println("U Win,use "+step+" step");
    			break;
    		}
    	}
    	
    }
    
   */ 
    
    
    public Boolean checkwin(){  //check if win or not
    	if((B.last+1)==B.cap||(C.last+1)==C.cap) {
    		return true;
    	}
    	return false;
    }
    
    
    
    public void f5() {  //reset all stack
    	A=new Stack(A.cap,'A');
    	B=new Stack(B.cap,'B');
    	C=new Stack(C.cap,'C');
    	for(int i=0,j=A.cap;i<A.cap;i++,j--) {  //initA
    		A.a[i]=j;
    		A.last++;
    	}
    }
    
    
    public void displayall(){
    	display(A);
    	display(B);
    	display(C);
    }
    
    
    public void display(Stack A){
    	System.out.print(A.name+":");
    	for(int i=0;i<=A.last;i++) {
    		System.out.print(A.a[i]+" ");
    	}
    	System.out.println();
    	System.out.println();
    }

}
    	
    
    
    
    
    
   


