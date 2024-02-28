package main;

import java.util.List;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class MachineInterpreter {
    private State currentState = null;
    Machine machine = null;

    public void run(Machine machine) {
        currentState = machine.getInitialState();
        this.machine = machine;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void processEvent(String event) {
    List<Transition> transitions = currentState.getTransitionsByEvent(event);

    for (Transition transition : transitions) {
        String conditionVariableName = transition.getConditionVariableName();
        Integer conditionValue = transition.getConditionComparedValue();

        if (conditionVariableName == null || 
            (transition.isConditionEqual() && machine.getVariable(conditionVariableName) == conditionValue) ||
            (transition.isConditionGreaterThan() && machine.getVariable(conditionVariableName) > conditionValue) ||
            (transition.isConditionLessThan() && machine.getVariable(conditionVariableName) < conditionValue)) {
            
            String operationVariableName = transition.getOperationVariableName();
            if (operationVariableName != null) {
                if (transition.isIncrementOperation()) {
                    machine.incrementVariable(operationVariableName);
                } else if (transition.isDecrementOperation()) {
                    machine.decrementVariable(operationVariableName);
                }
            }

            currentState = transition.getTarget();

            break;
        }
    }
}

    public int getInteger(String string) {
        return machine.getIntegers().get(string);
    }

}
