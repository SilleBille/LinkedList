package com.kd.singly;

public class SinglyLLNode {

	private int data;
	private SinglyLLNode nextNode;

	public SinglyLLNode(int data) {
		this.data = data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public int getData() {
		return this.data;
	}

	public void setNext(SinglyLLNode nextNode) {
		this.nextNode = nextNode;
	}

	public SinglyLLNode getNext() {
		return this.nextNode;
	}
}
