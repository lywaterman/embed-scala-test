import com.twitter.util.Eval;

public class Sample2 {
	public String name;

	public static String sayHello(String name) {
    	Eval eval = new Eval();
		return "Hello, " + name + "!";
	}

	public String sayHello() {
		return "Hello, " + name + "!";
	}

	public static void main(String args[]) {
		System.out.println("HelloWorld");	
		Sample2.sayHello("sdfdsf");
	}
}
