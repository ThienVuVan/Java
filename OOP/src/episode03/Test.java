package episode03;

public class Test {
	public static void main(String[] args) {
		Counter [] arr = new Counter[2];
		for(Counter ctr : arr ) {
			System.out.println(ctr.count);
		}
	}
}
