package com.kd.test;

import java.util.Scanner;

import com.kd.singly.SinglyLLImplementation;
import com.kd.singly.SinglyLLNode;

public class SinglyLLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SinglyLLNode head = null;
		SinglyLLImplementation singlyLLImplementation = new SinglyLLImplementation();
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

				head = singlyLLImplementation.insertData(head,
						new SinglyLLNode(data), position);
				break;

			case 2: // Delete an element
				System.out.print("Enter the position: ");
				position = sc.nextInt();

				head = singlyLLImplementation.deleteData(head, position);
				break;

			case 3: // Delete the entire list
				singlyLLImplementation.deleteList(head);
				break;

			case 9: // Display the contents
				singlyLLImplementation.printLL(head);
			}

		}
	}
}
