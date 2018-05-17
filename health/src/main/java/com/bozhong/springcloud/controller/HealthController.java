package com.bozhong.springcloud.controller;

import com.bozhong.springcloud.domain.request.GuidanceEvaluationReqDTO;
import com.bozhong.springcloud.service.GuidanceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by luohw on 2018/5/9 0009.
 */

@RestController
public class HealthController {
    @Autowired
    GuidanceListService guidanceListService;


    @RequestMapping("/index")
    public String index() {
        return "hello world，your server is OK";
    }


    @RequestMapping(value = "/addOne",method = RequestMethod.POST)
    public String addOne(GuidanceEvaluationReqDTO guidanceEvaluationReqDTO){
        guidanceListService.addGuidanceList(guidanceEvaluationReqDTO);
        return "操作成功";
    }
}
