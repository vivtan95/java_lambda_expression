// Using function from java8 for easier use of function interface
import java.util.function.Function;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( process("Hello world!", str -> str.toUpperCase()));
	}
	
	// substitute functional interface
	private static String process(String str, Function<String, String> processor) {
		// TODO Auto-generated method stub
		return processor.apply(str);
	}

}