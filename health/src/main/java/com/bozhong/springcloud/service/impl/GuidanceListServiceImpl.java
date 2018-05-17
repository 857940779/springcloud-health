package com.bozhong.springcloud.service.impl;

import com.bozhong.springcloud.domain.dbdo.GuidanceEvaluationDetailDO;
import com.bozhong.springcloud.domain.dbdo.GuidanceEvaluationListDO;
import com.bozhong.springcloud.domain.dbdo.GuidanceEvaluationListDOFactory;
import com.bozhong.springcloud.domain.request.GuidanceEvaluationReqDTO;
import com.bozhong.springcloud.mapper.GuidanceEvaluationDetailMapper;
import com.bozhong.springcloud.mapper.GuidanceEvaluationListMapper;
import com.bozhong.springcloud.service.GuidanceListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * Created by luohw on 2018/5/9 0009.
 */

@Component
public class GuidanceListServiceImpl implements GuidanceListService {
    @Autowired
    GuidanceEvaluationListMapper guidanceEvaluationListMapper;
    @Autowired
    GuidanceEvaluationDetailMapper guidanceEvaluationDetailMapper;


    @Transactional(isolation = Isolation.READ_COMMITTED,propagation = Propagation.REQUIRED)
    @Override
    public void addGuidanceList(GuidanceEvaluationReqDTO guidanceEvaluationReqDTO) {
        //将dto转换为do，此处不做处理，只是模拟开启事务插入数据
        GuidanceEvaluationListDO guidanceEvaluationListDO= GuidanceEvaluationListDOFactory.getDefaultDO();

        guidanceEvaluationListMapper.addOne(guidanceEvaluationListDO);
        for(int i=0;i<10;i++){
            GuidanceEvaluationDetailDO guidanceEvaluationDetailDO=GuidanceEvaluationListDOFactory.getDefaultDetail();
            guidanceEvaluationDetailDO.setListId(guidanceEvaluationListDO.getId());
            guidanceEvaluationDetailMapper.addOne(guidanceEvaluationDetailDO);
        }

    }
}
