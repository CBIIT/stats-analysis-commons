/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.enumeration;

import java.io.Serializable;





public enum ArrayPlatformType implements Serializable{
AFFY_OLIGO_PLATFORM {
	public String toString()
	{ 
		return "Affymetrix Oligo Expression Arrays";
	}},
CDNA_ARRAY_PLATFORM {
	public String toString()
	{ 
		return "cDNA arrays";
	}},
ALL_PLATFORM {
	public String toString()
	{ 
		return "all";
	}},
ARRAY_CGH {
	public String toString()
	{ 
		return "ArrayCGH";
	}},
AGILENT {
    public String toString()
     { 
        return "Agilent";
     }},
AFFY_100K_SNP_ARRAY {
		public String toString()
		{ 
			return "Affymetrix 100K SNP Arrays";
		}},
UNIFIED_GENE {
	public String toString()
	{ 
		return "Unified Gene";
	}}
}
