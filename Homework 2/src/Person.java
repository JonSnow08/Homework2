/** 
 * @author Xavier Velez
 * SBU ID: 105703437
 * Date: 3/4/2019
 * CSE 214 Homework 2
 * 
 * */ 
public class Person {
	private String name; 
	private int ticketNo; 
	private Person nextPerson; 
	private Person prevPerson; 
	
	public Person(String name, int ticketNo, Person nextPerson, Person prevPerson){
		this.name = name; 
		this.ticketNo = ticketNo; 
		this.nextPerson = nextPerson; 
		this.prevPerson = prevPerson;
	}
	
	public void setNext(Person link) {
		this.nextPerson = link; 
	}
	public void setPrev(Person link) {
		this.prevPerson = link; 
	}
	public Person getPrev() {
		return this.prevPerson; 
	}
	public Person getNext() {
		return this.nextPerson; 
	}
	public String getName() {
		return this.name; 
	}
	public void setName(String name) {
		this.name = name; 
	}
	public int getData() {
		return this.ticketNo; 
	}
	public void setData(int ticketNum) {
		this.ticketNo = ticketNum; 
	}
}
