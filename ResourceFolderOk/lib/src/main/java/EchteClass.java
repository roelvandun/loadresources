import java.net.URL;

/**
 * Intentionally without a package, to match the "no-packaged" resource file
 */
public class EchteClass {

	public static void main(String[] args) {
		new EchteClass();
	}

	public EchteClass() {
		URL resource = getClass().getResource("people.json");

		System.out.println(resource);
	}
}
