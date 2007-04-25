package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;
import java.util.List;

public class GeneralizedLinearModelResult extends AnalysisResult implements Serializable {
	
	private static final long serialVersionUID = -1152528513884181284L;	

	/*
	 * list to contain all glm results
	 */
	
	private List<GeneralizedLinearModelResultEntry> glmResultEntries;
	
	/*
	 * the group that compares with baseline group
	 */
	private SampleGroup group1;
	
	/*
	 * the baseline group
	 */
	private SampleGroup baselineGroup;
	
	public GeneralizedLinearModelResult(String sessionId, String taskId) {
		super(sessionId, taskId);
	}
	
	
	public int getNumResultEntries() { 
		  if (glmResultEntries == null) {
		    return 0;
		  }
		  return glmResultEntries.size();
		}
		
	@Override
	public String toString() {
		 return "GLM Analysis Result: sessionId=" + getSessionId() + " taskId=" + getTaskId() + " numResultEntries=" + getNumResultEntries();

	}


	public SampleGroup getBaselineGroup() {
		return baselineGroup;
	}


	public void setBaselineGroup(SampleGroup baselineGroup) {
		this.baselineGroup = baselineGroup;
	}


	public List<GeneralizedLinearModelResultEntry> getGlmResultEntries() {
		return glmResultEntries;
	}


	public void setGlmResultEntries(
			List<GeneralizedLinearModelResultEntry> glmResultEntries) {
		this.glmResultEntries = glmResultEntries;
	}


	public SampleGroup getGroup1() {
		return group1;
	}


	public void setGroup1(SampleGroup group1) {
		this.group1 = group1;
	}
	
	

}
