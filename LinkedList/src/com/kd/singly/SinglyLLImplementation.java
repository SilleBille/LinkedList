package com.kd.singly;

public class SinglyLLImplementation {

	private int lengthOfLL(SinglyLLNode head) {
		SinglyLLNode currentNode = head;
		int count = 0;
		while (currentNode != null) {
			count++;
			currentNode = currentNode.getNext();
		}
		return count;
	}

	public void printLL(SinglyLLNode head) {
		if (head == null) {
			System.out.println("No elements in the list!");
		}
		SinglyLLNode currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " -> ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	public SinglyLLNode insertData(SinglyLLNode head,
			SinglyLLNode nodeToInsert, int position) {

		// If this is the first node
		if (head == null) {
			return nodeToInsert;
		}

		// Get the size of the Linked List
		int size = lengthOfLL(head);

		// If position is invalid
		if (position < 1 || position > size + 1) {
			System.out.println("Invalid size! Enter between 1 and "
					+ (size + 1));
			return head;
		}

		// Insert at head
		if (position == 1) {
			nodeToInsert.setNext(head);
			return nodeToInsert;
		} else {
			// Inserting either in end or middle
			SinglyLLNode currentNode = head;
			int count = 1;
			while (count < position - 1) {
				count++;
				currentNode = currentNode.getNext();
			}
			nodeToInsert.setNext(currentNode.getNext());
			currentNode.setNext(nodeToInsert);
			return head;
		}
	}

	public SinglyLLNode deleteData(SinglyLLNode head, int position) {

		int size = lengthOfLL(head);
		if (position < 1 || position > size) {
			System.out.println("Invalid input. Enter between 1 and " + size);
			return head;
		}
		if (position == 1) { // Delete first node
			SinglyLLNode currentNode = head.getNext();
			head = null;
			return currentNode;
		} else { // Delete last node or middle node
			SinglyLLNode prevNode = head;

			int count = 1;
			while (count < position-1) {
				prevNode = prevNode.getNext();
				count++;
			}
			// Change the prev pointer to the next pointer skipping one node
			SinglyLLNode currentNode = prevNode.getNext();
			prevNode.setNext(currentNode.getNext());
			currentNode = null;
		}
		return head;

	}

	public void deleteList(SinglyLLNode head) {
		SinglyLLNode auxilaryNode, iterator = head;
		while (iterator != null) {
			auxilaryNode = iterator.getNext();
			iterator = null;
			iterator = auxilaryNode;
		}
		System.out.println("All elements deleted! ");
		System.gc();
	}

}
