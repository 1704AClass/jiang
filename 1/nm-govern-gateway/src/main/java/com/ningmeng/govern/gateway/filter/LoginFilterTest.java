package com.ningmeng.govern.gateway.filter;

import com.alibaba.fastjson.JSON;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import com.ningmeng.framework.model.response.CommonCode;
import com.ningmeng.framework.model.response.ResponseResult;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by 1 on 2020/3/13.
 */
//@Component
public class LoginFilterTest extends ZuulFilter{
    @Override
    public String filterType() {
        //pre：请求在被路由之前执行
        // routing：在路由请求时调用
        // post：在routing和errror过滤器之后调用
        // error：处理请求时发生错误调用
        return "pre";
    }

    @Override
    public int filterOrder() {
        //此方法返回整型数值，通过此数值来定义过滤器的执行顺序，数字越小优先级越高。
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否启用当前的过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //过滤器的业务逻辑
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletResponse response = requestContext.getResponse();
        HttpServletRequest request = requestContext.getRequest();
        //取出头部信息Authorization
        String authorization = request.getHeader("Authorization");
        if(StringUtils.isEmpty(authorization)){
            requestContext.setSendZuulResponse(false);// 拒绝访问
            requestContext.setResponseStatusCode(200);// 设置响应状态码
            ResponseResult unauthenticated = new ResponseResult(CommonCode.UNAUTHENTICATED);
            String jsonString = JSON.toJSONString(unauthenticated);
            requestContext.setResponseBody(jsonString);
            requestContext.getResponse().setContentType("application/json;charset=UTF‐8");
            return null;
        }
        return null;
    }
}
