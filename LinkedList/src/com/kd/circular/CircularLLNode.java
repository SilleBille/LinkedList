package com.kd.circular;

public class CircularLLNode {
	private int data;
	private CircularLLNode next;

	public CircularLLNode(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public CircularLLNode getNext() {
		return next;
	}

	public void setNext(CircularLLNode next) {
		this.next = next;
	}
}
