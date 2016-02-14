/**
 * Feel free to use, reuse and abuse this code
 */
package me.sumitkawatra;

/**
 * @author Sumit Kawatra
 * 
 */
public class TreeNode<T extends Comparable<T>> {
	
	private TreeNode<T> leftChild;
	private T info;
	private TreeNode<T> rightChild;

	/**
	 * default constructor
	 */
	public TreeNode() {
		super();
	}

	/**
	 * @param leftChild
	 * @param info
	 * @param rightChild
	 */
	public TreeNode(TreeNode<T> leftChild, T info, TreeNode<T> rightChild) {
		super();
		this.leftChild = leftChild;
		this.info = info;
		this.rightChild = rightChild;
	}

	/**
	 * @return the leftChild
	 */
	public TreeNode<T> getLeftChild() {
		return leftChild;
	}

	/**
	 * @param leftChild the leftChild to set
	 */
	public void setLeftChild(TreeNode<T> leftChild) {
		this.leftChild = leftChild;
	}

	/**
	 * @return the info
	 */
	public T getInfo() {
		return info;
	}

	/**
	 * @param info the info to set
	 */
	public void setInfo(T info) {
		this.info = info;
	}

	/**
	 * @return the rightChild
	 */
	public TreeNode<T> getRightChild() {
		return rightChild;
	}

	/**
	 * @param rightChild the rightChild to set
	 */
	public void setRightChild(TreeNode<T> rightChild) {
		this.rightChild = rightChild;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TreeNode [leftChild=" + ((null == leftChild)?null:leftChild.getInfo()) + ", info=" + info + ", rightChild=" + ((null == rightChild)?null:rightChild.getInfo()) + "]";
	}
	
	
}
