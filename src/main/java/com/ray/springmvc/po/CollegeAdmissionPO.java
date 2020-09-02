/**
 * @(#)CollegeAdmissionPO.java  
 *
 * Copyright (c) 2014-2014   版权所有
 * test. All rights reserved.
 *
 * This software is the confidential and proprietary
 * information of  test.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with test.
 */
package com.ray.springmvc.po;

import com.ray.base.BasePO;

/**
 * Created by 薛磊 on 2016-05-03 14:55:06.
 * @author 薛磊
 */
public class CollegeAdmissionPO extends BasePO {


/**
 * 主键,
 */
private  Long   id;

/**
 * 学校ID,
 */
private  Long   collegeId;

/**
 * 科类,
 */
private  String   classType;

/**
 * 年份,
 */
private  String   year;

/**
 * 最高分,
 */
private  Double   hignestScore;

/**
 * 平均分,
 */
private  Double   averageScore;

/**
 * 平均分线差,
 */
private  Double   averageScoreDifference;

/**
 * 投档线差,
 */
private  Double   submitLineDifference;

/**
 * 最低分,
 */
private  Double   lowestScore;

/**
 * 录取人数,
 */
private  Integer   admissionOffers;

/**
 * 录取批次,
 */
private  String   admissionTier;



public Long getId() {
return this.id;
}

public void setId(Long  id) {
this.id = id;
}

public Long getCollegeId() {
return this.collegeId;
}

public void setCollegeId(Long  collegeId) {
this.collegeId = collegeId;
}

public String getClassType() {
return this.classType;
}

public void setClassType(String  classType) {
this.classType = classType;
}

public String getYear() {
return this.year;
}

public void setYear(String  year) {
this.year = year;
}

public Double getHignestScore() {
return this.hignestScore;
}

public void setHignestScore(Double  hignestScore) {
this.hignestScore = hignestScore;
}

public Double getAverageScore() {
return this.averageScore;
}

public void setAverageScore(Double  averageScore) {
this.averageScore = averageScore;
}

public Double getAverageScoreDifference() {
return this.averageScoreDifference;
}

public void setAverageScoreDifference(Double  averageScoreDifference) {
this.averageScoreDifference = averageScoreDifference;
}

    public Double getSubmitLineDifference() {
        return submitLineDifference;
    }

    public void setSubmitLineDifference(Double submitLineDifference) {
        this.submitLineDifference = submitLineDifference;
    }

    public Double getLowestScore() {
return this.lowestScore;
}

public void setLowestScore(Double  lowestScore) {
this.lowestScore = lowestScore;
}

public Integer getAdmissionOffers() {
return this.admissionOffers;
}

public void setAdmissionOffers(Integer  admissionOffers) {
this.admissionOffers = admissionOffers;
}

public String getAdmissionTier() {
return this.admissionTier;
}

public void setAdmissionTier(String  admissionTier) {
this.admissionTier = admissionTier;
}

}