/*
 * Program by Michael Sago
 * COMP_SCI 3130
 * 
 */
import java.util.Scanner;

public class TestBST {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		BST test = new BST();
		
		boolean menu = true;
		
		test.TREE_INSERT(30);
		test.TREE_INSERT(10);
		test.TREE_INSERT(45);
		test.TREE_INSERT(38);
		test.TREE_INSERT(20);
		test.TREE_INSERT(50);
		test.TREE_INSERT(25);
		test.TREE_INSERT(33);
		test.TREE_INSERT(8);
		test.TREE_INSERT(12);

		System.out.println("Used INSERT");
		System.out.println("\nINorder");
		test.inorder();
		System.out.println("\nPOSTorder");
		test.postorder();
		System.out.println("\nPREorder");
		test.preorder();

		System.out.println("\n");
		
		while(menu) {
			
			System.out.println("\nBinary Search Tree Program");
			System.out.println("Please choose an operation to perform");
			System.out.println("1. INSERT ");
			System.out.println("2. SEARCH ");
			System.out.println("3. DELETE ");
			
			int choice = input.nextInt();
			
			switch(choice) {
				
			case 1:
				System.out.println("Enter number to INSERT into tree.");
				test.TREE_INSERT(input.nextInt());
				break;
			case 2:
				System.out.println("Enter number to SEARCH for in the tree.");
				if(test.TREE_SEARCH(input.nextInt()) == false){
					System.out.println("******Number was NOT found in the tree.******\n");
				}
				else
					System.out.println("******Number was found in the tree.******\n");
				break;
			case 3:
				System.out.println("Enter number to DELETE from the tree.");
				test.TREE_DELETE(input.nextInt());
				break;
			default:
				System.out.println("Wrong choice\n");
				break;
			}//end switch statement

			System.out.println("\nINorder");
			test.inorder();
			System.out.println("\nPOSTorder");
			test.postorder();
			System.out.println("\nPREorder");
			test.preorder();
			System.out.println("\n");

		}//end while for menu
		
	}

}
