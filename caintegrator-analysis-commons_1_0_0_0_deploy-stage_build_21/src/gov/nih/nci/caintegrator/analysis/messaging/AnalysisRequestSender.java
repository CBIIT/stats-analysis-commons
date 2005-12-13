package gov.nih.nci.caintegrator.analysis.messaging;


import javax.jms.JMSException;

import gov.nih.nci.caintegrator.exceptions.AnalysisServerException;

public interface AnalysisRequestSender {

	public void sendRequest(AnalysisRequest request) throws JMSException;
	
	public void receiveResult(AnalysisResult analysisResult);
	
	public void receiveException(AnalysisServerException analysisServerException);

}
