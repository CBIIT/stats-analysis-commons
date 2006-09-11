package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;
import java.util.List;

public class CorrelationResult extends AnalysisResult implements Serializable {

	
	private static final long serialVersionUID = 1L;

	private Double correlationValue = null;
	
	private DoubleVector vector1;
	private DoubleVector vector2;
	
	public CorrelationResult(String sessionId, String taskId) {
		super(sessionId, taskId);
	}

	public Double getCorrelationValue() {
		return correlationValue;
	}

	public void setCorrelationValue(Double correlationValue) {
		this.correlationValue = correlationValue;
	}

	public DoubleVector getVector1() {
		return vector1;
	}

	public void setVector1(DoubleVector vector1) {
		this.vector1 = vector1;
	}

	public DoubleVector getVector2() {
		return vector2;
	}

	public void setVector2(DoubleVector vector2) {
		this.vector2 = vector2;
	}

	@Override
	public String toString() {
		 return "CorrelationResult: sessionId=" + getSessionId() + " taskId=" + getTaskId() + " vector1Name=" + vector1.getName() + " vector2Name=" + vector2.getName() + " corrValue=" + correlationValue;
	}

}
