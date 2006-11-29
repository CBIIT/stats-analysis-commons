package gov.nih.nci.caintegrator.analysis.messaging;

public class ClassComparisonLookupRequest extends ClassComparisonRequest {

	private static final long serialVersionUID = 1L;

	private ReporterGroup reporterGroup = null;
	
	
	public ClassComparisonLookupRequest(String sessionid, String taskId) {
		super(sessionid, taskId);
		
	}


	public ReporterGroup getReporterGroup() {
		return reporterGroup;
	}


	public void setReporterGroup(ReporterGroup reporterGroup) {
		this.reporterGroup = reporterGroup;
	}
	
	

}
