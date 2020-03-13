package com.ningmeng.api.ucenterapi;

import com.ningmeng.framework.domain.ucenter.ext.NmUserExt;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
 * Created by 1 on 2020/3/12.
 */
@Api(value = "用户中心",description = "用户中心管理")
public interface UcenterControllerApi {

    @ApiOperation("根据账号查询用户信息")
    public NmUserExt getUserext(String username);

}
