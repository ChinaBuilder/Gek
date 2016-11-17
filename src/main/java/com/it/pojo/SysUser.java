package com.it.pojo;

import java.util.Date;

public class SysUser {
	private Long sysUserId;
	private String sysUserLoginName;
	private String sysUserLoginPassword;
	private String sysUserStatus;
	private String sysUserIsDelete;
	private Date sysUserRegisterDatetime;
	private String sysUserRegisterSource;
	private String sysUserType;
	private String sysUserSex;
	private String sysUserIsEmailActive;
	private String sysUserIsMobileActive;
	private String sysUserRegisterType;
	private String sysUserPayPasswrod;
	private String sysUserIcon;
	private String sysUserRealName;
	private String sysUserEmail;
	private String sysUserMobile;
	private String sysUserWeiboId;
	private String sysUserQqId;

	public Long getSysUserId() {
		return sysUserId;
	}

	public void setSysUserId(Long sysUserId) {
		this.sysUserId = sysUserId;
	}

	public String getSysUserLoginName() {
		return sysUserLoginName;
	}

	public void setSysUserLoginName(String sysUserLoginName) {
		this.sysUserLoginName = sysUserLoginName;
	}

	public String getSysUserLoginPassword() {
		return sysUserLoginPassword;
	}

	public void setSysUserLoginPassword(String sysUserLoginPassword) {
		this.sysUserLoginPassword = sysUserLoginPassword;
	}

	public String getSysUserStatus() {
		return sysUserStatus;
	}

	public void setSysUserStatus(String sysUserStatus) {
		this.sysUserStatus = sysUserStatus;
	}

	public String getSysUserIsDelete() {
		return sysUserIsDelete;
	}

	public void setSysUserIsDelete(String sysUserIsDelete) {
		this.sysUserIsDelete = sysUserIsDelete;
	}

	public Date getSysUserRegisterDatetime() {
		return sysUserRegisterDatetime;
	}

	public void setSysUserRegisterDatetime(Date sysUserRegisterDatetime) {
		this.sysUserRegisterDatetime = sysUserRegisterDatetime;
	}

	public String getSysUserRegisterSource() {
		return sysUserRegisterSource;
	}

	public void setSysUserRegisterSource(String sysUserRegisterSource) {
		this.sysUserRegisterSource = sysUserRegisterSource;
	}

	public String getSysUserType() {
		return sysUserType;
	}

	public void setSysUserType(String sysUserType) {
		this.sysUserType = sysUserType;
	}

	public String getSysUserSex() {
		return sysUserSex;
	}

	public void setSysUserSex(String sysUserSex) {
		this.sysUserSex = sysUserSex;
	}

	public String getSysUserIsEmailActive() {
		return sysUserIsEmailActive;
	}

	public void setSysUserIsEmailActive(String sysUserIsEmailActive) {
		this.sysUserIsEmailActive = sysUserIsEmailActive;
	}

	public String getSysUserIsMobileActive() {
		return sysUserIsMobileActive;
	}

	public void setSysUserIsMobileActive(String sysUserIsMobileActive) {
		this.sysUserIsMobileActive = sysUserIsMobileActive;
	}

	public String getSysUserRegisterType() {
		return sysUserRegisterType;
	}

	public void setSysUserRegisterType(String sysUserRegisterType) {
		this.sysUserRegisterType = sysUserRegisterType;
	}

	public String getSysUserPayPasswrod() {
		return sysUserPayPasswrod;
	}

	public void setSysUserPayPasswrod(String sysUserPayPasswrod) {
		this.sysUserPayPasswrod = sysUserPayPasswrod;
	}

	public String getSysUserIcon() {
		return sysUserIcon;
	}

	public void setSysUserIcon(String sysUserIcon) {
		this.sysUserIcon = sysUserIcon;
	}

	public String getSysUserRealName() {
		return sysUserRealName;
	}

	public void setSysUserRealName(String sysUserRealName) {
		this.sysUserRealName = sysUserRealName;
	}

	public String getSysUserEmail() {
		return sysUserEmail;
	}

	public void setSysUserEmail(String sysUserEmail) {
		this.sysUserEmail = sysUserEmail;
	}

	public String getSysUserMobile() {
		return sysUserMobile;
	}

	public void setSysUserMobile(String sysUserMobile) {
		this.sysUserMobile = sysUserMobile;
	}

	public String getSysUserWeiboId() {
		return sysUserWeiboId;
	}

	public void setSysUserWeiboId(String sysUserWeiboId) {
		this.sysUserWeiboId = sysUserWeiboId;
	}

	public String getSysUserQqId() {
		return sysUserQqId;
	}

	public void setSysUserQqId(String sysUserQqId) {
		this.sysUserQqId = sysUserQqId;
	}

    @Override
    public String toString() {
        return "SysUser{" +
                "sysUserId=" + sysUserId +
                ", sysUserLoginName='" + sysUserLoginName + '\'' +
                ", sysUserLoginPassword='" + sysUserLoginPassword + '\'' +
                ", sysUserStatus='" + sysUserStatus + '\'' +
                ", sysUserIsDelete='" + sysUserIsDelete + '\'' +
                ", sysUserRegisterDatetime=" + sysUserRegisterDatetime +
                ", sysUserRegisterSource='" + sysUserRegisterSource + '\'' +
                ", sysUserType='" + sysUserType + '\'' +
                ", sysUserSex='" + sysUserSex + '\'' +
                ", sysUserIsEmailActive='" + sysUserIsEmailActive + '\'' +
                ", sysUserIsMobileActive='" + sysUserIsMobileActive + '\'' +
                ", sysUserRegisterType='" + sysUserRegisterType + '\'' +
                ", sysUserPayPasswrod='" + sysUserPayPasswrod + '\'' +
                ", sysUserIcon='" + sysUserIcon + '\'' +
                ", sysUserRealName='" + sysUserRealName + '\'' +
                ", sysUserEmail='" + sysUserEmail + '\'' +
                ", sysUserMobile='" + sysUserMobile + '\'' +
                ", sysUserWeiboId='" + sysUserWeiboId + '\'' +
                ", sysUserQqId='" + sysUserQqId + '\'' +
                '}';
    }
}