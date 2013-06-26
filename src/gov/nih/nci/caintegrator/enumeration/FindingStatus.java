/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.enumeration;
/**
 * Comment this
 * @author SahniH
 *
 */




public enum FindingStatus {
	Error, Running, Completed, Email, Retrieving;
	
	//Describe any error or execption message
	String comment;

	/**
	 * @return Returns the comment.
	 */
	public String getComment() {
		return comment;
	}

	/**
	 * @param comment The comment to set.
	 */
	public void setComment(String comment) {
		this.comment = comment;
	}
}
