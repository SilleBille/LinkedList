package com.kd.test;

import java.util.Scanner;

import com.kd.circular.CircularLLImplementation;
import com.kd.circular.CircularLLNode;

public class CircularLLTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLLImplementation circularLLImplementation = new CircularLLImplementation();
		Scanner sc = new Scanner(System.in);
		CircularLLNode head = null;

		int choice;
		int data;
		int position;
		while (true) {
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			if (choice == 0) {
				break;
			}
			switch (choice) {
			case 1:
				System.out.print("Enter the data: ");
				data = sc.nextInt();
				System.out.print("Enter the position: ");
				position = sc.nextInt();

				head = circularLLImplementation.insertData(head,
						new CircularLLNode(data), position);
				break;
				
			case 2:
				System.out.print("Enter the Position: ");
				position = sc.nextInt();
				head = circularLLImplementation.deleteData(head, position);
				break;

			case 9:
				circularLLImplementation.printLL(head);
				break;
			}
		}
		sc.close();
	}

}
