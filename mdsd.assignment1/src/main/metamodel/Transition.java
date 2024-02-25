package main.metamodel;

public class Transition{
	private String event;
	private State target;
	private String operationVariableName;
	private Integer operationValue;
	private boolean hasSetOperation = false;
	private boolean hasIncrementOperation = false;
	private boolean hasDecrementOperation = false;
	private boolean hasIfEqualsOperation = false;
	private String conditionVariableName;
	private Integer conditionComparedValue;
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

	public void setHasSetOperation() {
		this.hasSetOperation = !hasSetOperation;
	}
	
	public boolean hasSetOperation() {
		return hasSetOperation;
	}

	public void setHasIncrementOperation() {
		this.hasIncrementOperation = !hasIncrementOperation;
	}

	public void incrementOperationValue() {
		this.operationValue++;
	}

	public boolean hasIncrementOperation() {
		return hasIncrementOperation;
	}

	public void setHasDecrementOperation() {
		this.hasDecrementOperation = !hasDecrementOperation;
	}

	public void decrementOperationValue() {
		this.operationValue--;
	}

	public boolean hasDecrementOperation() {
		return hasDecrementOperation;
	}

	public void setHasIfEqualsOperation() {
		this.hasIfEqualsOperation = !hasIfEqualsOperation;
	}

	public Object getOperationVariableName() {
		return operationVariableName;
	}

	public boolean isConditional() {
		return hasIfEqualsOperation;
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
		// TODO Auto-generated method stub
		return false;
	}

	public void setTarget(State state) {
		this.target = state;		
	}

}
