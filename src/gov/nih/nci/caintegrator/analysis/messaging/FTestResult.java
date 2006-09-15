package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;
import java.util.List;

public class FTestResult extends AnalysisResult implements Serializable {

	private static final long serialVersionUID = 1L;
	private List<FTestResultEntry> ftResultEntries;
	private List<SampleGroup> sampleGroups;
	private boolean arePvaluesAdjusted = false; 
	
	public FTestResult(String sessionId, String taskId) {
		super(sessionId, taskId);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean arePvaluesAdjusted() {
		return arePvaluesAdjusted;
	}

	public void setArePvaluesAdjusted(boolean arePvaluesAdjusted) {
		this.arePvaluesAdjusted = arePvaluesAdjusted;
	}

	public List<FTestResultEntry> getResultEntries() {
		return ftResultEntries;
	}

	public void setResultEntries(List<FTestResultEntry> ftResultEntries) {
		this.ftResultEntries = ftResultEntries;
	}

	public List<SampleGroup> getSampleGroups() {
		return sampleGroups;
	}

	public void setSampleGroups(List<SampleGroup> sampleGroups) {
		this.sampleGroups = sampleGroups;
	}

}
