package org.jsoup.numbering;

import static org.junit.Assert.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.junit.Test;

/**
 * 
 * @author Julien Subercaze
 *
 */
public class TestFDFSNumbering {

	@Test
	public void test() {
		String html = "<body><div><a></a><span><img/></span></div><table><tr><td></td></tr></table></body>";
		Document parse = Jsoup.parse(html);
		assertTrue(parse.select("div").first().getElementID() < parse.select("a").first().getElementID());
		assertTrue(parse.select("a").first().getElementID() < parse.select("span").first().getElementID());
		assertTrue(parse.select("span").first().getElementID() < parse.select("img").first().getElementID());
		assertTrue(parse.select("div").first().getElementID() < parse.select("table").first().getElementID());
		assertTrue(parse.select("table").first().getElementID() < parse.select("tr").first().getElementID());

	}

}
