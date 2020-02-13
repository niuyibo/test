package com.testes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.testes.entity.MemPositionEntity;
import com.testes.mapper.MemPositionMapper;
import com.testes.service.IMemPositionService;

/**
 * @Description:  职位表服务实现类
 * @Author: niuyibo
 * @Date: 2020-02-13
 */
@Service
public class MemPositionServiceImpl extends ServiceImpl<MemPositionMapper, MemPositionEntity> implements IMemPositionService {
    
    @Autowired
    MemPositionMapper memPositionMapper;
    
    @Override
    public PageInfo<MemPositionEntity> list(int pageNum, int pageSize, Long companyId) {
        QueryWrapper<MemPositionEntity> wrapper = new QueryWrapper<>();
        wrapper.eq("COMPANY_ID", companyId);
        PageHelper.startPage(pageNum, pageSize);
        PageInfo<MemPositionEntity> pageInfo = new PageInfo<>(memPositionMapper.selectList(wrapper));
        return pageInfo;
    }
	
}
