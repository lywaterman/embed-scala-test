import com.twitter.util.Eval;
import scala.Int;
import java.lang.Object;
import java.io.File;
import java.io.IOException;

public class Sample2 {
	public String name;

	public static String sayHello(String name) {
    	Eval eval = new Eval();
		
		System.out.println("compile game_data");
		eval.compile(eval.toSource(new File("game_data.scala")));

		System.out.println("run game_func");
    	java.lang.Object value = eval.apply(eval.toSource(new File("game_func.scala")), false);

		System.out.println(value.getClass().getName());

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
