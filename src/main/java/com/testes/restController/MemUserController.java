package com.testes.restController;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.testes.entity.MemUserEntity;
import com.testes.service.IMemUserService;
import com.testes.utils.RenderResultUtil;

/**
 * @Description: 账户信息表控制器
 * @Author: niuyibo
 * @Date: 2019-11-20
 */
@RestController
@RequestMapping("memuser")
public class MemUserController {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    @Autowired
    private IMemUserService iMemUserService;

    /**
     * http://106.13.90.178:1216/testes/memuser/list
     * @return
     */
    @GetMapping("list")
    public JSON list() {
        logger.info("start query");
        List<MemUserEntity> list = iMemUserService.list(null);
        return RenderResultUtil.renderSuccess(list);

    }
}
