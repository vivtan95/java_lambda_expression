// Using function from java8 for easier use of function interface
import java.util.function.BiFunction;
import java.util.function.Function;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println( process("Hello world!", String::toUpperCase));
		
		// lambda expression with 2 parameters
		System.out.println( process("Hello world!", 5, (string, i) -> string.substring(i)));
		// Sub lambda expression with method reference
		System.out.println( process("Hello world!", 5, String::substring));
		
		
		String prefix = "Hi Everyone, ";
		// Using lambda expression with concat
		System.out.println( process("Hello world!", str -> prefix.concat(str)));
		// Using method reference
		System.out.println( process("Hello world!", prefix::concat));
		
	}
	
	// 
	private static String process(String string, int i, BiFunction<String, Integer, String> processor) {
		// TODO Auto-generated method stub
		
		return processor.apply(string, i);
	}

	// substitute functional interface
	private static String process(String str, Function<String, String> processor) {
		// TODO Auto-generated method stub
		return processor.apply(str);
	}

}