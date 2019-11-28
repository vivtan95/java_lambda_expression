public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(process("Hello world!", str -> str.toUpperCase()));
	}

	private static String process(String str, Processor processor) {
		// TODO Auto-generated method stub
		return processor.process(str);
	}

}

// Functional interface (Interface with a single method)
@FunctionalInterface
interface Processor {
	
	String process(String str);
	
}