package nl.roelvandun.lib;

import org.junit.Test;

import java.net.URL;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class TheTest {

	@Test
	public void name() throws Exception {
		String filename = "/people.json";

		URL resource1 = getClass().getResource(filename);
		URL resource2 = getClass().getClassLoader().getResource(filename);
		URL resource5 = TheTest.class.getClassLoader().getResource(filename);
		URL resource3 = Thread.currentThread().getContextClassLoader().getResource(filename);
		URL resource4 = ClassLoader.getSystemClassLoader().getResource(filename);

		assertThat(resource1, is(not(nullValue()))); //success
//		assertThat(resource2, is(not(nullValue()))); //fails
//		assertThat(resource3, is(not(nullValue()))); //fails
//		assertThat(resource4, is(not(nullValue()))); //fails
//		assertThat(resource5, is(not(nullValue()))); //fails
	}
}
