package com.testes.service.impl;

import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.testes.entity.MemUserEntity;
import com.testes.mapper.MemUserMapper;
import com.testes.service.IMemUserService;

/**
 * @Description:  账户信息表服务实现类
 * @Author: niuyibo
 * @Date: 2019-11-20
 */
@Service
public class MemUserServiceImpl extends ServiceImpl<MemUserMapper, MemUserEntity> implements IMemUserService {
	
}
