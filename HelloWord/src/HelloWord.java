public class HelloWord {

	public static void CallMe(int i) throws MyExeption {

		if (i > 10)
			throw new MyExeption(i);
		System.out.println("Normal Exit");
	}

	public static void main(String[] args) {
		// System.out.println("Hello Word");
		try {
			CallMe(11);
		} catch (MyExeption e) {
			System.out.println("Catched: " + e);
		}
	}
}