package com.mattmattandjames.speechnetwork;

import java.util.ArrayList;

public class Network {
	public ArrayList<Float> inputs;
	public ArrayList<Node> outputs;
	private ArrayList<Node> hiddenLayer;

	Network(ArrayList<Float> inputs, int hiddenNodes) { //initialize network
		this.inputs = inputs;
		this.hiddenLayer = new ArrayList<Node>(hiddenNodes);
		this.outputs = new ArrayList<Node>(5); //capacity is the number of possible words

		for (int i = 0; i <hiddenNodes; i++) {
			Node nodeToAdd = new Node(inputs.size());
			hiddenLayer.add(nodeToAdd);
		}

		for (int i = 0; i <outputs.size(); i++) {
			Node nodeToAdd = new Node(hiddenLayer.size());
			outputs.add(nodeToAdd);
		}
	}

	public void think() {
		for (Node node:hiddenLayer) {
			for (int i = 0; i < inputs.size(); i++) {
				node.value += node.weights.get(i)*inputs.get(i);
			}
		}
		for (Node node : outputs) {
			for (int i = 0; i < hiddenLayer.size(); i++) {
				node.value += node.weights.get(i)*hiddenLayer.get(i).value;
			}
		}
	}

}