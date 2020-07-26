package gp;

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
    public void move(int number,Stack from, Stack pass, Stack to){
    	
    	if (number == 1){
            System.out.println("Disk 1 from "+ from.name + " to " + to.name);

           if(to.push(from.peek())==true) {
            	from.pop();
            }
            
           
        }else {
            move(number - 1, from, to, pass);
            System.out.println("Disk "+ number + " from " + from.name + " to " + to.name);    
           if(to.push(from.peek())==true) {
        	from.pop();
        }
        
            move(number - 1, pass, from, to);
        }
    }
    	



}
    	
    
    
    
    
    
   


