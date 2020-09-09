/*
 * By: Michael Sago
 * 
 */
public class BST {

	private Node root;
	
	//Default constructor
	public BST() {
		
		root = null;
	}
	
	//Function to insert vals
	public void TREE_INSERT(int vals) {
		
		root = TREE_INSERT(root, vals);
	}
	
	//Function to insert data recursively
	private Node TREE_INSERT(Node node, int vals) {
		
		if(node == null)
			
			node = new Node(vals);
		else {
			
			if(vals <= node.getVals())
				node.left = TREE_INSERT(node.left, vals);
			else
				node.right = TREE_INSERT(node.right, vals);
		}
		return node;
	}//end insert()
	
	//Function to SEARCH for an element
	public boolean TREE_SEARCH(int val) {
		
		return TREE_SEARCH(root, val);
	}//end 
	
	//Function to SEARCH for an element
	private boolean TREE_SEARCH(Node r, int val) {
		
		boolean found = false;
		
		while((r != null) && !found) {
			
			int rval = r.getVals();
			
			if(val < rval) {
				r = r.getLeft();
			}
			else if(val > rval)
				r = r.getRight();
			else {
				
				found = true;
				break;
			}
			
			found = TREE_SEARCH(r, val);
		}//end while
		
		return found;
	}//end TREE_SEARCH()
	
	//Function to DELETE element
	public void TREE_DELETE(int key) {
		
		if(TREE_SEARCH(key) == false)
			System.out.println(key + " is not in the tree!!");
		else {
			
			root = TREE_DELETE(root, key);
			System.out.println(key + " was deleted from the tree!!");
		}
	}//end 
	
	//Function to DELETE element
	private Node TREE_DELETE(Node root, int key) {
		
		Node p, p2, n;
		
		if(root.getVals() == key){
			Node leftNode, rightNode;
			leftNode = root.getLeft();
			rightNode = root.getRight();
		
			if(leftNode == null && rightNode == null) {
				return null;
			}
			
			else if(leftNode == null) {
				
				p = rightNode;
				return p;
			}
			
			else if(rightNode == null) {
				
				p = leftNode;
				return p;
			}
			
			else {
				
				p2 = rightNode;
				p = rightNode;
				
				while(p.getLeft() != null) {
					
					p = p.getLeft();
				}//end while
				
				p.setLeft(leftNode);
				return p2;
			}
		}
		
		if(key < root.getVals()) {
			
			n = TREE_DELETE(root.getLeft(), key);
			root.setLeft(n);
		}
		
		else {
			
			n = TREE_DELETE(root.getRight(), key);
			root.setRight(n);
		}
		return root;
	}//end delete()
	
	//Function for inorder traversal
	public void inorder() {
		
		inorder(root);
	}//end
	
	private void inorder(Node r) {
		
		if(r != null) {
			
			inorder(r.getLeft());
			System.out.print(r.getVals() + " ");
			inorder(r.getRight());
		}
	}// end inorder()
	
	//Function for preorder traversal
	public void preorder() {
		
		preorder(root);
	}//end
	
	private void preorder(Node r) {
		
		if(r != null) {
			
			System.out.print(r.getVals() + " ");
			preorder(r.getLeft());
			preorder(r.getRight());
		}
	}// end preorder()
	
	//Function for postorder traversal
	public void postorder() {
		
		postorder(root);
	}//end
	
	//Function for postorder traversal
	private void postorder(Node r) {
		
		if(r != null) {
		
			postorder(r.getLeft());
			postorder(r.getRight());
			System.out.print(r.getVals() + " ");
		}
	}// end postorder()
	
}//end BST class
