package com.emrebalikci;

import java.util.EventListener;


/**
 *  Created by  Emre BALIKÇI
 *  DATE : 26.04.2019
 */

/**
 *	interface SimulationEventListener
 *
 *	encapsulates functionality required for responding to a SimulationEvent
 *
 *	any class that needs to respond directly to an event in the simulation must
 *	implement this interface
 */
public interface SimulationEventListener extends EventListener
{

    /**
     *	respond to a SimulationEvent
     */
    void simulationEventOccurred(SimulationEvent simEvent);

}