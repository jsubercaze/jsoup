package org.jsoup.cluster;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.Test;

public class ClusterTest {

	@Test
	public void test() {
		String html = "<html>\r\n" + "<body>\r\n" + "	<div id=\"daddy\">\r\n" + "		<a id=\"gros\"></a>\r\n"
				+ "		<a id=\"gros3\"></a>\r\n" + "	</div>\r\n" + "	<div>\r\n" + "		<a id=\"gros2\"></a>\r\n"
				+ "	</div>\r\n" + "</body>\r\n" + "</html>";
		Document document = Jsoup.parse(html);

		Element first = document.select("#gros").first();
		Element second = document.select("#gros2").first();
		Element third = document.select("#gros3").first();
		Element daddy = document.select("#daddy").first();
//		assertEquals(4, ClusterUtils.shortestPathDistance(first, second));
//		assertEquals(2, ClusterUtils.shortestPathDistance(third, first));
		assertEquals(1, ClusterUtils.shortestPathDistance(first, daddy));

	}

}
