package Java8;

//@FunctionalInterface
interface Addition {
	abstract int add(int a, int b);
}
class Demo implements Addition{

	//@Override
	public int add(int a, int b) {		
		return a+b;
	}
	
}
public class AddNumber {
	public static void main(String[] args) {
		Addition sum = new Demo();
		System.out.println(sum.add(2, 1));
		
		Addition sum1 = (int a, int b) -> {	return a+b;};
		System.out.println(sum1.add(7, 1));
	}

}
