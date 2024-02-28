package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
    private Machine machine;
    private Map<String, State> states = new HashMap<>();
    private State currentState;
    private Transition currentTransition;
    private Map<String, Integer> integers = new HashMap<>();

    public Machine build() {
        machine = new Machine();
        machine.setStates(new ArrayList<>(states.values()));
        machine.setIntegers(new HashMap<>(integers));
        return machine;
    }

    public StateMachine state(String name) {
        currentState = states.computeIfAbsent(name, State::new);
        return this;
    }

    public StateMachine initial() {
        if (currentState == null) {
			System.out.println("No state in initial");
			return this;
        }
        currentState.setInitial();
        return this;
    }

    public StateMachine when(String event) {
		if (currentState == null) {
			System.out.println("No state in when");
			return this;
		}
		currentTransition = new Transition(event);
		currentState.addTransition(currentTransition);
		return this;
	}

    public StateMachine to(String stateName) {
        if (currentTransition == null) {
			System.out.println("No transition in to");
			return this;
        }
        State targetState = states.computeIfAbsent(stateName, State::new);
        currentTransition.setTarget(targetState);
        return this;
    }

    public StateMachine set(String variableName, int value) {
        if (currentTransition == null) {
			System.out.println("No transition in set");
			return this;
        }
		integers.replace(variableName, value);
        currentTransition.setOperationVariableName(variableName);
        currentTransition.setOperationValue(value);
        currentTransition.setSetOperation();
        return this;
    }
	
	public StateMachine integer(String string) {
		integers.put(string, 0);
		return this;
	}

	public StateMachine increment(String string) {
		currentTransition.setOperationVariableName(string);
		currentTransition.setIncrementOperation();
		return this;
	}

	public StateMachine decrement(String string) {
		currentTransition.setOperationVariableName(string);
		currentTransition.setDecrementOperation();
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		currentTransition.setConditionComparedName(string);
		currentTransition.setConditionComparedValue(i);
		currentTransition.setConditionOperation();
		currentTransition.setConditionEqual(true);
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		currentTransition.setConditionComparedName(string);
		currentTransition.setConditionComparedValue(i);
		currentTransition.setConditionGreaterThan(true);
		currentTransition.setConditionOperation();
		return this;
	}

	public StateMachine ifLessThan(String string, int i) {
		currentTransition.setConditionComparedName(string);
		currentTransition.setConditionComparedValue(i);
		currentTransition.setConditionLessThan(true);
		currentTransition.setConditionOperation();
		return this;
	}

}
