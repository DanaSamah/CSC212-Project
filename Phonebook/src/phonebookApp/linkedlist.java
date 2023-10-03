package phonebookApp;

public class  linkedlist<T> implements List<T>{

	public Node<T>head;  
	public Node<T>current;  
	
	public void add(T c) {
		Node NewC =new Node(c);
		if (head==null) 
		head=current=new Node(c);
		
		else {
			Node<T> temp;
			temp = head;
			while(temp.getNext()!=null) {
				Contact a = ((Contact)temp.data);
				Contact c1 = ((Contact)NewC.data);
			if((a.getName().equals(c1.getName())) || (a.getPhoneNumber().equals(c1.getPhoneNumber()))) 
				System.out.println("The Cnatact is already exist");
			
			else {
				current = head;
				temp = current.next;
				if(c1.data.getName().compareTo(((Contact)current.data).getName())<0)
				
				
			}
				
				
		  }//end while
		}
		
	}
	
	 
	

	
	public Contact search() {
		
		return null;
	}

	
	public void delete() {
		if (current == head) {  
            head = head.next;  
        }  
		
		
		
	}
	


}
