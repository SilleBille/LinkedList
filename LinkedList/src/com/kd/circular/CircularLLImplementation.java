package com.kd.circular;

public class CircularLLImplementation {

	private int lengthOfLL(CircularLLNode head) {
		CircularLLNode currentNode = head;
		int count = 0;

		// Have to count event the last element i.e. last currentNode.getNext()
		while (currentNode.getNext() != null) {
			count++;
			currentNode = currentNode.getNext();
			if (currentNode == head)
				break;
		}
		return count;
	}

	public CircularLLNode insertData(CircularLLNode head,
			CircularLLNode nodeToInsert, int position) {

		// If this is the first Node
		if (head == null) {
			nodeToInsert.setNext(nodeToInsert);
			return nodeToInsert;
		}
		int size = lengthOfLL(head);

		// Check if position is invalid
		if (position < 1 || position > size + 1) {
			System.out.println("Invalid position. Enter between 1 and "
					+ (size + 1));
			return head;
		}

		CircularLLNode currentNode = head;

		// If inserting at head
		if (position == 1) {
			while (currentNode.getNext() != head) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(nodeToInsert);
			nodeToInsert.setNext(head);
			return nodeToInsert;
		} else { // If inserting in middle or at last
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

	public CircularLLNode deleteData(CircularLLNode head, int position) {
		if (head == null) {
			System.out.println("No Elements");
			return head;
		}
		int size = lengthOfLL(head);

		// Check for invalid position
		if (position < 1 || position > size) {
			System.out.println("Invalid position. Enter between 1 and " + size);
			return head;
		}
		
		// If only one element in the list
		if(size == 1) {
			head = null;
			return head;
		}

		// Deleting the first node
		if (position == 1) {
			CircularLLNode prevNode = head;
			while (prevNode.getNext() != head) {
				prevNode = prevNode.getNext();
			}
			// Set the last element's next pointer to head's next
			prevNode.setNext(head.getNext());

			CircularLLNode newHeadNode = head.getNext();

			// Now move the current Pointer to the new head pointer
			prevNode = newHeadNode;

			// Delete the head node
			head = null;

			// Return the new head node
			return newHeadNode;
		} else {// Deleting the middle or last node
			CircularLLNode prevNode = head;
			int count = 1;

			while (count < position - 1) {
				count++;
				prevNode = prevNode.getNext();
			}
			CircularLLNode currentNode = prevNode.getNext();
			CircularLLNode laterNode = currentNode.getNext();
			prevNode.setNext(laterNode);
			currentNode = null;
			return head;
		}
	}

	public void printLL(CircularLLNode head) {
		CircularLLNode currentNode = head;
		
		if(head == null) {
			System.out.println("No elements in the list");
		}
		// We need to print all contents including the data in
		// currentNode.getNext()
		while (currentNode != null) {
			System.out.print(currentNode.getData() + "->");
			currentNode = currentNode.getNext();

			// This ensure when currentNode reaches the start node, terminate
			if (currentNode == head)
				break;
		}
		if(currentNode != null)
			System.out.println("(" + currentNode.getData() + ")");
	}
}
