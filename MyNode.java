package javapractice;

public class MyNode<K> {
	private K key;
	private MyNode next;
	
	
	public MyNode(K key) {
		this.key= key;
		this.next=null;
	}
	public MyNode getNext() {
		return next;
	}
	public MyNode setNext(MyNode next) {
		return this.next=next;
	}
	
	}

