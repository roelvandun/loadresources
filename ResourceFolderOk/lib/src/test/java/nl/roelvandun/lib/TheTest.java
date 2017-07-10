package nl.roelvandun.lib;

import org.junit.Test;

import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;

public class TheTest {

	@Test
	public void name() throws Exception {
		String filename = "people.json"; // when you CMD+click the "people.json", it does open the resource file

		URL resource = getClass().getResource(filename);

		System.out.println(resource);

		String json = Files.lines(Paths.get(""))
				.parallel()
				.collect(Collectors.joining());

		assertThat(resource, is(not(nullValue())));
	}

}
