package com.mkpits.collection.set.tree;

import java.util.ArrayList;

public class TreeNode 
{
	String data;
	ArrayList<TreeNode> student;
	
	// parameterized constructor
	public TreeNode(String data)
	{
		this.data = data;
		this.student = new ArrayList<TreeNode>();
		
	}
	
	public void addChildern(TreeNode node)
	{
		this.student.add(node);
	}
	
	public String print(int level) {
		String ret;
		ret = "  ".repeat(level) + data + "\n";
		for (TreeNode node : this.student) {
			ret += node.print(level + 1);
		}
		return ret;
	}

}
