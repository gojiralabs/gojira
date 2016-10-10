package com.gojiralabs.gojira.graph;

import static com.gojiralabs.gojira.collections.Iterators.reversedIterable;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DepthFirstIterator<T> implements Iterator<TreeNode<T>> {

	private final Deque<TreeNode<T>> queue = new ArrayDeque<>();

	public DepthFirstIterator(TreeNode<T> root) {
		queue.push(root);
	}

	@Override
	public boolean hasNext() {
		return !queue.isEmpty();
	}

	@Override
	public TreeNode<T> next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		TreeNode<T> node = queue.pop();
		reversedIterable(node.getChildren()).forEach(queue::push);
		return node;
	}
}
