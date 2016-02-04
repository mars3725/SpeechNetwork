package com.mattmattandjames.speechnetwork;

import java.util.ArrayList;

/**
 * Created by Matthew Mohandiss on 2/3/16.
 */
public class Node {
	public ArrayList<Float> weights;

	Node(int numInputs) {
		this.weights = new ArrayList<Float>(numInputs);
	}
}
