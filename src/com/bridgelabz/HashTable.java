package com.bridgelabz;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class HashTable<K,V> {
	private LinkedList<MyMapNode>[] buckets;
	private int size;

	public LinkedList<MyMapNode>[] getBuckets() {
		return buckets;
	}

	public void setBuckets(LinkedList<MyMapNode>[] buckets) {
		this.buckets = buckets;
	}

	public HashTable(int size) {
		this.size = size;
		buckets = new LinkedList[size];
	}

	private int hash(String key) {
		return Math.abs(key.hashCode()) % size;
	}

	public void put(String key) {
		int bucketIndex = hash(key);
		if (buckets[bucketIndex] == null) {
			buckets[bucketIndex] = new LinkedList<MyMapNode>();
		}
		LinkedList<MyMapNode> bucket = buckets[bucketIndex];
		for (MyMapNode node : bucket) {
			if (node.key.equals(key)) {
				node.value++;
				return;
			}
		}
		bucket.add(new MyMapNode(key, 1));
	}

	public void remove(String key) {
		int bucketIndex = hash(key);
		if (buckets[bucketIndex] == null) {
			return;
		}
		LinkedList<MyMapNode> bucket = buckets[bucketIndex];
		for (MyMapNode node : bucket) {
			if (node.key.equals(key)) {
				bucket.remove(node);
				return;
			}
		}
	}
}