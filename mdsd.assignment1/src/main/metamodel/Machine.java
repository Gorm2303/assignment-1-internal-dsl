package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class Machine {
	private List<State> states = new ArrayList<>();

	public List<State> getStates() {
		return states;
	}

	public State getInitialState() {
		for (State s : states) {
			if (s.isInitial()) {
				return s;
			}
		}
		return null;
	}

	public State getState(String string) {
		for (State state : states) {
			if (state.getName().equals(string)) {
				return state;
			}
		}
		return null;
	}

	public int numberOfIntegers() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasInteger(String string) {
		// TODO Auto-generated method stub
		return false;
	}
}

