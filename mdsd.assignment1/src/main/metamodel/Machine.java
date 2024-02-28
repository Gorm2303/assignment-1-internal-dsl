package main.metamodel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Machine {
	private List<State> states = new ArrayList<>();
	private Map<String, Integer> integers = new HashMap<>();

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
		return integers.size();
	}

	public boolean hasInteger(String string) {
		return integers.containsKey(string);
	}

	public Map<String, Integer> getIntegers() {
		return integers;
	}

	public void setVariable(String variableName, Integer value) {
		integers.put(variableName, value);
	}

	public void setStates(ArrayList<State> arrayList) {
		states = arrayList;
	}

    public void setIntegers(HashMap<String, Integer> hashMap) {
		integers = hashMap;
    }

	public Integer getVariable(String string) {
		return integers.get(string);
	}

	public void decrementVariable(String variableName) {
		Integer value = getVariable(variableName);
		if (value != null) {
			setVariable(variableName, value - 1);
		}
	}

	public void incrementVariable(String variableName) {
		Integer value = getVariable(variableName);
		if (value != null) {
			setVariable(variableName, value + 1);
		}
	}
}

