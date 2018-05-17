package com.bozhong.springcloud.domain.request;


import java.util.List;

/**
 * Created by Administrator on 2017/12/27 0027.
 */
public class GuidanceEvaluationReqDTO {
    private Long hospitalId;        //医院id
    private String admissionId;     //住院号
    private String appName;         //调用方系统名称
    private Long nurseId;       //推送护士id
    private Long patientInHospId;       //病人住院id
    private List<Long> pushCoursIdList;     //推送课程id列表
    private Integer type;       //1-实时生成，2-出院生成

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public List<Long> getPushCoursIdList() {
        return pushCoursIdList;
    }

    public void setPushCoursIdList(List<Long> pushCoursIdList) {
        this.pushCoursIdList = pushCoursIdList;
    }

    public Long getNurseId() {
        return nurseId;
    }

    public void setNurseId(Long nurseId) {
        this.nurseId = nurseId;
    }

    public Long getPatientInHospId() {
        return patientInHospId;
    }

    public void setPatientInHospId(Long patientInHospId) {
        this.patientInHospId = patientInHospId;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Long getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(Long hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getAdmissionId() {
        return admissionId;
    }

    public void setAdmissionId(String admissionId) {
        this.admissionId = admissionId;
    }

}
