
public class Child extends Parent {

	int bankBalance=1000;
	
	Child(){
		System.out.println("Child class constructor");
	}
	void play() {
		System.out.println("Child plays cricket very Well");
	}
	void childProperty() {
		// invoking parent class method
		super.property();
	}
	
	void accessParent() {
		// invoking parent class variable 
		System.out.println("Bank balance :"+super.bankBalance);
		this.bankBalance=super.bankBalance;
	}

}
