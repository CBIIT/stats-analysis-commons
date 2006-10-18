package gov.nih.nci.caintegrator.analysis.messaging;

public class ExpressionLookupRequest extends AnalysisRequest {

	private ReporterGroup reporters;
	private SampleGroup samples;

	
	public ExpressionLookupRequest(String sessionId, String taskId) {
		super(sessionId, taskId);		
	}

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		int numReporters = -1;
		if (reporters!=null) {
		  numReporters = reporters.size();
		}
		int numSamples = -1;
		if (samples!=null) {
		  numSamples = samples.size();
		}		
		return "ExpressionLookupRequest sessionId=" + getSessionId() + " taskId=" + getTaskId() + " numReportersRequested=" + numReporters + " numSamplesRequested=" + numSamples;
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
