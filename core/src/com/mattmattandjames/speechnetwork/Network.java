package com.mattmattandjames.speechnetwork;

import java.util.ArrayList;

public class Network {
	public ArrayList<Float> inputs;
	public ArrayList<Float> outputs;
	private ArrayList<Node> hiddenLayer;
	private int numNodesInHiddenLayer;
	private int numOutputs;
	private int numInputs;

	Network(int inputs, int hiddenNodes) { //initialize network
		this.inputs = new ArrayList<Float>(inputs);
		this.hiddenLayer = new ArrayList<Node>(hiddenNodes);
		this.outputs = new ArrayList<Float>(5); //capacity is the number of possible words

		for (int i = 0; i <hiddenNodes; i++) {
			Node nodeToAdd = new Node(inputs);
			hiddenLayer.add(nodeToAdd);
		}
	}

}
