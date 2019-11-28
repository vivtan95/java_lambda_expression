// Using function from java8 for easier use of function interface
import java.util.Arrays;
import java.util.Comparator;

public class App {

	public static void main(String[] args) {
		
		String[] names = {"Mr Sanjay", "Ms Tulip", "Dr Josh"};
		
		// To use anonymous object without lambda expression
		Arrays.sort(names, new Comparator<String>() {
			
			@Override
			public int compare(String str1, String str2) {
				
				return str1.split(" ")[1].compareTo(str2.split(" ")[1]);
			}
			
		});
		System.out.println(Arrays.toString(names));
		
		// Using lambda expression
		Arrays.sort(names, (str1, str2) ->  
			str1.split(" ")[1].compareTo(str2.split(" ")[1])
		);
		System.out.println(Arrays.toString(names));
		
		// Using Java8 comparator interface. Input logic inside the comparing parameter
		Arrays.sort(names, Comparator.comparing(str -> str.split(" ")[1]));
		System.out.println(Arrays.toString(names));
		
		// Using method references
		Arrays.sort(names, Comparator.comparing(App::firstName));
		System.out.println(Arrays.toString(names));
		// Using comparator.reverse()
		Arrays.sort(names, Comparator.comparing(App::firstName).reversed());
		System.out.println(Arrays.toString(names));
		
	}
	
	public static String firstName(String name) {
		return name.split(" ")[1];
	}
	
}