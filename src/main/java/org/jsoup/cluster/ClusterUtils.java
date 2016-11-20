package org.jsoup.cluster;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

public class ClusterUtils {

	public static int commonBranchSize(Node node1, Node node2) {
		return commonBranch(getParents(node1), getParents(node2));
	}

	private static int commonBranch(List<Node> parents, List<Node> parents2) {
		int i = 0;
		for (;;) {
			if (i == parents.size() || i == parents2.size()) {
				return i;
			}
			if (parents.get(i) == parents2.get(i))
				i++;
			else
				return i;
		}
	}

	public static Node lCA(Node node1, Node node2) {
		List<Node> parents = getParents(node1);
		List<Node> parents2 = getParents(node2);
		// LCA
		int commonsize = commonBranch(parents, parents2);
		return parents.get(commonsize - 1);
	}

	public static int shortestPathDistance(Node node1, Node node2) {
		List<Node> parents = getParents(node1);
		List<Node> parents2 = getParents(node2);
		// LCA
		int commonsize = commonBranch(parents, parents2);
		// Distance
		if (commonsize == parents.size() || commonsize == parents2.size()) {
			return Math.max(parents.size(), parents2.size()) - commonsize;
		}
		return parents.size() + parents2.size() + 2 - (2 * commonsize);
	}

	public static List<Node> getParents(Node node) {
		List<Node> list = new ArrayList<>();
		Node parent = node;
		do {
			parent = parent.parentNode();
			if (parent != null)
				list.add(parent);
		} while (parent != null);
		Collections.reverse(list);
		return list;
	}
}
