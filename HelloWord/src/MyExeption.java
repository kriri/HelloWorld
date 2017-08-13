public class MyExeption extends Exception {

	int digit;

	MyExeption(int a) {
		digit = a;
	}

	public String toString() {
		return "This is my new exeption";
	}
}
