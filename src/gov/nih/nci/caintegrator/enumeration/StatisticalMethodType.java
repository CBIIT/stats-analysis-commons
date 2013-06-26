/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.enumeration;

import java.io.Serializable;





public enum StatisticalMethodType implements Serializable{ 
	    TTest { 
		public String toString() 
		{ 
			return "T-Test:Two Sample Test";
		}},
       	Wilcoxin { 
		public String toString() 
		{ 
			return "Wilcoxin Test:Mann-Whitney Test";
		} },
       	FTest { 
			public String toString() 
			{ 
				return "F-Test:One Way ANOVA";
			} },
		GLM { 
			public String toString() 
			{ 
				return "Generalized Linear Model with/without covariate adjustment";
			} }	,
		ANOVA { 
			public String toString() 
			{ 
			    return "ANOVA that adjusts for covariates";
			} } 	
	};

