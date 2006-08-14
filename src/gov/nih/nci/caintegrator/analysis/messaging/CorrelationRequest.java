package gov.nih.nci.caintegrator.analysis.messaging;

import gov.nih.nci.caintegrator.enumeration.CorrelationType;

import java.util.List;

public class CorrelationRequest extends AnalysisRequest {

	
	private String vector1Name;
	private List<Double> vector1;
	
	private String vector2Name;
	private List<Double> vector2;
	
	private CorrelationType correlationType;
	
	public CorrelationRequest(String sessionId, String taskId) {
		super(sessionId, taskId);
		
	}
	
	public void setVector1(String name, List<Double> values) {
	  this.vector1Name = name;
	  this.vector1 = values;
	}
	
	public void setVector2(String name, List<Double> values) {
	  this.vector2Name = name;
	  this.vector2 = values;
	}
	

	@Override
	public String toString() {
		
		return null;
	}

	public List<Double> getVector1() {
		return vector1;
	}

	public String getVector1Name() {
		return vector1Name;
	}

	public List<Double> getVector2() {
		return vector2;
	}

	public String getVector2Name() {
		return vector2Name;
	}

	public CorrelationType getCorrelationType() {
		return correlationType;
	}

	public void setCorrelationType(CorrelationType correlationType) {
		this.correlationType = correlationType;
	}

}
