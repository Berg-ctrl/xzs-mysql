package com.mindskip.xzs.viewmodel.admin.user;

import com.mindskip.xzs.base.BasePage;
import lombok.Data;

/**
 * @author 边佳慧
 */

@Data
public class UserPageRequestVM extends BasePage {

    private String userName;
    private Integer role;

}
