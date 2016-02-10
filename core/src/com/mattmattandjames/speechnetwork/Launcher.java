package com.mattmattandjames.speechnetwork;

import java.util.ArrayList;

public class Launcher {
	public Network network;

	public static void main (String[] arg) {
		int hiddenNodes = 20;
		Network network = new Network(getInputs(),hiddenNodes); //44 distinct english phonemes
	}

	private static ArrayList<Float> getInputs() { //waveform values
		return new ArrayList<Float>(1000);
	}

}