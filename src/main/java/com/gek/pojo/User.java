package com.gek.pojo;

import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

@Data
@ToString
public class User implements Serializable {
    private Long id;
    private String username;
    private String password;
    private Boolean enabled;
    private String realname;
    private Integer level;
    private String groupname;
}
