/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.analysis.messaging;

import java.io.Serializable;
import java.util.*;

/**
 * This class represents a group of ids. The subclasses ReporterGroup
 * and SampleGroup implement this class.
 * 
 * @author Michael A. Harris
 *
 */




public class IdGroup extends LinkedHashSet<String> implements Serializable {

    private static final long serialVersionUID = 1L;
	
	private String groupName;
	
	public IdGroup(String groupName) {
	  this.groupName = groupName;
	}
	
	public IdGroup(String groupName, int initialSize) {
		super(initialSize);
		this.groupName = groupName;
	}
	
	/**
	 * Get the reporter group name
	 * @return
	 */
	public String getGroupName() { return groupName; }
	
	/**
	 * Set the reporter group name
	 * @param groupName
	 */
	public void setGroupName(String groupName) { 
      this.groupName = groupName;
	}
	
	/** 
	 * Get the list of ids contained in this group as a comma delimited string
	 * This is often used when generating dynamic R commands
	 * @return
	 */
	public String getIdsAsCommaDelimitedString() {
		StringBuffer sb = new StringBuffer();
		for (Iterator i = this.iterator(); i.hasNext(); ) {
		  sb.append((String)i.next());
		  if (i.hasNext()) {
		    sb.append(",");
		  }
		}
		return sb.toString();
	}
	
	public String toString() {
	  return groupName + " size=" + size();	
	}
	
	/**
	 * 
	 * @param groupToCheck
	 * @return true if this group contains any of the members in groupToCheck
	 * 		   false otherwise
	 */
	public boolean containsAny(IdGroup groupToCheck) {
		
	   if (groupToCheck == null) { 
	      return false;
	   }
		
	   for (String id : groupToCheck) {
	      if (contains(id)) return true;
	   }
	   
	   return false;
	   
	}

}
