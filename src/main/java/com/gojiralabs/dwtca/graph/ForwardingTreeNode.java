package com.gojiralabs.dwtca.graph;

import static com.gojiralabs.dwtca.common.Checker.notNull;

import java.util.Collection;
import java.util.List;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ForwardingTreeNode<T> implements TreeNode<T> {

	private final TreeNode<T> delegate;

	public ForwardingTreeNode(@Nonnull TreeNode<T> treeNode) {
		this.delegate = notNull(treeNode);
	}

	@Override
	public void setParent(@Nullable TreeNode<T> parent) {
		delegate.setParent(parent);
	}

	@Override
	public TreeNode<T> addChild(@Nonnull TreeNode<T> child) {
		return delegate.addChild(child);
	}

	@Override
	public TreeNode<T> addChild(@Nullable T content) {
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
}