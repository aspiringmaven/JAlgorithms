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
	 *  
	 * @param info
	 */
	public TreeNode(T info) {
		super();
		this.info = info;
		this.setLeftChild(null);
		this.setRightChild(null);
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
	
	/**
	 * method to check if the node has left child or node
	 * @return true if leftChild is not null else return false 
	 */
	public boolean hasLeftChild(){
		return  (null != this.getLeftChild());
	}
	
	/**
	 * method to check if the node has left child or node
	 * @return true if rightChild is not null else return false 
	 */
	public boolean hasRightChild() {
		return (null != this.getRightChild());
	}
	
}
