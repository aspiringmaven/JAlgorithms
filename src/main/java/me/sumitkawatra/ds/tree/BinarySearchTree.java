/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra.ds.tree;

import java.util.LinkedList;

import me.sumitkawatra.ds.node.TreeNode;

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
	
	/**
	 * public method to insert node in Binary Search Tree
	 * @param root
	 * @param node
	 * @return
	 */
	public TreeNode<T> insert(TreeNode<T> root, TreeNode<T> node) {
		if (null == node || ( null != node && null == node.getInfo())) {
			return root;
		} else if (root == null) { /*First node case*/
			return node;
		} else {
			insertNode(root, node);
			return root;
		}
	}
	/**
	 * BST Insert
	 * @param root
	 * @param info
	 * @return
	 */
	private void insertNode(TreeNode<T>root,TreeNode<T> node) {
		if (root.getInfo().compareTo(node.getInfo()) > 0) { /*root is greater*/
			if(null != root.getLeftChild() ) {
				insertNode(root.getLeftChild(), node);
			} else {
				root.setLeftChild(node);				
			}
		} else if (root.getInfo().compareTo(node.getInfo()) < 0){
			if(null != root.getRightChild()) {
				insertNode(root.getRightChild(), node);
			} else {
				root.setRightChild(node);
			}
		} else {
			throw new RuntimeException("Node already Exist. "+node.getInfo());
		}
	}
	
	/**
	 * levelOrder traversal of Binary Tree non-recursive approach
	 * @param root
	 */
	public void levelOrderTraversal(TreeNode<T> root) {
		if(null == root) {
			return;
		} else {
			LinkedList<TreeNode<T>> list = new LinkedList<TreeNode<T>>();
			
			list.add(root);
			
			while(!list.isEmpty()) {
				TreeNode<T> tempNode = list.removeFirst();
				System.out.println(tempNode);
				
				if(null != tempNode.getLeftChild()) {
					list.addLast(tempNode.getLeftChild());
				}
				 if(null != tempNode.getRightChild()) {
					 list.addLast(tempNode.getRightChild());
				 }
				 tempNode = null; 
			}
		}
	}
	
	/**
	 * To search Node from BinarySearchTree  
	 * @param root
	 * @param info
	 * @return
	 */
	public TreeNode<T> searchNode(TreeNode<T> root, T info) {
		if(null == root || null == info) {
			return new TreeNode<T>(null);
		} else {
			if(0 == root.getInfo().compareTo(info)) {
				return root;
			} else if(root.getInfo().compareTo(info) > 0) {
				return searchNode(root.getLeftChild(), info);
			} else {
				return searchNode(root.getRightChild(), info);
			}
		}		
	}
	
	/**
	 * method to delete node from binary search tree 
	 * @param root
	 * @param info
	 * @return
	 */
	public TreeNode<T> delete(TreeNode<T> root, T info) {
		if(null == root || info == null) {
			return root;
		} else {
			return deleteNode(root, info);
		}		
	}
	
	private TreeNode<T> deleteNode(TreeNode<T> root, T info) {
		if(0 == root.getInfo().compareTo(info)) {
			
		} else if( 0 > root.getInfo().compareTo(info) ) {
			
		} else {
			
		}
		return root;
	}
}