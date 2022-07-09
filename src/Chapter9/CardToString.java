package Chapter9;
class Card1{
	String kind;
	int number;
	Card1(){
		this("SPADE",1);
	}
	Card1(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
}
class Card2{
	String kind;
	int number;
	Card2(){
		this("SPADE",1);
	}
	Card2(String kind, int number){
		this.kind=kind;
		this.number=number;
	}
	public String toString() {
		return "kind: "+kind+", number: "+number;
	}
}
public class CardToString {
	public static void main(String args[]) {	
		Card1 c1 = new Card1();
		Card2 c2 = new Card2();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
}
