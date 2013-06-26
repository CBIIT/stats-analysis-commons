/*L
 *  Copyright SAIC
 *
 *  Distributed under the OSI-approved BSD 3-Clause License.
 *  See http://ncip.github.com/stats-analysis-commons/LICENSE.txt for details.
 */

package gov.nih.nci.caintegrator.enumeration;

import java.awt.Color;





public enum GenderType {
M { public Color getColor() { return Color.BLUE; }}, 
F {public Color getColor() { return Color.PINK; }},
O {public Color getColor() { return Color.DARK_GRAY; }};

public abstract Color getColor();

}
