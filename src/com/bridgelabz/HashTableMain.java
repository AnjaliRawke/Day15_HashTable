package com.bridgelabz;

import java.util.LinkedList;

public class HashTableMain {
	public static void main(String[] args) {

		String paragraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] words = paragraph.split(" ");
		HashTable table = new HashTable(words.length);
		for (String word : words) {
			table.put(word);
		}
		for (
				LinkedList<MyMapNode> bucket : table.getBuckets()) {
			if (bucket != null) {
				for (MyMapNode node : bucket) {
					System.out.println(node.key + " : " + node.value);
				}
			}
		}
	}
}