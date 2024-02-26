package main.metamodel;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class State {
	private String name; 
	private boolean initial = false;
	private List<Transition> transitions = new LinkedList<>();

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

	public void setInitial() {
		this.initial = !initial;
	}

	public boolean isInitial() {
		return initial;
	}
}
