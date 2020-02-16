package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] list;
	public ArrayList() {
		list = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return list[loc];
	}
	
	public void add(T val) {
		T[] arr = (T[]) new Object[list.length+1];
		for(int i=0;i<list.length;i++) {
			arr[i] = list[i];
		}
		arr[arr.length-1] = val;
		list=arr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr = (T[]) new Object[list.length+1];
		for(int i=0;i<loc;i++) {
			arr[i]=list[i];
		}
		arr[loc] = val;
		for(int i=loc+1;i<arr.length;i++) {
			arr[i]=list[i-1];
		}
		list=arr;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr = (T[]) new Object[list.length];
		for(int i=0;i<loc;i++) {
			arr[i]=list[i];
		}
		arr[loc]=val;
		for(int i=loc+1;i<arr.length;i++) {
			arr[i]=list[i];
		}
		list=arr;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] arr = (T[]) new Object[list.length-1];
		for(int i=0;i<loc;i++) {
			arr[i]=list[i];
		}
		for(int i=loc;i<arr.length;i++) {
			arr[i]=list[i+1];
		}
		list=arr;
	}
	
	public boolean contains(T val) {
		for(T t : list) {
			if(t.equals(val))
				return true;
		}
		return false;
	}
	public int size() {
		return list.length;
	}
}