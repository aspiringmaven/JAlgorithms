/**
 * Driver class to execute BinarySearchTree class methods
 */
package me.sumitkawatra.test;

import me.sumitkawatra.ds.node.TreeNode;
import me.sumitkawatra.ds.tree.BinarySearchTree;

/**
 * @author Sumit Kawatra
 *
 */
public class BinarySearchDemo {

	/**
	 * default constructor
	 */
	public BinarySearchDemo() {
		super();
	}
	
	/**
	 *  Drive demos
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchDemo.demo1();/*smile please*/
	}
	
	/**
	 * Insert and traverse Demo
	 */
	public static void demo1() {
		BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
		TreeNode<Integer> rootNode = null;
		
		rootNode = tree.insert(rootNode, new TreeNode<Integer>(55));
		rootNode = tree.insert(rootNode, new TreeNode<Integer>(33));
		rootNode = tree.insert(rootNode, new TreeNode<Integer>(11));
		rootNode = tree.insert(rootNode, new TreeNode<Integer>(122));
		rootNode = tree.insert(rootNode, new TreeNode<Integer>(77));
		rootNode = tree.insert(rootNode, new TreeNode<Integer>(-122));
		
		
		tree.inOrderTraversal(rootNode);
		//tree.levelOrderTraversal(rootNode);
		System.out.println(tree.searchNode(rootNode, 55));
		System.out.println("Done demo1");
	}
}
