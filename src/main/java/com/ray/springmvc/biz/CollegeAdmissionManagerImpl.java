/**
 * @(#)CollegeAdmissionManagerImpl.java
 *
 * Copyright (c) 2014-2014  苏州犀牛网络科技有限公司 版权所有
 * xiniunet. All rights reserved.
 *
 * This software is the confidential and proprietary
 * information of  xiniunet.
 * ("Confidential Information"). You shall not disclose
 * such Confidential Information and shall use it only
 * in accordance with the terms of the contract agreement
 * you entered into with xiniunet.
 */
package com.ray.springmvc.biz;

import com.ray.springmvc.dao.CollegeAdmissionMapperAuto;
import com.ray.springmvc.domain.Passport;
import com.ray.springmvc.po.CollegeAdmissionPO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by 薛磊 on 2016-05-03 14:55:06.
 *
 * @author 薛磊
 */
@Transactional
@Service("Another.ExaminationCollegeAdmissionManager")
public class CollegeAdmissionManagerImpl implements CollegeAdmissionManager {
    @Resource
    CollegeAdmissionMapperAuto dao;

    @Override
    @Transactional(readOnly = true)
    public CollegeAdmissionPO get(Long id) {
        return dao.getById(id);
    }
}
