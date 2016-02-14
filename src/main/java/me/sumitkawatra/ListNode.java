/**
 * Feel free to use, reuse and abuse this code.
 */
package me.sumitkawatra;

/**
 * @author Sumit Kawatra
 *
 */
public class ListNode<T extends Comparable<T>> {
	
	private ListNode<T> prevNode;
	private T info;
	private ListNode<T> nextNode;
		
	/**
	 * default constructor
	 */
	public ListNode() {
		super();
	}

	/**
	 * @param info
	 */
	public ListNode(T info) {
		super();
		this.info = info;
	}

	/**
	 * @param prevNode
	 * @param info
	 * @param nextNode
	 */
	public ListNode(ListNode<T> prevNode, T info, ListNode<T> nextNode) {
		super();
		this.prevNode = prevNode;
		this.info = info;
		this.nextNode = nextNode;
	}

	/**
	 * @return the prevNode
	 */
	public ListNode<T> getPrevNode() {
		return prevNode;
	}

	/**
	 * @param prevNode the prevNode to set
	 */
	public void setPrevNode(ListNode<T> prevNode) {
		this.prevNode = prevNode;
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
	 * @return the nextNode
	 */
	public ListNode<T> getNextNode() {
		return nextNode;
	}

	/**
	 * @param nextNode the nextNode to set
	 */
	public void setNextNode(ListNode<T> nextNode) {
		this.nextNode = nextNode;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListNode [prevNode=" + ((null != prevNode)?prevNode.getInfo():null) + ", info=" + info + ", nextNode=" + ((null != nextNode)?nextNode.getInfo():null) + "]";
	}	
}