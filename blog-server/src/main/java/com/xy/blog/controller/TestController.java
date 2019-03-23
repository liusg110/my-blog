package com.xy.blog.controller;

import com.xy.blog.common.ContractUser;
import com.xy.blog.domain.vo.AddFistReq;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaoyao
 * @ClassName: ${type_name}
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 * @date ${date} ${time}
 * ${tags}
 */
@RestController
@RequestMapping(value = "/{type}")
public class TestController {
    @RequestMapping(value = "/dotest")
    public String doTest(@PathVariable(value = "type")String type,@RequestBody AddFistReq addFistReq){
        String userId = ContractUser.getUserId();
        return addFistReq.toString()+type+userId;
    }
}
