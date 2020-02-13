package com.testes.restController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageInfo;
import com.testes.entity.MemPositionEntity;
import com.testes.service.IMemPositionService;
import com.testes.utils.RenderResultUtil;

/**
 * @Description: 职位表控制器
 * @Author: niuyibo
 * @Date: 2020-02-13
 */
@RestController
@RequestMapping("memposition")
public class MemPositionController {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private IMemPositionService iMemPositionService;

    /**
     * http://127.0.0.1:1216/testes/memposition/list?pageNum=1&pageSize=15&companyId=120
     * @return
     */
    @GetMapping("list")
    public JSON list(int pageNum, int pageSize, Long companyId) {
        logger.info("start selectPage");
        PageInfo<MemPositionEntity> pageInfo = iMemPositionService.list(pageNum, pageSize, companyId);
        return RenderResultUtil.renderSuccess(pageInfo);
    }
}
