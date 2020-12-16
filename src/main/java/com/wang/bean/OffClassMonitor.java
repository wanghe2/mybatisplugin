package com.wang.bean;

import java.util.Date;

/**
 * 退班申请
 */
public class OffClassMonitor {

    private Integer id;

    private String studentCode;

    private String studentName;

    private Integer schoolId;

    private String classCode;

    private String teacherCode;

    private String teacherEmail;

    private String teacherName;

    private Date createTime;
   
    //订单状态更新时间
    private Date updateTime;
    
    //订单状态
    private Integer billState;

    private String message;
    
    //教师跟进时间
    private Date submitTime;
   
    //教师跟进状态
    private Integer followStatus;

    //跟进结果所上传的图片链接
    private String imgUrl;
   
    //申请单号
    private String billCode;
 
    //当前进度
    private String progress;

    private String progressMemo;

    private String operator;

    //订单申请时间
    private Date applyTime;
    
    private String deptCode;
    
    private String deptName;
    
    //季度编号
    private String quarterCode;
    
    //季度名称
    private String quarterName;
    
    //学科编号
    private String subjectCode;
    
    //学科名称
    private String subjectName;
    
    //跟进人邮箱
    private String followEmail;
    
    //跟进人姓名
    private String followName;
    
    //开课时间
    private String beginClassDate;
    
    //课程开课财年
    private Integer classFYear;
    /**
     * 是否为新生：   0为新生，1为老生（主要针对初中一对六和初中一对一部门 ，其他部门默认为 0）
     */
    private String oldStudentFlag;
    /**
     * 教师身份：  0为班级教师 ， 1为 咨询师 （针对初中一对六和一对一部门，才可能会存在咨询师身份，其他部门默认都是 教师）
     */
    private String teacherIdentity;
    
    //申请日期起止时间
    private String applyBeginDate;
    private String applyEndDate;
    
    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    private String studentPhone;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    private String className;

    /**
     * 处理状态（未处理、已处理），不入库
     */
    private Integer handleState;

    /**
     * 听课证号
     */
    private String cardCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Integer schoolId) {
        this.schoolId = schoolId;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) {
        this.teacherEmail = teacherEmail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getBillState() {
        return billState;
    }

    public void setBillState(Integer billState) {
        this.billState = billState;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getSubmitTime() {
        return submitTime;
    }

    public void setSubmitTime(Date submitTime) {
        this.submitTime = submitTime;
    }

    public Integer getFollowStatus() {
        return followStatus;
    }

    public void setFollowStatus(Integer followStatus) {
        this.followStatus = followStatus;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode;
    }

    public String getProgress() {
        return progress;
    }

    public void setProgress(String progress) {
        this.progress = progress;
    }

    public String getProgressMemo() {
        return progressMemo;
    }

    public void setProgressMemo(String progressMemo) {
        this.progressMemo = progressMemo;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public Integer getHandleState() {
        return handleState;
    }

    public void setHandleState(Integer handleState) {
        this.handleState = handleState;
    }

    public String getCardCode() {
        return cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getFollowEmail() {
		return followEmail;
	}

	public void setFollowEmail(String followEmail) {
		this.followEmail = followEmail;
	}

	public String getFollowName() {
		return followName;
	}

	public void setFollowName(String followName) {
		this.followName = followName;
	}

	public String getQuarterCode() {
		return quarterCode;
	}

	public void setQuarterCode(String quarterCode) {
		this.quarterCode = quarterCode;
	}

	public String getQuarterName() {
		return quarterName;
	}

	public void setQuarterName(String quarterName) {
		this.quarterName = quarterName;
	}

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getBeginClassDate() {
		return beginClassDate;
	}

	public void setBeginClassDate(String beginClassDate) {
		this.beginClassDate = beginClassDate;
	}

	public Integer getClassFYear() {
		return classFYear;
	}

	public void setClassFYear(Integer classFYear) {
		this.classFYear = classFYear;
	}

	public String getApplyBeginDate() {
		return applyBeginDate;
	}

	public void setApplyBeginDate(String applyBeginDate) {
		this.applyBeginDate = applyBeginDate;
	}

	public String getApplyEndDate() {
		return applyEndDate;
	}

	public void setApplyEndDate(String applyEndDate) {
		this.applyEndDate = applyEndDate;
	}

	public String getOldStudentFlag() {
		return oldStudentFlag;
	}

	public void setOldStudentFlag(String oldStudentFlag) {
		this.oldStudentFlag = oldStudentFlag;
	}

	public String getTeacherIdentity() {
		return teacherIdentity;
	}

	public void setTeacherIdentity(String teacherIdentity) {
		this.teacherIdentity = teacherIdentity;
	}

}
