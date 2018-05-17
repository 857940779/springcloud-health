package com.bozhong.springcloud.mapper;


import com.bozhong.springcloud.domain.dbdo.GuidanceEvaluationListDO;

import java.util.List;

/**
 * Created by luohw on 2018/5/2 0002.
 */
public interface GuidanceEvaluationListMapper {

    //分页
    List<GuidanceEvaluationListDO> getAll();

    GuidanceEvaluationListDO getOne(Long id);

    void addOne(GuidanceEvaluationListDO guidanceEvaluationListDO);
}
