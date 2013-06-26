/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;

/**
 * This class represents a named group of samples. 
 * It is intended to be used for passing sample groups to
 * statistical methods in the analysis module.
 * 
 * @author Michael A. Harris
 *
 */




public class SampleGroup extends IdGroup implements Serializable {

	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create a sample group with no group name and default initial size
	 *
	 */
	public SampleGroup() {
	  this("");
	}
	
	/**
	 * Create a sample group using the default initial size of 50.
	 * @param groupName
	 */
	public SampleGroup(String groupName) {
		this(groupName, 50);
	}
	
	/**
	 * Create a sample group with a given initial size
	 * @param groupName
	 * @param initialSize
	 */
	public SampleGroup(String groupName, int initialSize) {
		super(groupName, initialSize);
	}
	
}
