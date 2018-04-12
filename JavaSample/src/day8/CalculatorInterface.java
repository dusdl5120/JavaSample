package day8;

public interface CalculatorInterface {
	
	public double sum(double a, double b);
	public double sub(double a, double b);
	public double mul(double a, double b);
	public double div(double a, double b) throws Exception;
	public double mod(double a, double b) throws Exception;
	public double calculate(double a, double b, char ch) throws Exception;
	default void Test() {}
	

}
