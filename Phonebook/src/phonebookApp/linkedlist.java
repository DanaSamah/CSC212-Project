package phonebookApp;

public class  linkedlist<T> implements List<T>{
//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
	public Node<T>head;  
	public Node<T>current; 
	public linkedlist() {  
	    head=current=null;  
	      
	}  
	  
	public boolean empty() {  
	    return head==null;//1  
	    //bigO(1)  
	}  
	  
	public boolean last() {  
	    return current.next==null;  
	    //bigO(1)  
	} 
	
	public boolean full( ) {  
	    return false;  
	    //bigO(1)  
	      
	  
	}  
	public void findFirst() {  
	    current=head;  
	    //bigO(1)  
	}  
	public void findNext() {  
	    current=current.next;  
	    //bigO(1)  
	}  
	public T retrieve() {  
	    return current.data;
	    //bigO(1)  
	}  
	public void update(T val) {  
	current.data=val;  
	}
	

   public boolean exist(T E) {
	if(empty())
		return false;
	findFirst();
	Contact e =((Contact)E);
	while (!last()) {
		Contact a =((Contact)current.data);
	
		if(a.getName().equals(e.getName()) || a.getPhoneNumber().equals(e.getPhoneNumber())) {
			System.out.print("the contact is already exist " + a.toString() +"\n");
			return true;
		 }
		findNext();
	}
	//check the last elemnt
	Contact a =((Contact)current.data);
		if(a.getName().equals(e.getName()) || a.getPhoneNumber().equals(e.getPhoneNumber())) {
			System.out.print("the contact is already exist " + a.toString() +"\n");
		return true; }
		
			return false;	
	}
   
   public void add(T Con) {
	  Node<T> con = new Node(Con); 
	  Contact CastCon = ((Contact)con.data);
	  
	
	  if(!(exist(Con)))
		   if(head==null)
			   head = current = con;
		   else {
			   if(CastCon.compareTo(((Contact)head.data)) < 0) {
				   con.next=head;
				   head=con;
			   }
			   else {
				   Node<T> prev = null;
				   Node<T> temp = head;
				   while(temp!=null) {
					   if(CastCon.compareTo(((Contact)temp.data))< 0){
						   prev.next = con;
						   con.next = temp;
						   current = con;
						   break;
					   }
					   prev = temp;
                      temp =  temp.next;
                    
				   }//end while
			   }
		   }	     
   }//end add

	

	public Contact search() {
		System.out.println();
      return null;
	}

	
	public void delete() {
		if (current == head) {  
            head = head.next;  
        }  	
	}
	/*public void add(T c) {
	Node NewC =new Node(c);
	if (head==null) 
	head=current=new Node(c);
	
	else {
		Node<T> temp = head;
		while(temp.getNext()!=null) {
			Contact a = ((Contact)temp.data);
			Contact c1 = ((Contact)NewC.data);
		if((a.getName().equals(c1.getName())) || (a.getPhoneNumber().equals(c1.getPhoneNumber()))) 
			System.out.println("The Cnatact is already exist");
		
		else {
			current = head;
			temp = current.next;
			//if (c1.getName().compareTo(((Contact)current.data).getName()) < 0 )
				if (c1.compareTo(a)< 0){
					 NewC.next=temp;
					 current.next=NewC;
					 current=NewC;
				}
				else {
					temp = temp.next;
					current = current.next;
				}
			
		}
			
			
	  }//end while
	}
	
}*/
	


}
