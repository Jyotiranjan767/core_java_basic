package com.core.data.structure;

public class ListNode {
	
		public int data;
		private ListNode next;
		
		public ListNode(int data){
			this.data = data;
		}
		
		public void setData(int data){
			this.data = data;
		}
		public int getData(){
			return this.data;
		}
		public void setNext(ListNode next){
			this.next = next;
		}
		public ListNode getNext(){
			return this.next;
		}
	
		public int listLength(ListNode headNode){
			int length = 0;
			ListNode currentNode = headNode;
			while(currentNode != null){
				length++;
				currentNode = currentNode.getNext();
			}
			return length;
		}
		//insert a node at the beginning of the  list
		
		
		public static void main(String riut[]){
			ListNode ln = new ListNode(23);
			ListNode ln1 = new ListNode(232);
//			System.out.println(ln.listLength(ln));
			ln.setNext(ln);
			System.out.println(ln.getNext());
			System.out.println(ln.listLength(ln1));
			ln.setNext(ln1);
			System.out.println(ln.getNext());
			System.out.println(ln.listLength(ln1));
		}
}
