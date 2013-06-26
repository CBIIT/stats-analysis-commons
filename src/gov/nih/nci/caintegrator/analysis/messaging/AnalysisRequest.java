/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;
/**
 * Base class for all analysis requests. 
 * Stores session and task ids as well as elapsed compute time.
 * 
 * @author Michael A. Harris
 *
 */




public abstract class AnalysisRequest implements java.io.Serializable {

	private String sessionId; 
	private String taskId;
	
	private String dataFileName = null;
	
	private long requestStartTime = 0L;     //for perfomance metrics
	private long requestCompleteTime = 0L;  //for performance metrics
	
	public AnalysisRequest(String sessionId, String taskId) {
	  super();
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

	public long getRequestStartTime() {
		return requestStartTime;
	}

	public void setRequestStartTime(long requestStartTime) {
		this.requestStartTime = requestStartTime;
	}

	public long getRequestCompleteTime() {
		return requestCompleteTime;
	}

	public void setRequestCompleteTime(long requestEndTime) {
		this.requestCompleteTime = requestEndTime;
	}
	
	public long getElapsedTime() { return requestCompleteTime - requestStartTime; }

	/**
	 * Get the data file to be used to satisfy this request
	 * @return
	 */
	public String getDataFileName() {
		return dataFileName;
	}

	/**
	 * Set the data file to be used as input to the analysis
	 * @param dataFileName
	 */
	public void setDataFileName(String dataFileName) {
		this.dataFileName = dataFileName;
	}

}
