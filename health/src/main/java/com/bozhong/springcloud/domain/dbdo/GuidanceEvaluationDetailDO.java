package com.bozhong.springcloud.domain.dbdo;

import java.io.Serializable;
import java.util.Date;

public class GuidanceEvaluationDetailDO implements Serializable {

	/**
	 *主键，自增id
	 */
	private Long id;

	/**
	 *评估单列表id
	 */
	private Long listId;

	/**
	 *教育对象,0|1格式 0-患者，1-家长
	 */
	private String eduObject;

	/**
	 *教育时间
	 */
	private Date eduDate;

	/**
	 *教育者
	 */
	private String educator;

	/**
	 *教育内容
	 */
	private String eduContent;

	/**
	 *病人姓名
	 */
	private String name;

	/**
	 *教育项目
	 */
	private String eduType;

	/**
	 *教育方法。0-口述，1-书面，2-在线，3-示范。多种以|分隔
	 */
	private String eduMethod;

	/**
	 *评估时间
	 */
	private Date evalDate;

	/**
	 *教育评估,0-能理解，1-会演示，2-需强化。多个以|分隔
	 */
	private String eduEvaluate;

	/**
	 *评估者
	 */
	private String evaluator;

	/**
	 *再教育时间
	 */
	private Date reeduDate;

	/**
	 *再教育者
	 */
	private String reeducator;

	/**
	 *发送状态（0-成功，1-失败）
	 */
	private Byte sendStatus;

	/**
	 *推送课程id
	 */
	private Long classId;

	/**
	 *是否原始数据，1-是，0-否
	 */
	private Byte orginData;

	/**
	 *宣教分类key
	 */
	private String eduTypeKey;

	/**
	 *有效标识，1-有效，0-无效
	 */
	private Byte validFlag;

	/**
	 *创建时间
	 */
	private Date createTime;

	/**
	 *创建人id
	 */
	private Long createBy;

	/**
	 *更新时间
	 */
	private Date updateTime;

	/**
	 *更新人id
	 */
	private Long updateBy;

	/**
	 *主键，自增id setter方法
	 */
	public void setId(Long id){
		this.id = id;
	}

	/**
	 *主键，自增id getter方法
	 */
	public Long getId(){
		return id;
	}

	/**
	 *评估单列表id setter方法
	 */
	public void setListId(Long listId){
		this.listId = listId;
	}

	/**
	 *评估单列表id getter方法
	 */
	public Long getListId(){
		return listId;
	}

	/**
	 *教育对象,0|1格式 0-患者，1-家长 setter方法
	 */
	public void setEduObject(String eduObject){
		this.eduObject = eduObject;
	}

	/**
	 *教育对象,0|1格式 0-患者，1-家长 getter方法
	 */
	public String getEduObject(){
		return eduObject;
	}

	/**
	 *教育时间 setter方法
	 */
	public void setEduDate(Date eduDate){
		this.eduDate = eduDate;
	}

	/**
	 *教育时间 getter方法
	 */
	public Date getEduDate(){
		return eduDate;
	}

	/**
	 *教育者 setter方法
	 */
	public void setEducator(String educator){
		this.educator = educator;
	}

	/**
	 *教育者 getter方法
	 */
	public String getEducator(){
		return educator;
	}

	/**
	 *教育内容 setter方法
	 */
	public void setEduContent(String eduContent){
		this.eduContent = eduContent;
	}

	/**
	 *教育内容 getter方法
	 */
	public String getEduContent(){
		return eduContent;
	}

	/**
	 *病人姓名 setter方法
	 */
	public void setName(String name){
		this.name = name;
	}

	/**
	 *病人姓名 getter方法
	 */
	public String getName(){
		return name;
	}

	/**
	 *教育项目 setter方法
	 */
	public void setEduType(String eduType){
		this.eduType = eduType;
	}

	/**
	 *教育项目 getter方法
	 */
	public String getEduType(){
		return eduType;
	}

	/**
	 *教育方法。0-口述，1-书面，2-在线，3-示范。多种以|分隔 setter方法
	 */
	public void setEduMethod(String eduMethod){
		this.eduMethod = eduMethod;
	}

	/**
	 *教育方法。0-口述，1-书面，2-在线，3-示范。多种以|分隔 getter方法
	 */
	public String getEduMethod(){
		return eduMethod;
	}

	/**
	 *评估时间 setter方法
	 */
	public void setEvalDate(Date evalDate){
		this.evalDate = evalDate;
	}

	/**
	 *评估时间 getter方法
	 */
	public Date getEvalDate(){
		return evalDate;
	}

	/**
	 *教育评估,0-能理解，1-会演示，2-需强化。多个以|分隔 setter方法
	 */
	public void setEduEvaluate(String eduEvaluate){
		this.eduEvaluate = eduEvaluate;
	}

	/**
	 *教育评估,0-能理解，1-会演示，2-需强化。多个以|分隔 getter方法
	 */
	public String getEduEvaluate(){
		return eduEvaluate;
	}

	/**
	 *评估者 setter方法
	 */
	public void setEvaluator(String evaluator){
		this.evaluator = evaluator;
	}

	/**
	 *评估者 getter方法
	 */
	public String getEvaluator(){
		return evaluator;
	}

	/**
	 *再教育时间 setter方法
	 */
	public void setReeduDate(Date reeduDate){
		this.reeduDate = reeduDate;
	}

	/**
	 *再教育时间 getter方法
	 */
	public Date getReeduDate(){
		return reeduDate;
	}

	/**
	 *再教育者 setter方法
	 */
	public void setReeducator(String reeducator){
		this.reeducator = reeducator;
	}

	/**
	 *再教育者 getter方法
	 */
	public String getReeducator(){
		return reeducator;
	}

	/**
	 *发送状态（0-成功，1-失败） setter方法
	 */
	public void setSendStatus(Byte sendStatus){
		this.sendStatus = sendStatus;
	}

	/**
	 *发送状态（0-成功，1-失败） getter方法
	 */
	public Byte getSendStatus(){
		return sendStatus;
	}

	/**
	 *推送课程id setter方法
	 */
	public void setClassId(Long classId){
		this.classId = classId;
	}

	/**
	 *推送课程id getter方法
	 */
	public Long getClassId(){
		return classId;
	}

	/**
	 *是否原始数据，1-是，0-否 setter方法
	 */
	public void setOrginData(Byte orginData){
		this.orginData = orginData;
	}

	/**
	 *是否原始数据，1-是，0-否 getter方法
	 */
	public Byte getOrginData(){
		return orginData;
	}

	/**
	 *宣教分类key setter方法
	 */
	public void setEduTypeKey(String eduTypeKey){
		this.eduTypeKey = eduTypeKey;
	}

	/**
	 *宣教分类key getter方法
	 */
	public String getEduTypeKey(){
		return eduTypeKey;
	}

	/**
	 *有效标识，1-有效，0-无效 setter方法
	 */
	public void setValidFlag(Byte validFlag){
		this.validFlag = validFlag;
	}

	/**
	 *有效标识，1-有效，0-无效 getter方法
	 */
	public Byte getValidFlag(){
		return validFlag;
	}

	/**
	 *创建时间 setter方法
	 */
	public void setCreateTime(Date createTime){
		this.createTime = createTime;
	}

	/**
	 *创建时间 getter方法
	 */
	public Date getCreateTime(){
		return createTime;
	}

	/**
	 *创建人id setter方法
	 */
	public void setCreateBy(Long createBy){
		this.createBy = createBy;
	}

	/**
	 *创建人id getter方法
	 */
	public Long getCreateBy(){
		return createBy;
	}

	/**
	 *更新时间 setter方法
	 */
	public void setUpdateTime(Date updateTime){
		this.updateTime = updateTime;
	}

	/**
	 *更新时间 getter方法
	 */
	public Date getUpdateTime(){
		return updateTime;
	}

	/**
	 *更新人id setter方法
	 */
	public void setUpdateBy(Long updateBy){
		this.updateBy = updateBy;
	}

	/**
	 *更新人id getter方法
	 */
	public Long getUpdateBy(){
		return updateBy;
	}



}
