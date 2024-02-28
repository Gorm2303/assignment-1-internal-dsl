package main.metamodel;

import java.util.ArrayList;
import java.util.List;

public class State {
	private String name; 
	private boolean initial = false;
	private List<Transition> transitions = new ArrayList<>();

	public State(String string) {
		this.name = string;
	}

	public State(String string, boolean initial) {
		this.name = string;
		this.initial = initial;
	}

	public Object getName() {
		return name;
	}

	public List<Transition> getTransitions() {
		return transitions;
	}

	public Transition getTransitionByEvent(String string) {
		for (Transition t : transitions) {
			if (t.getEvent().equals(string)) {
				return t;
			}
		}
		return null;
	}

	public List<Transition> getTransitionsByEvent(String event) {
		List<Transition> matchingTransitions = new ArrayList<>();
		for (Transition t : transitions) {
			if (t.getEvent().equals(event)) {
				matchingTransitions.add(t);
			}
		}
		return matchingTransitions;
	}

	public void setInitial() {
		this.initial = !initial;
	}

	public boolean isInitial() {
		return initial;
	}

	public void addTransition(Transition currentTransition) {
		transitions.add(currentTransition);
	}
}
