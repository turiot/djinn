package com.scramcode.djinn.ui.actions.layout;

import com.scramcode.djinn.db.data.JavaDependency;
import com.scramcode.djinn.db.data.JavaItem;

import edu.uci.ics.jung.algorithms.layout.FRLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;

public class FRLayoutAction extends SetLayoutAction {

	private static final long serialVersionUID = 1L;

	public FRLayoutAction() {
		super("Fruchterman-Reingold (default)");
	}
	
	@Override
	public Layout<JavaItem, JavaDependency> getLayout(Graph<JavaItem, JavaDependency> graph) {	
		return new FRLayout<JavaItem, JavaDependency>(graph);
	}
	
}
