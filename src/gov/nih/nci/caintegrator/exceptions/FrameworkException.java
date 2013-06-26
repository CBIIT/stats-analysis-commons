/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.exceptions;





public class FrameworkException extends Throwable {

	private static final long serialVersionUID = 1L;

	public FrameworkException(String string) {
		super(string);
	}
	public FrameworkException(Throwable exception) {
	    super(exception);
	}
}
