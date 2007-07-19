package gov.nih.nci.caintegrator.analysis.messaging;


/**
 * This class is sent back from the analysis server in response 
 * to a lookup request.
 * @author harrismic
 *
 */
public class ExpressionLookupResult extends AnalysisResult {

	private static final long serialVersionUID = 1L;
	
	private DataPointVector dataPoints = null;
	
	public ExpressionLookupResult(String sessionId, String taskId) {
		super(sessionId, taskId);		
	}

	@Override
	public String toString() {
		int numDataPoints = 0;
		if (dataPoints != null) {
		  numDataPoints = dataPoints.size();
		}
		return "ExpressionLookupResult sessionId=" + getSessionId() + " taskId=" + getTaskId() + " numDataPoints=" + numDataPoints; 
	}

	public DataPointVector getDataPoints() {
		return dataPoints;
	}

	public void setDataPoints(DataPointVector dataPoints) {
		this.dataPoints = dataPoints;
	}
	
	public int getNumDataPoints() { 
	  int numDataPoints = 0;
	  if (dataPoints!=null) {
	    numDataPoints = dataPoints.size();
	  }
	  return numDataPoints;
	}
	
	

}
