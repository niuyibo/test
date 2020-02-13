package com.testes.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.testes.entity.MemPositionEntity;

/**
 * @Description:  职位表服务接口
 * @Author: niuyibo
 * @Date: 2020-02-13
 */
public interface IMemPositionService extends IService<MemPositionEntity> {

    PageInfo<MemPositionEntity> list(int pageNum, int pageSize, Long companyId);
	
}
