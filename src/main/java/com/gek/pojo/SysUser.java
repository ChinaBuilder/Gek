package com.gek.pojo;

import lombok.Data;
import lombok.ToString;

import java.util.Date;
@ToString
@Data
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

}