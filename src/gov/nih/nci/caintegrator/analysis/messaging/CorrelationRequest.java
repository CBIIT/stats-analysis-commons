package gov.nih.nci.caintegrator.analysis.messaging;

import gov.nih.nci.caintegrator.enumeration.CorrelationType;

import java.io.Serializable;

public class CorrelationRequest extends AnalysisRequest implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DoubleVector vector1 = null;
	private DoubleVector vector2 = null;
	
	private ReporterInfo reporter1 = null;
	private ReporterInfo reporter2 = null;
	
	private SampleGroup sampleGrp1 = null;
	private SampleGroup sampleGrp2 = null;
	
	
	private CorrelationType correlationType;
	
	public CorrelationRequest(String sessionId, String taskId) {
		super(sessionId, taskId);
		
	}
	
	public void setVector1(DoubleVector vector1) {
	  this.vector1 = vector1;
	}
	
	public void setVector2(DoubleVector vector2) {
	  this.vector2 = vector2;
	}
	
	public void setReporter1(ReporterInfo reporter1) {
	  this.reporter1 = reporter1;
	}
	
	public void setReporter2(ReporterInfo reporter2) {
	  this.reporter2 = reporter2;
	}

	@Override
	public String toString() {
		
	  StringBuffer sb = new StringBuffer();
	  	
	  sb.append("CorrelationReqeust: sessionId=").append(getSessionId()).append(" taskId=" ).append(getTaskId());
	  
	  sb.append(" sampleGrp1=").append(sampleGrp1);
	  sb.append(" sampleGrp2=").append(sampleGrp2);
	  
	  if (vector1 != null) {
		sb.append(" vector1=").append(vector1.getName()).append(" len=").append(vector1.size());		  
	  }
	  
	  if (vector2 != null) {
		sb.append(" vector2=").append(vector2.getName()).append(" len=").append(vector2.size());		  
	  }
	  
	  if (reporter1 != null) {
	    sb.append(reporter1.toString());
	  }
	  
	  if (reporter2 != null) {
		sb.append(reporter2.toString());
	  }
	  
	  sb.append(" ").append(correlationType.toString());
	 
	  return sb.toString();
	  
	}

	public DoubleVector getVector1() {
		return vector1;
	}

	
	public DoubleVector getVector2() {
		return vector2;
	}

	
	public CorrelationType getCorrelationType() {
		return correlationType;
	}

	public void setCorrelationType(CorrelationType correlationType) {
		this.correlationType = correlationType;
	}

	public SampleGroup getSampleGrp1() {
		return sampleGrp1;
	}

	public void setSampleGrp1(SampleGroup sampleGrp1) {
		this.sampleGrp1 = sampleGrp1;
	}

	public SampleGroup getSampleGrp2() {
		return sampleGrp2;
	}

	public void setSampleGrp2(SampleGroup sampleGrp2) {
		this.sampleGrp2 = sampleGrp2;
	}

	public ReporterInfo getReporter1() {
		return reporter1;
	}

	public ReporterInfo getReporter2() {
		return reporter2;
	}
	
}
