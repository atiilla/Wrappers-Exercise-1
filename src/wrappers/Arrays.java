package wrappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {
		
		Collection<Integer> collection = new ArrayList<>();
		Scanner keyboard = new Scanner(System.in);
		String input = keyboard.next();
		int i = Integer.parseInt(input);
		
		collection.add(i);
		System.out.println(i);

	}

}
