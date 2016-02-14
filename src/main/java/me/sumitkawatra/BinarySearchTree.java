/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra;

/**
 * @author Sumit Kawatra
 *
 */
public class BinarySearchTree<T extends Comparable<T>> {

	/**
	 * 
	 */
	public BinarySearchTree() {
		super();
	}

	/**
	 * inOrder traversal of Binary Tree recursive approach
	 * 
	 * @param root
	 */
	public void inOrderTraversal(TreeNode<T> root) {
		if (null == root) {
			return;
		} else {
			inOrderTraversal(root.getLeftChild());
			System.out.println(root);
			inOrderTraversal(root.getRightChild());
		}
	}

	/**
	 * preOrder traversal of Binary Tree recursive approach
	 * 
	 * @param root
	 */
	public void preOrderTraversal(TreeNode<T> root) {
		if (null == root) {
			return;
		} else {
			System.out.println(root);
			preOrderTraversal(root.getLeftChild());
			preOrderTraversal(root.getRightChild());
		}
	}

	/**
	 * postOrder traversal of Binary Tree recursive approach
	 * 
	 * @param root
	 */
	public void postOrderTraversal(TreeNode<T> root) {
		if (null == root) {
			return;
		} else {
			postOrderTraversal(root.getLeftChild());
			postOrderTraversal(root.getRightChild());
			System.out.println(root);
		}
	}
}