package com.testes.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * @Description:  职位表实体类
 * @Author: niuyibo
 * @Date: 2020-02-13
 */
@TableName("mem_position")
public class MemPositionEntity extends Model<MemPositionEntity> {

  private static final long serialVersionUID = 1L;

	private Long id;   //分布式ID
	private Long companyId;   //所属公司ID
	private String name;   //职位名称
	private String memo;   //职位描述
	private Integer adminFlag;   //是否是系统管理员 0-不是  1-是
	private String createUser;   //职位创建人
	private Date createTime;   //创建时间
	private String updateUser;   //更新用户
	private Date updateTime;   //更新时间


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMemo() {
		return memo;
	}

	public void setMemo(String memo) {
		this.memo = memo;
	}

	public Integer getAdminFlag() {
		return adminFlag;
	}

	public void setAdminFlag(Integer adminFlag) {
		this.adminFlag = adminFlag;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
