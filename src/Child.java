
public class Child extends Parent {

	int bankBalance=1000;
	
	Child(){
		System.out.println("Child class constructor");
	}
	void play() {
		System.out.println("Child plays cricket very Well");
	}
	void childProperty() {
		super.property();
	}
	
	
	void accessParent() {
		System.out.println("Bank balance :"+super.bankBalance);
	}

}
