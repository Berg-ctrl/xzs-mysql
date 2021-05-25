package com.mindskip.xzs.configuration.spring.security;

import lombok.Data;

/**
 * @author 边佳慧
 */

@Data
public class AuthenticationBean {
    private String userName;
    private String password;
    private boolean remember;
}
