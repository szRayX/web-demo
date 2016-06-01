package com.ray.springmvc.controller;

import com.alibaba.fastjson.JSON;
import com.ray.springmvc.biz.CollegeAdmissionManager;
import com.ray.springmvc.dao.CollegeAdmissionMapperAuto;
import com.ray.springmvc.po.CollegeAdmissionPO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created on 2016/5/31.
 *
 * @author 薛磊
 * @since 1.0.0
 */
@Controller
@RequestMapping("/springmvc")
public class ShowController {
    @Resource
    CollegeAdmissionManager collegeAdmissionManager;

    @Resource
    HttpServletRequest request;

    @RequestMapping("/show")
    public String show(Long id, Model model){
//        Long id = Long.valueOf(request.getParameter("id"));
        CollegeAdmissionPO user = collegeAdmissionManager.get(id);
        model.addAttribute("msg", JSON.toJSONString(user));
        return "springmvc/show";
    }
}
