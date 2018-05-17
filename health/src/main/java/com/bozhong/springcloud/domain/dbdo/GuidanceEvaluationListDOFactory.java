package com.bozhong.springcloud.domain.dbdo;

import java.util.Date;

/**
 * Created by luohw on 2018/5/9 0009.
 */
public class GuidanceEvaluationListDOFactory {

    public static GuidanceEvaluationListDO getDefaultDO(){
        GuidanceEvaluationListDO guidanceEvaluationListDO=new GuidanceEvaluationListDO();
        guidanceEvaluationListDO.setHospitalId(1L);
        guidanceEvaluationListDO.setHospitalName("测试医院");
        guidanceEvaluationListDO.setHospCompoundId(100L);
        guidanceEvaluationListDO.setHospCompoundName("测试院区A");
        guidanceEvaluationListDO.setDeptId(1000L);
        guidanceEvaluationListDO.setDeptName("测试科室1");
        guidanceEvaluationListDO.setWardId(10000L);
        guidanceEvaluationListDO.setWardName("测试病区abc123");
        guidanceEvaluationListDO.setBedId(10086L);
        guidanceEvaluationListDO.setBedName("01");
        guidanceEvaluationListDO.setAdmissionId("abc123456");
        guidanceEvaluationListDO.setPatientInHospId(10010L);
        guidanceEvaluationListDO.setName("测试病人");
        guidanceEvaluationListDO.setSex((byte)1);
        return guidanceEvaluationListDO;
    }


    public static GuidanceEvaluationDetailDO getDefaultDetail(){
        GuidanceEvaluationDetailDO guidanceEvaluationDetailDO=new GuidanceEvaluationDetailDO();
        guidanceEvaluationDetailDO.setEduObject("0|1");
        guidanceEvaluationDetailDO.setEduDate(new Date());
        guidanceEvaluationDetailDO.setEducator("test");
        guidanceEvaluationDetailDO.setEduContent("test"+System.currentTimeMillis());
        guidanceEvaluationDetailDO.setName("测试病人");
        guidanceEvaluationDetailDO.setEduType("aaaa");
        return guidanceEvaluationDetailDO;
    }
}
