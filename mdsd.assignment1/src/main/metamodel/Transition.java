package main.metamodel;

public class Transition{
	private String event;
	private State target;
	private String operationVariableName;
	private Integer operationValue;
	private boolean setOperation = false;
	private boolean incrementOperation = false;
	private boolean decrementOperation = false;
	private String conditionVariableName;
	private Integer conditionComparedValue;
	private boolean isConditional = false;
	private boolean isConditionEqual = false;
	private boolean isConditionGreaterThan = false;
	private boolean isConditionLessThan = false;

	public Transition(String event){
		this.event = event;
	}

	public Object getEvent() {
		return event;
	}

	public State getTarget() {
		return target;
	}
	
	public void setOperationVariableName(String operationVariableName) {
		this.operationVariableName = operationVariableName;
	}
	
	public Integer getOperationValue() {
		return operationValue;
	}
	
	public void setOperationValue(Integer operationValue) {
		this.operationValue = operationValue;
	}

	public void setSetOperation() {
		this.setOperation = !setOperation;
	}
	
	public boolean hasSetOperation() {
		return setOperation;
	}

	public void setIncrementOperation() {
		this.incrementOperation = !incrementOperation;
	}

	public void incrementOperationValue() {
		this.operationValue++;
	}

	public boolean hasIncrementOperation() {
		return incrementOperation;
	}

	public void setDecrementOperation() {
		this.decrementOperation = !decrementOperation;
	}

	public void decrementOperationValue() {
		this.operationValue--;
	}

	public boolean decrementOperation() {
		return decrementOperation;
	}

	public void setConditionOperation() {
		this.isConditional = !isConditional;
	}

	public Object getOperationVariableName() {
		return operationVariableName;
	}

	public boolean isConditional() {
		return isConditional;
	}

	public Object getConditionVariableName() {
		return conditionVariableName;
	}
	
	public void setConditionComparedName(String string) {
		this.conditionVariableName = string;
	}

	public Integer getConditionComparedValue() {
		return conditionComparedValue;
	}

	public boolean isConditionEqual() {
		return isConditionEqual;
	}

	public void setConditionEqual(boolean isConditionEqual) {
		this.isConditionEqual = isConditionEqual;
	}
	
	public boolean isConditionGreaterThan() {
		return isConditionGreaterThan;
	}

	public void setConditionGreaterThan(boolean isConditionGreaterThan) {
		this.isConditionGreaterThan = isConditionGreaterThan;
	}

	public boolean isConditionLessThan() {
		return isConditionLessThan;
	}
	
	public void setConditionLessThan(boolean isConditionLessThan) {
		this.isConditionLessThan = isConditionLessThan;
	}

	public void setConditionComparedValue(Integer conditionComparedValue) {
		this.conditionComparedValue = conditionComparedValue;
	}
	
	public boolean hasOperation() {
		return (operationVariableName != null);
	}

	public void setTarget(State state) {
		this.target = state;		
	}

}
