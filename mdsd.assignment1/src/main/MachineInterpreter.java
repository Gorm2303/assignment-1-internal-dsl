package main;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
    private Machine machine = null;
    private State currentState = null;

    public void run(Machine m) {
        machine = m;
    }

    public State getCurrentState() {
        if (currentState == null) {
            currentState = machine.getInitialState();  
        }
        return currentState;
    }

    public void processEvent(String string) {;
        if (getCurrentState().getTransitionByEvent(string) == null) {
            return;
        }
        Transition transition = getCurrentState().getTransitionByEvent(string);
        currentState = transition.getTarget();
    }

    public int getInteger(String string) {
        // TODO Auto-generated method stub
        return 0;
    }

}
