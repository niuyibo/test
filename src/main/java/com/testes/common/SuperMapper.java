package com.testes.common;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 
 * @Description: 自定义 mapper 父类
 * @Author: niuyibo
 * @Date: 创建时间    2017年7月17日 下午3:50:40 
 *
 */
public interface SuperMapper<T> extends BaseMapper<T> {

    // 这里可以写自己的公共方法、注意不要让 mp 扫描到误以为是实体 Base 的操作
	
}
