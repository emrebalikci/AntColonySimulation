package com.emrebalikci;


/**
 *  Created by  Emre BALIKÇI
 *  DATE : 26.04.2019
 */
public class Main {

    public static void main(String [] args) {
        AntSimGUI gui = new AntSimGUI();

        gui.addSimulationEventListener(new Simulation(gui));

    }
}
