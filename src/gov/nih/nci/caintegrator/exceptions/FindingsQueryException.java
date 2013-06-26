/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.exceptions;





public class FindingsQueryException extends FrameworkException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public FindingsQueryException(String string) {
		super(string);
	}
    
    public FindingsQueryException(Throwable e) {
        super(e);
    }

}
