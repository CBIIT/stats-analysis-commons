/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;

/**
 * This is the request object to be used for looking up expression values
 * from a data file.
 * @author harrismic
 *
 */
public class CopyNumberLookupRequest extends AnalysisRequest {

	private ReporterGroup reporters;
	private SampleGroup samples;
	//the data file to use comes from the parent class
	
	public CopyNumberLookupRequest(String sessionId, String taskId) {
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
