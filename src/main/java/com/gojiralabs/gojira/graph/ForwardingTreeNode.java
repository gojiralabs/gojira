package com.gojiralabs.gojira.graph;

import static java.util.Objects.requireNonNull;

import java.util.Collection;
import java.util.List;

import javax.annotation.Nonnull;

public class ForwardingTreeNode<T> implements TreeNode<T> {

	private final TreeNode<T> delegate;

	public ForwardingTreeNode(@Nonnull TreeNode<T> treeNode) {
		this.delegate = requireNonNull(treeNode);
	}

	@Override
	public void setParent(TreeNode<T> parent) {
		delegate.setParent(parent);
	}

	@Override
	@Nonnull
	public TreeNode<T> addChild(@Nonnull TreeNode<T> child) {
		return delegate.addChild(child);
	}

	@Override
	@Nonnull
	public TreeNode<T> addChild(T content) {
		return delegate.addChild(content);
	}

	@Override
	public boolean removeChild(@Nonnull TreeNode<T> child) {
		return delegate.removeChild(child);
	}

	@Override
	public TreeNode<T> removeChild(int childIndex) {
		return delegate.removeChild(childIndex);
	}

	@Override
	public void addChildrenNodes(@Nonnull Collection<? extends TreeNode<T>> children) {
		delegate.addChildrenNodes(children);
	}

	@Override
	public void addChildrenContent(@Nonnull Collection<T> children) {
		delegate.addChildrenContent(children);
	}

	@Override
	public T getContent() {
		return delegate.getContent();
	}

	@Override
	public TreeNode<T> getParent() {
		return delegate.getParent();
	}

	@Override
	@Nonnull
	public List<TreeNode<T>> getChildren() {
		return delegate.getChildren();
	}

	@Override
	public int hashCode() {
		return delegate.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return delegate.equals(obj);
	}

	@Override
	public String toString() {
		return delegate.toString();
	}
}
