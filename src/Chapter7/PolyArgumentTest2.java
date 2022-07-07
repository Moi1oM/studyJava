package Chapter7;

import java.util.*;

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer b= new Buyer();
		Tv tv = new Tv();
		Computer com = new Computer();
		Audio audio = new Audio();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
	Product(){
		price=0;
		bonusPoint=0;
	}
}

class Tv extends Product{
	Tv() {super(100);}
	public String toString() {return "Tv";}
}

class Computer extends Product{
	Computer() {super(200);}
	public String toString() {return "Computer";}
}

class Audio extends Product{
	Audio() {super(300);}
	public String toString() {return "Audio";}
}

class Buyer{
	int money=1000;
	int bonusPoint=0;
	Vector item= new Vector();
	
	void buy(Product p) {
		if (money<p.price) {
			System.out.println("no money");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"buy");
	}
	void refund(Product p) {
		if(item.remove(p)) {
			money+=p.price;
			bonusPoint-=p.bonusPoint;
		}else {
			System.out.println("no such item");
		}
	}
	void summary() {
		int sum=0;
		String itemList="";
		if(item.isEmpty()) {
			System.out.println("you didn't buy product");
			return;
		}
		for(int i=0; i<item.size();i++) {
			Product p= (Product)item.get(i);
			sum+=p.price;
			itemList+=(i==0) ? ""+p : ", "+p;
		}
		System.out.println("total price is "+sum);
		System.out.println("you bought"+itemList);
	}
}