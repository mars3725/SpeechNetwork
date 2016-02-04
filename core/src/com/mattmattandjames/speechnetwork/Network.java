package com.mattmattandjames.speechnetwork;

import java.util.ArrayList;

/**
 * Created by Matthew Mohandiss on 2/3/16.
 */
public class Network {
	public ArrayList<Float> inputs;
	public ArrayList<Float> outputs;
	private ArrayList<Node> hiddenLayer;
	private int numNodesInHiddenLayer;
	private int numOutputs;
	private int numInputs;

	public static void main (String[] arg) {
		Network network = new Network(44,20); //44 distinct english phonemes
	}

	Network(int inputs, int hiddenNodes) {
		this.inputs = new ArrayList<Float>(inputs);
		this.hiddenLayer = new ArrayList<Node>(hiddenNodes);
		this.outputs = new ArrayList<Float>(5); //capacity is the number of possible words

		for (int i = 0; i <hiddenNodes; i++) {
			Node nodeToAdd = new Node(inputs);
			hiddenLayer.add(nodeToAdd);
		}
	}

}
