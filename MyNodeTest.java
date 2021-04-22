package javapractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class MyNodeTest {

	@Test
	void Given3NumsLinkedShouldPassedLinkedListTest() {
		
		MyNode<Integer> myFirstNode = new MyNode<>(56);
		MyNode<Integer> mySecondtNode = new MyNode<>(30);
		MyNode<Integer> myThiredNode = new MyNode<>(70);
		myFirstNode.setNext(mySecondtNode);
		mySecondtNode.setNext(myThiredNode);
		boolean result = myFirstNode.getNext().equals(mySecondtNode)&&
				
						mySecondtNode.getNext().equals(myThiredNode);
		Assert.assertTrue(result);
															
	}

}
