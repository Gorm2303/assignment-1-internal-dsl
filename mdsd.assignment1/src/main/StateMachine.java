package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	private Machine machine;
	private List<State> tempStates = new ArrayList<>();
	private Transition tempTransition;
	private Map<String, Integer> tempIntegers = new HashMap<>();


	public Machine build() {
		machine = new Machine();
		machine.getStates().addAll(tempStates);
		machine.getIntegers().putAll(tempIntegers);
        return machine;
	}

	public StateMachine state(String string) {
		tempStates.add(new State(string));
		return this;
	}

	public StateMachine initial() {
		tempStates.get(tempStates.size() - 1).setInitial();
		return this;
	}

	public StateMachine when(String string) {
		tempTransition = new Transition(string);
		return this;
	}

	public StateMachine to(String string) {
		tempTransition.setTarget(new State(string));
		tempStates.get(tempStates.size() - 1).getTransitions().add(tempTransition);
		return this;
	}

	public StateMachine integer(String string) {
		tempIntegers.put(string, null);
		return this;
	}

	public StateMachine set(String string, int i) {
		tempTransition.setOperationVariableName(string);
		tempTransition.setOperationValue(i);
		tempTransition.setHasSetOperation();
		return this;
	}

	public StateMachine increment(String string) {
		tempTransition.setOperationVariableName(string);
		tempTransition.setHasIncrementOperation();
		return this;
	}

	public StateMachine decrement(String string) {
		tempTransition.setOperationVariableName(string);
		tempTransition.setHasDecrementOperation();
		return this;
	}

	public StateMachine ifEquals(String string, int i) {
		tempTransition.setConditionComparedName(string);
		tempTransition.setConditionComparedValue(i);
		tempTransition.setHasIfEqualsOperation();
		return this;
	}

	public StateMachine ifGreaterThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifLessThan(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
