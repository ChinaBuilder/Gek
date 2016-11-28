# 基于ssm框架搭建

## 说明
- 本项目为开源免费

- 环境：
    - JDK 7（理论上支持 JDK 6、JDK 7、JDK 8）
    - Maven 3.1.1
    - Mysql 5.6
    - Tomcat 7
    - IDE：IntelliJ IDEA 16.1
    - SSM 版本：
        - spring version：**3.2.16.RELEASE（也支持 4.1、4.2）**
        - mybatis version：**3.3.1**
        - mybatis-spring version：**1.2.4**
        
- spring security使用注意
    - 配置文件
    default-target-url 登陆成功默认跳转首页
    
    ```
    <form-login default-target-url="/login/home"
                        authentication-success-forward-url="/welcome"
                        login-page="/login"
                        login-processing-url="/login/check"
                        username-parameter="username"
                        password-parameter="password"
                        authentication-failure-forward-url="/login?login_error=t"/>
    <logout logout-success-url="/login?logout"/>
    ```



