package main;

import java.util.ArrayList;
import java.util.List;

import main.metamodel.Machine;
import main.metamodel.State;
import main.metamodel.Transition;

public class StateMachine {
	private Machine machine;
	private List<State> tempStates = new ArrayList<>();
	private List<Transition> tempTransitions = new ArrayList<>();
	Transition tempTransition;


	public Machine build() {
		machine = new Machine();
		machine.getStates().addAll(tempStates);
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
		return this;
	}

	public StateMachine set(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine increment(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine decrement(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine ifEquals(String string, int i) {
		// TODO Auto-generated method stub
		return null;
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
