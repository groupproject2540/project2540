package pg;

public class stack {
	char stackname; // tower a,b,c
	int number; //if number =-1,its the basic of tower
	stack next;


public stack(){
	number=-1;
	next=null;
}

public void removetop(stack t) {
	if(t.number==-1) {
	 System.out.println("tower "+t.stackname+" is empty");	 
	}
	
	else {
	stack runner = new stack ();
	runner = t;
	int size=1;
	while(runner.next!=null) {
		runner=runner.next;
		size++;
		}
	if(size==1) {
		t.number=-1;
		t.next=null;
		}
	else {
		t=t.next;
		}
	}
}

public void move(stack a,stack b) {
	if( a.number==-1) {
		System.out.println("Stcak "+a.stackname+" is empty ");
		
	}
	else if ((b.number < a.number) && a.number!=-1) {
		System.out.println("the number on top of tower "+b.stackname+" = "+b.number+" is smaller then the number on top of tower "+a.stackname+" = "+a.number);            
	}
	else {
		stack newone = new stack();
		newone = a;
		newone.next=b;
		b=newone;
		removetop (a);
	}
	
}


public void display(stack a) {	
	
	if(a.number==-1){
		System.out.println("tower "+a.stackname+" is empty");
	}	
	else {
	stack runner = new stack ();
	runner = a.next;
	System.out.print("<= "+a.stackname+" ");
	while(runner!=null) {
		System.out.print(runner.number+" ");
		runner=runner.next;
		}
	
	}
}
















}