/*
 * By: Michael Sago
 * 
 */

public class Node {

	Node left, right;
	int vals;
	
	//Default constructor
	public Node() {
		
		left = null;
		right = null;
		vals = 0;
	}
	
	//Constructor
	public Node(int num) {
		
		left = null;
		right = null;
		vals = num;
	}
	
	//Setter and Getter for left node
	public void setLeft(Node num) {
		
		left = num;
	}
	
	public Node getLeft() {
		
		return left;
	}
	
	//Setter and Getter for right node
	public void setRight(Node num) {
		
		right = num;
	}
	
	public Node getRight() {
		
		return right;
	}
	
	//Setter and Getter for vals to node
	public void setVals(int n) {
		
		vals = n;
	}
	
	public int getVals() {
		
		return vals;
	}
}//end Node Class
