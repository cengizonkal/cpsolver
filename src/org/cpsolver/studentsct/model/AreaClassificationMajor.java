package org.cpsolver.studentsct.model;

import org.cpsolver.ifs.util.ToolBox;

/**
 * Academic area, classification, and major code. This class is used for
 * {@link Student#getAreaClassificationMajors()}. <br>
 * <br>
 * 
 * @version StudentSct 1.3 (Student Sectioning)<br>
 *          Copyright (C) 2007 - 2014 Tomas Muller<br>
 *          <a href="mailto:muller@unitime.org">muller@unitime.org</a><br>
 *          <a href="http://muller.unitime.org">http://muller.unitime.org</a><br>
 * <br>
 *          This library is free software; you can redistribute it and/or modify
 *          it under the terms of the GNU Lesser General Public License as
 *          published by the Free Software Foundation; either version 3 of the
 *          License, or (at your option) any later version. <br>
 * <br>
 *          This library is distributed in the hope that it will be useful, but
 *          WITHOUT ANY WARRANTY; without even the implied warranty of
 *          MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *          Lesser General Public License for more details. <br>
 * <br>
 *          You should have received a copy of the GNU Lesser General Public
 *          License along with this library; if not see
 *          <a href='http://www.gnu.org/licenses/'>http://www.gnu.org/licenses/</a>.
 */
public class AreaClassificationMajor {
    private String iArea, iClassification, iMajor, iConcentration;
    private String iAreaName, iClassificationName, iMajorName, iConcentrationName;
    private Double iWeight;

    /**
     * Constructor
     * 
     * @param area academic area
     * @param classification academic classification
     * @param major major
     */
    public AreaClassificationMajor(String area, String classification, String major) {
        iArea = area;
        iClassification = classification;
        iMajor = major;
    }
    
    /**
     * Constructor
     * 
     * @param area academic area
     * @param classification academic classification
     * @param major major
     * @param concentration concentration (optional)
     */
    public AreaClassificationMajor(String area, String classification, String major, String concentration) {
        iArea = area;
        iClassification = classification;
        iMajor = major;
        iConcentration = concentration;
    }
    
    /**
     * Constructor
     * 
     * @param area academic area
     * @param classification academic classification
     * @param major major
     * @param concentration concentration (optional)
     * @param weight weight (optional)
     */
    public AreaClassificationMajor(String area, String classification, String major, String concentration, Double weight) {
        iArea = area;
        iClassification = classification;
        iMajor = major;
        iConcentration = concentration;
        iWeight = weight;
    }
    
    /**
     * Constructor
     * 
     * @param areaCode academic area abbreviation
     * @param areaName academic area name
     * @param classificationCode academic classificationCode
     * @param classificationName academic classificationName
     * @param majorCode major code
     * @param majorName major name
     */
    public AreaClassificationMajor(String areaCode, String areaName, String classificationCode, String classificationName, String majorCode, String majorName) {
        iArea = areaCode;
        iAreaName = areaName;
        iClassification = classificationCode;
        iClassificationName = classificationName;
        iMajor = majorCode;
        iMajorName = majorName;
    }
    
    /**
     * Constructor
     * 
     * @param areaCode academic area abbreviation
     * @param areaName academic area name
     * @param classificationCode academic classificationCode
     * @param classificationName academic classificationName
     * @param majorCode major code
     * @param majorName major name
     * @param concentrationCode concentration (optional)
     * @param concentrationName concentration (optional)
     */
    public AreaClassificationMajor(String areaCode, String areaName, String classificationCode, String classificationName, String majorCode, String majorName, String concentrationCode, String concentrationName) {
        iArea = areaCode;
        iAreaName = areaName;
        iClassification = classificationCode;
        iClassificationName = classificationName;
        iMajor = majorCode;
        iMajorName = majorName;
        iConcentration = concentrationCode;
        iConcentrationName = concentrationName;
    }
    
    /**
     * Constructor
     * 
     * @param areaCode academic area abbreviation
     * @param areaName academic area name
     * @param classificationCode academic classificationCode
     * @param classificationName academic classificationName
     * @param majorCode major code
     * @param majorName major name
     * @param concentrationCode concentration (optional)
     * @param concentrationName concentration (optional)
     * @param weight weight (optional)
     */
    public AreaClassificationMajor(String areaCode, String areaName, String classificationCode, String classificationName, String majorCode, String majorName, String concentrationCode, String concentrationName, Double weight) {
        iArea = areaCode;
        iAreaName = areaName;
        iClassification = classificationCode;
        iClassificationName = classificationName;
        iMajor = majorCode;
        iMajorName = majorName;
        iConcentration = concentrationCode;
        iConcentrationName = concentrationName;
        iWeight = weight;
    }

    /** Academic area 
     * @return academic area abbreviation
     **/
    public String getArea() {
        return iArea;
    }

    /** Academic classification 
     * @return classification code
     **/
    public String getClassification() {
        return iClassification;
    }
    
    /** Major 
     * @return major code
     **/
    public String getMajor() {
        return iMajor;
    }
    
    /** Concentration (optional)
     * @return concentration code
     **/
    public String getConcentration() {
        return iConcentration;
    }
    
    /** Academic area  name
     * @return academic area name
     **/
    public String getAreaName() {
        return iAreaName;
    }

    /** Academic classification name
     * @return classification name
     **/
    public String getClassificationName() {
        return iClassificationName;
    }
    
    /** Major name
     * @return major name
     **/
    public String getMajorName() {
        return iMajorName;
    }
    
    /** Concentration (optional)
     * @return concentration name
     **/
    public String getConcentrationName() {
        return iConcentrationName;
    }
    
    /** Weight (optional, defaults to 1.0)
     */
    public double getWeight() { return iWeight == null ? 1.0 : iWeight.doubleValue(); }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof AreaClassificationMajor))
            return false;
        AreaClassificationMajor acm = (AreaClassificationMajor) o;
        return ToolBox.equals(acm.getArea(), getArea()) && ToolBox.equals(acm.getClassification(), getClassification()) && ToolBox.equals(acm.getMajor(), getMajor());
    }

    @Override
    public String toString() {
        return getArea() + "/" + getMajor() + " " + getClassification();
    }
}
