public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(process("Hello world!", new Processor() {
			public String process(String str) {
				return str.toUpperCase();
			}
		}));
	}

	private static String process(String str, Processor processor) {
		// TODO Auto-generated method stub
		return processor.process(str);
	}

}

interface Processor {
	
	String process(String str);
	
}