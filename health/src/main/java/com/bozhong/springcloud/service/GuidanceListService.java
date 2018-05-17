package com.bozhong.springcloud.service;

import com.bozhong.springcloud.domain.dbdo.GuidanceEvaluationListDO;
import com.bozhong.springcloud.domain.request.GuidanceEvaluationReqDTO;

/**
 * Created by luohw on 2018/5/9 0009.
 */
public interface GuidanceListService {

     void addGuidanceList(GuidanceEvaluationReqDTO guidanceEvaluationReqDTO);
}
