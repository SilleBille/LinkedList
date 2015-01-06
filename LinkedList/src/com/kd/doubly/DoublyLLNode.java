package com.kd.doubly;

public class DoublyLLNode {
	private int data;
	private DoublyLLNode prev;
	private DoublyLLNode next;

	public DoublyLLNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public DoublyLLNode getPrev() {
		return prev;
	}

	public void setPrev(DoublyLLNode prev) {
		this.prev = prev;
	}

	public DoublyLLNode getNext() {
		return next;
	}

	public void setNext(DoublyLLNode next) {
		this.next = next;
	}
}
