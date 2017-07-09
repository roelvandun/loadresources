package nl.roelvandun.lib;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

public class TheTest {

	@Test
	public void name() throws Exception {
		String filename = "/people.json";

		URL resource1 = getClass().getResource(filename);
		URL resource2 = getClass().getClassLoader().getResource(filename);
		URL resource5 = TheTest.class.getClassLoader().getResource(filename);
		URL resource3 = Thread.currentThread().getContextClassLoader().getResource(filename);
		URL resource4 = ClassLoader.getSystemClassLoader().getResource(filename);

//		assertThat(resource1, is(not(nullValue()))); //success
//		assertThat(resource2, is(not(nullValue()))); //fails
//		assertThat(resource3, is(not(nullValue()))); //fails
//		assertThat(resource4, is(not(nullValue()))); //fails
//		assertThat(resource5, is(not(nullValue()))); //fails

		String bla = readFile(filename);
	}

	/**
	 * Read file and put is into plain String
	 **/
	String readFile(String fileName) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(fileName));
		try {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				sb.append("\n");
				line = br.readLine();
			}
			return sb.toString();
		} finally {
			br.close();
		}
	}
}
