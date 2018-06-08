package com.java2novice;

public class BinarySearchTree_1 {
	
	private BstNode root ;
	public boolean isEmpty(){
		return (this.root == null);
	}
	public void insert(Integer data){
		System.out.println("[ input "+ data +"]");
		if(root == null){
			this.root =  new BstNode(data);
			System.out.println("-> inserted data "+data);
			return;
		}
		insertNode(this.root, data);
		System.out.println("-> inserted : "+ data);
		System.out.println();
	}
	private BstNode insertNode(BstNode root, Integer data){
		BstNode tmpNode = null;
		System.out.print("-> "+ root.getData());
		if(root.getData() >= data ){
			System.out.println("[L]");
			if(root.getLeft() ==  null ){
				root.setLeft(new BstNode(data));
				return root.getLeft();
			}else{
				tmpNode = root.getLeft();
			}
		}else{
			System.out.print("[R]");
			if(root.getright() == null){
				root.setRight(new BstNode(data));
				return root.getright();
			}else tmpNode = root.getright();
		}
		return insertNode(tmpNode, data);
	}
	public static void main(String uei[]){
		BinarySearchTree_1 bs1 = new  BinarySearchTree_1();
		bs1.insert(10);
		bs1.insert(20);
		bs1.insert(21);
		bs1.insert(8);
		bs1.insert(6);
		bs1.insert(16);
		bs1.insert(23);
	}
}

class BstNode{
	private BstNode left  ;
	private BstNode right ;
	private  Integer data ;
	
	public BstNode(Integer data){
		this.data = data;
	}
	public void setLeft(BstNode left){
		this.left = left;
	}
	public BstNode getLeft(){
		return left;
	}
	public void setRight(BstNode right){
		this.right =right;
	}
	public BstNode getright(){
		return right;
	}
	public Integer getData(){
		return data;
	}
}
