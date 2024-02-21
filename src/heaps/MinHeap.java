package heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinHeap {
	public List<Integer> minheap=new ArrayList<>();
	
	public Integer parent(int ind) {
		return (ind-1)/2;
	}
	
	public Integer leftChild(int ind) {
		return 2*ind+1;
	}
	
	public Integer rightChild(int ind) {
		return 2*ind+2;
	}
	
	public void swap(int current, int parent) {
		int temp=minheap.get(parent);
		minheap.set(parent,minheap.get(current));
		minheap.set(current, temp);
	}
	
	public void sinkdown(int ind) {
		int min=ind;
		while(true) {
			if(leftChild(ind)<minheap.size() && minheap.get(leftChild(ind))<minheap.get(ind)) {
				min=leftChild(ind);
			}
			if(rightChild(ind)<minheap.size() && minheap.get(rightChild(ind))<minheap.get(min)){
				min=rightChild(ind);
			}
			if(min!=ind) {
				swap(ind,min);
				ind=min;
			}
			else {
				break;
			}
		}
	}
	
	public void remove() {
		int ind=minheap.size()-1;
		minheap.set(0, minheap.remove(ind));
		sinkdown(0);
	}
	public void insert(int value) {
		System.out.println("insert called");
		minheap.add(value);
		int current=minheap.size()-1;
		while(current >0 && minheap.get(current)<minheap.get(parent(current))){
			System.out.println("inside while");
			swap(current,parent(current));
			current=parent(current);
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Integer[] arr= {5,2,8,1,6,3,9};
		MinHeap mh=new MinHeap();
		List<Integer> li=new ArrayList<>(Arrays.asList(arr));
		for(Integer i:arr) {
			mh.insert(i);
		}
		mh.remove();
		System.out.println(mh.minheap);
		
		
		
		
	}

}
