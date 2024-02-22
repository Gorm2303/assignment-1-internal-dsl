package main;

import java.util.ArrayList;
import java.util.List;

import main.metamodel.Machine;
import main.metamodel.State;

public class StateMachine {
	private Machine machine;
	private List<State> states = new ArrayList<State>();

	public Machine build() {
		machine = new Machine();
		machine.getStates().addAll(states);
        return machine;
	}

	public StateMachine state(String string) {
		states.add(new State(string));
		return this;
	}

	public StateMachine initial() {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine when(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine to(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public StateMachine integer(String string) {
		// TODO Auto-generated method stub
		return null;
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
