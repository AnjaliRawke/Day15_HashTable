package com.bridgelabz;

public class HashTableMain {
	public static void main(String[] args) {
		String sentence = "To be or not to be";
		String[] words = sentence.split(" ");
		HashTable table = new HashTable(words.length);
		for (String word : words) {
			table.put(word);
		}
		for (String word : words) {
			System.out.println(word + " : " + table.get(word));
		}
	}

}