/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;


import gov.nih.nci.caintegrator.exceptions.AnalysisServerException;





public interface AnalysisResultSender {

	public void sendResult(AnalysisResult result);

	public void sendException(AnalysisServerException ex);
}
