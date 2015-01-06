package com.kd.test;

import java.util.Scanner;

import com.kd.doubly.DoublyLLImplementation;
import com.kd.doubly.DoublyLLNode;

public class DoublyLLTest {

	public static void main(String[] args) {
		DoublyLLNode head = null;
		DoublyLLImplementation doublyLLImplementation = new DoublyLLImplementation();
		Scanner sc = new Scanner(System.in);
		int choice;
		int data, position;

		while (true) {
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			if (choice == 0) {
				sc.close();
				break;
			}

			switch (choice) {
			case 1: // Insert an element
				System.out.print("Enter the data: ");
				data = sc.nextInt();
				System.out.print("Enter the position: ");
				position = sc.nextInt();

				head = doublyLLImplementation.insertData(head,
						new DoublyLLNode(data), position);
				break;

			case 2: // Delete an element
				System.out.print("Enter the position: ");
				position = sc.nextInt();

				head = doublyLLImplementation.deleteData(head, position);
				break;

			case 3: // Delete the entire list
				doublyLLImplementation.deleteList(head);
				break;

			case 9: // Display the contents
				doublyLLImplementation.printLL(head);
			}
		}
	}
}
