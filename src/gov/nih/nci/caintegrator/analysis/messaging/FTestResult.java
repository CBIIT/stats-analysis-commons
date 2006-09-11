package gov.nih.nci.caintegrator.analysis.messaging;

import java.util.List;

public class FTestResult extends AnalysisResult {

	private static final long serialVersionUID = 1L;
	private List<FtestResultEntry> ftResultEntries;
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

	public List<FtestResultEntry> getFtResultEntries() {
		return ftResultEntries;
	}

	public void setFtResultEntries(List<FtestResultEntry> ftResultEntries) {
		this.ftResultEntries = ftResultEntries;
	}

	public List<SampleGroup> getSampleGroups() {
		return sampleGroups;
	}

	public void setSampleGroups(List<SampleGroup> sampleGroups) {
		this.sampleGroups = sampleGroups;
	}

}
