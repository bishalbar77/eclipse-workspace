package linkedlist;

public class ColdDrinkCan {
	int juice;
	ColdDrinkCan address;

	// Empty Can
	ColdDrinkCan() {}
	// Constructor to fill the class
	// Can with juice
	ColdDrinkCan(int juice) {
		this.juice = juice;
	}
	// Can with juice and address of next can
	ColdDrinkCan(int juice, ColdDrinkCan address) {
		this.juice = juice;
		this.address = address;
	}

}
