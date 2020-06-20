package pog5;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
	public static void main(String[] args) {
		ArrayList<Product> myList = new ArrayList<Product>();
		myList.add(new Product(50.0, "Product 1"));
		
		Category c1 = new Category();
		Category c2 = new Category("Category 2");
		Category c3 = new Category("Category 3", myList);
		
		c1.add(new Product(30.0 ,"Product 1"));
		c2.add(new Product(32.5 ,"Product 2"));
		c3.add(new Product(15.0 ,"Product 3"));
	}
}

class Category {
	String name;
	List<Product> list = new ArrayList<Product>();
	
	public Category() {
		
	}
	
	public Category(String name) {
		this.name = name;
	}
	
	public Category(String name, List<Product> list){
		this.name = name;
		this.list = list;
	}
	
	public void rename(String name) {
		this.name = name;
	}
	
	public void add(Product product) {
		list.add(product);
	}
	
	public void remove(Product product) {
		for(Product p: list)
			if(p.getName().equals(product.getName())) {
				list.remove(p);
				return;
			}
	}
}
