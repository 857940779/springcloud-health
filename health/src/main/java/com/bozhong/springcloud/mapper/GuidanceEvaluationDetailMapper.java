package com.bozhong.springcloud.mapper;


import com.bozhong.springcloud.domain.dbdo.GuidanceEvaluationDetailDO;

import java.util.List;

/**
 * Created by luohw on 2018/5/9 0009.
 */
public interface GuidanceEvaluationDetailMapper {

    List<GuidanceEvaluationDetailDO> getAll();

    GuidanceEvaluationDetailDO getOne(Long id);

    void addOne(GuidanceEvaluationDetailDO guidanceEvaluationDetailDO);
}
