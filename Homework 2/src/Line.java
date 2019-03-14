
public class Line {
private Person head; 
private Person tail; 
private Person cursor; 
	
	public Line() {
		head = null; 
		tail = null; 
		cursor = null; 
	}
	
	public Line(Person a, Person b, Person c) {
		head = a; 
		tail = b; 
		cursor = c; 
	}
	
	public void addNewHead(String name, int ticketNo) {
		Person newPerson = new Person(name, ticketNo, this.head, null);
		head.setPrev(newPerson);
		this.head = newPerson; 
		this.cursor = head; 
		 
	}
	
	public void addNewTail(Person newPerson) {
		
	}
	public void addNewCursor(Person newPerson) {
		this.cursor = newPerson; 
	}
	
}
