package greeting;

public class DefaultGreetingGenerator implements GreetingGenerator {

	public String format(String name) {
		return "Hello " + name;
	}

}
