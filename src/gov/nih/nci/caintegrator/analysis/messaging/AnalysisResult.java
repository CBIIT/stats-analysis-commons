package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;

/**
 * Base class for all analysis results. Stores session and task ids.
 * 
 * @author Michael A. Harris
 *
 */

public abstract class AnalysisResult implements Serializable {

	private String sessionId;
	private String taskId;
	
	public AnalysisResult(String sessionId, String taskId) {
	  this.sessionId = sessionId;
	  this.taskId = taskId;
	}
	
	public String getSessionId() {
		return sessionId;
	}

	public String getTaskId() {
		return taskId;
	}
	
	public abstract String toString();
}
