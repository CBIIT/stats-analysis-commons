package gov.nih.nci.caintegrator.analysis.messaging;

public class ExpressionLookupRequest extends AnalysisRequest {

	private ReporterGroup reporters;
	private SampleGroup samples;
	
	public ExpressionLookupRequest(String sessionId, String taskId) {
		super(sessionId, taskId);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

	public ReporterGroup getReporters() {
		return reporters;
	}

	public void setReporters(ReporterGroup reporters) {
		this.reporters = reporters;
	}

	public SampleGroup getSamples() {
		return samples;
	}

	public void setSamples(SampleGroup samples) {
		this.samples = samples;
	}

}
