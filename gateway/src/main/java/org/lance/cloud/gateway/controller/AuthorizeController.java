package org.lance.cloud.gateway.controller;

import org.lance.cloud.api.request.AuthRequest;
import org.lance.cloud.api.result.HttpResult;
import org.lance.cloud.api.result.HttpResultBuilder;
import org.lance.cloud.exception.enums.ErrorType;
import org.lance.cloud.utils.JwtUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 请求认证，应该是一个服务
 */
@RestController("/auth")
public class AuthorizeController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    /**
     * 获取认证token
     * @param auth
     * @return
     */
    @PostMapping("token")
    public HttpResult<String> token(@RequestBody AuthRequest auth){
        logger.info("Token请求参数[{}]", auth);
        return sign(auth);
    }

    /**
     * 根据zuul路由信息检查认证用户
     * 也可通过数据库
     * @param auth
     * @return
     */
    private boolean check(AuthRequest auth){
        return StringUtils.hasText(auth.getAuthId());
    }

    /**
     * 生成签名结果
     * @param auth
     * @return
     */
    private HttpResult<String> sign(AuthRequest auth){
        if (check(auth)){
            return HttpResultBuilder.ok(JwtUtils.sign(auth));
        }
        return HttpResultBuilder.fail(ErrorType.ILLEGAL_REQUEST);
    }
}
