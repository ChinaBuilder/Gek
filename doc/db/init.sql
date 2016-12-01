# 创建数据库，并创建权限用户
# CREATE DATABASE 'ssm' CHARACTER SET utf8;
CREATE TABLE sys_user
(
  sys_user_id BIGINT(20) PRIMARY KEY NOT NULL COMMENT '系统用户主键',
  sys_user_login_name VARCHAR(50) NOT NULL COMMENT '登录账户',
  sys_user_login_password VARCHAR(50) NOT NULL COMMENT '登录密码',
  sys_user_status VARCHAR(20) NOT NULL COMMENT '用户状态',
  sys_user_is_delete VARCHAR(1) NOT NULL COMMENT '是否已经删除',
  sys_user_register_datetime TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '用户注册时间(默认创建时间)',
  sys_user_register_source VARCHAR(1) NOT NULL,
  sys_user_type TINYINT(1) DEFAULT '1' NOT NULL COMMENT '当前用户类型',
  sys_user_sex VARCHAR(1) NOT NULL COMMENT '性别',
  sys_user_is_email_active VARCHAR(1) NOT NULL COMMENT '当前用户邮箱是否激活',
  sys_user_is_mobile_active VARCHAR(1) NOT NULL COMMENT '当前用户手机是否激活',
  sys_user_register_type VARCHAR(1) NOT NULL COMMENT '当前用户注册类型',
  sys_user_pay_passwrod VARCHAR(50) COMMENT '支付密码',
  sys_user_icon VARCHAR(100) COMMENT '用户头像',
  sys_user_real_name VARCHAR(20) COMMENT '用户真实名字',
  sys_user_email VARCHAR(50) COMMENT '邮箱地址',
  sys_user_mobile VARCHAR(20) COMMENT '手机号码',
  sys_user_weibo_id VARCHAR(36) COMMENT '微博账号',
  sys_user_qq_id VARCHAR(36) COMMENT 'QQ账号'
);

INSERT INTO ssm.sys_user (sys_user_id, sys_user_login_name, sys_user_login_password, sys_user_status, sys_user_is_delete, sys_user_register_datetime, sys_user_register_source, sys_user_type, sys_user_sex, sys_user_is_email_active, sys_user_is_mobile_active, sys_user_register_type, sys_user_pay_passwrod, sys_user_icon, sys_user_real_name, sys_user_email, sys_user_mobile, sys_user_weibo_id, sys_user_qq_id) VALUES (1, 'YouMeek1', 'e10adc3949ba59abbe56e057f20f883e', 'ROLE_USER', 'N', '2016-02-24 00:12:23', '0', 0, '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩1', '363379441@qq.com', '13800000001', '', '');
INSERT INTO ssm.sys_user (sys_user_id, sys_user_login_name, sys_user_login_password, sys_user_status, sys_user_is_delete, sys_user_register_datetime, sys_user_register_source, sys_user_type, sys_user_sex, sys_user_is_email_active, sys_user_is_mobile_active, sys_user_register_type, sys_user_pay_passwrod, sys_user_icon, sys_user_real_name, sys_user_email, sys_user_mobile, sys_user_weibo_id, sys_user_qq_id) VALUES (2, 'YouMeek2', 'e10adc3949ba59abbe56e057f20f883e', 'ROLE_USER', 'N', '2016-02-24 00:12:23', '0', 0, '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩2', '363379442@qq.com', '13800000002', '', '');
INSERT INTO ssm.sys_user (sys_user_id, sys_user_login_name, sys_user_login_password, sys_user_status, sys_user_is_delete, sys_user_register_datetime, sys_user_register_source, sys_user_type, sys_user_sex, sys_user_is_email_active, sys_user_is_mobile_active, sys_user_register_type, sys_user_pay_passwrod, sys_user_icon, sys_user_real_name, sys_user_email, sys_user_mobile, sys_user_weibo_id, sys_user_qq_id) VALUES (3, 'YouMeek3', 'e10adc3949ba59abbe56e057f20f883e', 'ROLE_USER', 'N', '2016-02-24 00:12:23', '0', 0, '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩3', '363379443@qq.com', '13800000003', '', '');
INSERT INTO ssm.sys_user (sys_user_id, sys_user_login_name, sys_user_login_password, sys_user_status, sys_user_is_delete, sys_user_register_datetime, sys_user_register_source, sys_user_type, sys_user_sex, sys_user_is_email_active, sys_user_is_mobile_active, sys_user_register_type, sys_user_pay_passwrod, sys_user_icon, sys_user_real_name, sys_user_email, sys_user_mobile, sys_user_weibo_id, sys_user_qq_id) VALUES (4, 'YouMeek4', 'e10adc3949ba59abbe56e057f20f883e', 'ROLE_USER', 'N', '2016-02-24 00:12:23', '0', 0, '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩4', '363379444@qq.com', '13800000004', '', '');
INSERT INTO ssm.sys_user (sys_user_id, sys_user_login_name, sys_user_login_password, sys_user_status, sys_user_is_delete, sys_user_register_datetime, sys_user_register_source, sys_user_type, sys_user_sex, sys_user_is_email_active, sys_user_is_mobile_active, sys_user_register_type, sys_user_pay_passwrod, sys_user_icon, sys_user_real_name, sys_user_email, sys_user_mobile, sys_user_weibo_id, sys_user_qq_id) VALUES (5, 'YouMeek5', 'e10adc3949ba59abbe56e057f20f883e', 'ROLE_USER', 'N', '2016-02-24 00:12:23', '0', 0, '0', 'Y', 'Y', '0', 'e10adc3949ba59abbe56e057f20f883e', '', '张觉恩5', '363379445@qq.com', '13800000005', '', '');


CREATE TABLE t_user
(
  id BIGINT(20) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  username VARCHAR(200),
  password VARCHAR(300),
  enabled TINYINT(1),
  realname VARCHAR(50),
  level INT(11),
  createTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP NOT NULL,
  group_name VARCHAR(40) DEFAULT 'ROLE_USER'
);
use t_user;
INSERT INTO ssm.t_user (username, password, enabled, realname, level, createTime, group_name) VALUES ('tom', '123', 0, 'wuyunlong', 10, '2016-11-19 13:19:49', 'ROLE_USER');
INSERT INTO ssm.t_user (username, password, enabled, realname, level, createTime, group_name) VALUES ('tom12', '1234', 1, 'wuyunlong', 11, '2016-11-28 19:41:53', 'ROLE_ADMIN');
INSERT INTO ssm.t_user (username, password, enabled, realname, level, createTime, group_name) VALUES ('tom12', '1234', 1, 'wuyunlong', 11, '2016-11-28 19:42:35', 'ROLE_ADMIN');
INSERT INTO ssm.t_user (username, password, enabled, realname, level, createTime, group_name) VALUES ('tom12', '1234', 1, 'wuyunlong', 11, '2016-11-28 19:42:52', 'ROLE_ADMIN');
INSERT INTO ssm.t_user (username, password, enabled, realname, level, createTime, group_name) VALUES ('tom12', '1234', 1, 'wuyunlong', 11, '2016-11-28 19:43:55', 'ROLE_ADMIN');