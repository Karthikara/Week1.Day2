package week1.Day2;

public class MyCalculator {

	public static void main(String[] args) {
		Calculator obj= new Calculator();
		int add = obj.add(5, 4, 6);
		System.out.println(add);
		int sub = obj.sub(9, 18);
System.out.println(sub);
double multiply = obj.multiply(8.5,9.8);
System.out.println(multiply);
float divide = obj.divide(8.2f,4.1f);
System.out.println(divide);
	}

}
