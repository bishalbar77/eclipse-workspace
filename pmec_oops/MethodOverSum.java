package pmec_oops;


public class MethodOverSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int var1 = 5, var2 =9, var3=9, var4=56,  var5= 29, var6=86;
		double num1 = 52.5, num2 =9.9, num3=9, num4=57.0;
		float number1 = 5.56f, number2 =9.594f, number3=85.25f, number4=52.6F,  number5= 12.29f;
		System.out.println("Double sum of 4 numbers      : "+DoubleSum(num1, num2, num3, num4));
		System.out.println("Float sum of 5 numbers       : "+DoubleSum(number1, number2, number3, number4, number5));
		System.out.println("Integer sum of 6 numbers     : "+DoubleSum(var1, var2, var3, var4, var5, var6));
	}

	private static double DoubleSum(double num1, double num2, double num3, double num4) {
		double sum = num1 + num2 + num3 + num4;
		System.out.println("Average of 4 double numbers  : "+(sum)/4);
		return sum;
	}

	private static float DoubleSum(float number1, float number2, float number3, float number4, float number5) {
		float sum = number1 + number2 + number3 + number4 + number5;
		System.out.println("Average of 5 float numbers   : "+(sum)/5);
		return sum;
	}

	static int DoubleSum(int var1, int var2, int var3, int var4, int var5, int var6) {
		int sum =  var1 + var2 + var3 + var4 + var5 + var6;
		System.out.println("Average of 6 integer numbers : "+(sum)/6);
		return sum;
	}

}
