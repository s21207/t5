package pog5;

import java.util.ArrayList;

public class Task2 {

}

class Busket {
	String account;
	ArrayList<Product> list = new ArrayList<Product>();
	
	public Busket() {
		
	}
	
	public Busket(String account) {
		this.account = account;
	}
	
	public Busket(String account, ArrayList<Product> list){
		this.account = account;
		this.list = list;
	}
	
	public void buy() {
		double sum = 0;
		
		for(Product p : list)
			sum += p.getCost();
		
		System.out.println(sum);
	}
	
	public void add(Product p) {
		list.add(p);
	}
	
	public void remove(Product product) {
		for(Product p: list)
			if(p.getName().equals(product.getName())) {
				list.remove(p);
				return;
			}
	}
	
}