package com.kd.doubly;


public class DoublyLLImplementation {

	private int lengthOfDLL(DoublyLLNode head) {
		DoublyLLNode currentNode = head;
		int length = 0;
		while (currentNode != null) {
			currentNode = currentNode.getNext();
			length++;
		}
		return length;
	}

	public DoublyLLNode insertData(DoublyLLNode head,
			DoublyLLNode nodeToInsert, int position) {

		if (head == null) {
			// This is the first element in the list
			return nodeToInsert;
		}
		int size = lengthOfDLL(head);
		if (position < 1 || position > size + 1) {
			System.out.println("Invalid input! Enter between 1 and "
					+ (size + 1));
			return head;
		}

		if (position == 1) { // Inserting in the 1st position
			nodeToInsert.setNext(head);
			head.setPrev(nodeToInsert);
			return nodeToInsert;
		} else { // Inserting at last or in middle
			DoublyLLNode prevNode = head;
			int count = 1;
			while (count < position - 1) {
				prevNode = prevNode.getNext();
				count++;
			}
			DoublyLLNode currentNode = prevNode.getNext();
			nodeToInsert.setPrev(prevNode);
			nodeToInsert.setNext(currentNode);
			prevNode.setNext(nodeToInsert);
			if (currentNode != null) {
				currentNode.setPrev(nodeToInsert);
			}
			return head;

		}
	}

	public DoublyLLNode deleteData(DoublyLLNode head, int position) {
		if (head == null) {
			System.out.println("No data in the list!");
			return null;
		}
		int size = lengthOfDLL(head);
		if (position < 1 || position > size) {
			System.out.println("Invalid input! Enter between 1 and " + size);
			return head;
		}
		if (position == 1) { // Deleting the first element in the list
			DoublyLLNode currentNode = head.getNext();
			if (currentNode != null)
				currentNode.setPrev(null);
			head = null;
			return currentNode;
		} else { // Delete middle or last element
			DoublyLLNode prevNode = head;
			int count = 1;
			while (count < position - 1) {
				prevNode = prevNode.getNext();
				count++;
			}
			DoublyLLNode currentNode = prevNode.getNext();
			prevNode.setNext(currentNode.getNext());
			if (currentNode.getNext() != null) {
				currentNode.getNext().setPrev(prevNode);
			}
			currentNode = null;
			return head;
		}
	}

	public void deleteList(DoublyLLNode head) {
		DoublyLLNode iterator=head;
		DoublyLLNode auxilaryNode;
		while(iterator != null) {
			auxilaryNode = iterator.getNext();
			iterator = null;
			iterator = auxilaryNode;
		}
		System.out.println("All Elements deleted!");
	}
	public void printLL(DoublyLLNode head) {
		if (head == null) {
			System.out.println("No elements in the list!");
		}
		DoublyLLNode currentNode = head;
		while (currentNode != null) {
			System.out.print(currentNode.getData() + " <-> ");
			currentNode = currentNode.getNext();
		}
		System.out.println();
	}

	
}
