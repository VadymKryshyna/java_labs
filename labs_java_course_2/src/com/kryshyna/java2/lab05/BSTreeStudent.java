package com.kryshyna.java2.lab05;

/**
 * @author Kryshyna Vadym
 */

public class BSTreeStudent {
	private NodeStudent root;

	public BSTreeStudent(){
		root = null;
	}

	public void insertUnique(Student st){
		NodeStudent temp = this.searchNode(st.getGroup());
		if(temp != null){
			temp.setElement(st);
		}else{
			this.insert(st);
		}
	}

	public void insert(Student st){
		root = insertNode(root, new NodeStudent(st));
	}

	private NodeStudent insertNode(NodeStudent current, NodeStudent elem) {
		if(current == null){	return elem;	}
		if(elem.getKey() < current.getKey()){
			current.setLeft(insertNode(current.getLeft(), elem));
			current = rotation_R(current);
		}else{
			current.setRight(insertNode(current.getRight(), elem));
			current = rotation_L(current);
		}
		return current;
	}

	private NodeStudent rotation_R(NodeStudent rt){
		NodeStudent  lt = rt.getLeft(), q = lt.getRight();
	    lt.setRight(rt);
	    rt.setLeft(q);
	     return lt;
	}

	private NodeStudent rotation_L (NodeStudent lt){  
		NodeStudent  rt = lt.getRight(), q = rt.getLeft();
	    rt.setLeft(lt);
	    lt.setRight(q);
	    return rt; 
	}

	public void print() {  
		printNode(root, "", 0);
    }
	
	private void printNode(NodeStudent node, String st, int i) {  
		if(node == null)
			return;
    	System.out.println(i + st + node.getElement().toString());
    	i++;
		st = st+"-";
    	printNode(node.getLeft(), st, i);
		printNode(node.getRight(), st, i);
    }
	
	public	Student search(int key) {
		return searchElement(root, key);
	}
	
	private Student searchElement(NodeStudent node, int key) {
		if(node == null){	return null;	}
		if(node.getKey() == key)
			return node.getElement();
		if(node.getKey() < key)
			return searchElement(node.getRight(), key);
		else
			return searchElement(node.getLeft(), key);
	}
	
	public	NodeStudent searchNode(int key) {
		return searchNodeElement(root, key);
	}
	
	private NodeStudent searchNodeElement(NodeStudent node, int key) {
		if(node == null){	return null;	}
		if(node.getKey() == key)
			return node;
		if(node.getKey() < key)
			return searchNodeElement(node.getRight(), key);
		else
			return searchNodeElement(node.getLeft(), key);
	}

	public Student searchByKeyAndID(int key, int id){
		Student[] st = this.searchArray(key);
		for(int i = 0; i < st.length; i++){
			if(st[i].getStudID()==id){	return st[i];	}
		}
		return null;
	}
	
	public	Student[] searchArray(int key) {
		Student[] res = null;
		return searchElementArray(root, key, res);
	}
	
	private Student[] searchElementArray(NodeStudent node, int key, Student[] res) {
		if(node == null){	return null;	}
		if(node.getKey() == key){
			Student[] left = searchElementArray(node.getLeft(), key, res);
			Student[] right = searchElementArray(node.getRight(), key, res);
			int num = 1;
			if (left != null){	num = num + left.length;	}
			if (right != null){	num = num + right.length;	}
			Student[] temp = new Student[num];
			int i = 0;
			temp[0] = node.getElement();
			
			if (right != null){
				for (i=0; i < right.length; i++){
					temp[i+1] = right[i];
				}
			}
			if (left != null){
				for (int j = 0; j < left.length;j++){
					temp[j+i+1]=left[j];
				}
			}
			return temp;
		}
		if(node.getKey() < key)
			return searchElementArray(node.getRight(), key, res);
		else
			return searchElementArray(node.getLeft(), key, res);
	}
}
