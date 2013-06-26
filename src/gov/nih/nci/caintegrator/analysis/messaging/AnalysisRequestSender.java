/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;


import javax.jms.JMSException;

import gov.nih.nci.caintegrator.exceptions.AnalysisServerException;





public interface AnalysisRequestSender {

	public void sendRequest(AnalysisRequest request) throws JMSException;
	
	public void receiveResult(AnalysisResult analysisResult);
	
	public void receiveException(AnalysisServerException analysisServerException);

}
