package com.mattmattandjames.speechnetwork;

import java.util.ArrayList;
import java.util.Random;

public class Node {
	public ArrayList<Float> weights;
	public float value;

	Node(int numInputs) {
		this.weights = new ArrayList<Float>(numInputs);
		this.value = 0;

		for (int i = 0; i < numInputs; i++) { //generates random starting weights
			float weight = new Random().nextFloat();
			weights.add(weight);
		}
	}
}
