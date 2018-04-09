package GenericsMethod;

public class Test {

	public static void main(String[] args) {
		
		Pair<Integer, String> p1 = new Pair<Integer, String>(1,"Apple");
		Pair<Integer, String> p2 = new Pair<Integer, String>(2,"orange");
		
		//System.out.println(p1.getValue());
		//System.out.println(p2.getValue());
		
		Boolean test = Util.<Integer,String>compare(p1, p2);
		System.out.println(test);
		// TODO Auto-generated method stub

	}

}
