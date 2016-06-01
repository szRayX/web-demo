/**
 * @(#)CollegeAdmissionManager.java
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

import com.ray.springmvc.domain.Passport;
import com.ray.springmvc.po.CollegeAdmissionPO;

/**
 * Created by 薛磊 on 2016-05-03 14:55:06.
 *
 * @author 薛磊
 */
public interface CollegeAdmissionManager {
    public CollegeAdmissionPO get(Long id);
}
