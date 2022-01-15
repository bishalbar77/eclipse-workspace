package linkedlist;

public class ColdDrinkBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColdDrinkCan can1 = new ColdDrinkCan(20);
		ColdDrinkCan can2 = new ColdDrinkCan(80);
		ColdDrinkCan can3 = new ColdDrinkCan(50);
		ColdDrinkCan can4 = new ColdDrinkCan(70);
		can2.address = can1;
		can3.address = can2;
		can4.address = can3;

		ColdDrinkCan can = new ColdDrinkCan();
		can = can4;
		while(can != null) {
			System.out.println(can.juice);
			can = can.address;
		}
	}

}
