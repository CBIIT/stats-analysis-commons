package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;
import java.util.List;

public class CorrelationResult extends AnalysisResult implements Serializable {

	private Double correlationValue = null;
	
	private String vector1Name;
	private List<Double> vector1;
	private String vector2Name;
	private List<Double> vector2;
	
	public CorrelationResult(String sessionId, String taskId) {
		super(sessionId, taskId);
	}

	public Double getCorrelationValue() {
		return correlationValue;
	}

	public void setCorrelationValue(Double correlationValue) {
		this.correlationValue = correlationValue;
	}

	public List<Double> getVector1() {
		return vector1;
	}

	public void setVector1(List<Double> vector1) {
		this.vector1 = vector1;
	}

	public String getVector1Name() {
		return vector1Name;
	}

	public void setVector1Name(String vector1Name) {
		this.vector1Name = vector1Name;
	}

	public List<Double> getVector2() {
		return vector2;
	}

	public void setVector2(List<Double> vector2) {
		this.vector2 = vector2;
	}

	public String getVector2Name() {
		return vector2Name;
	}

	public void setVector2Name(String vector2Name) {
		this.vector2Name = vector2Name;
	}

	@Override
	public String toString() {
		 return "CorrelationResult: sessionId=" + getSessionId() + " taskId=" + getTaskId() + " vector1Name=" + vector1Name + " vector2Name=" + vector2Name  + " corrValue=" + correlationValue;
	}

}
