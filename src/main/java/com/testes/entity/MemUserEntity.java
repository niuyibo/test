package com.testes.entity;

import java.io.Serializable;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * @Description:  账户信息表实体类
 * @Author: niuyibo
 * @Date: 2019-11-20
 */
@TableName("mem_user")
public class MemUserEntity extends Model<MemUserEntity> {

  private static final long serialVersionUID = 1L;

	private Long id;   //分布式ID
	private String username;   //用户名
	private String password;   //密码
	private String salt;   //加密盐值
	private Long companyId;   //所属公司ID
	private Integer productType;   //所属产品：0-零售云,1-社区云
	private Integer baseProductType;   //基线产品分类：0-零售云，1-社区云，2-工地云，3-物流云，4-信息发布云，5-消防云
	private Integer productManager;   //产品管理员，1-是，0-不是,默认0
	private Long companyIdExp;   //体验公司id
	private String telephone;   //手机号(可作登陆账号)
	private String loginIp;   //最后登录IP
	private Date loginDate;   //最后登陆日期
	private Integer isOnline;   //在线状态(1：离线；2：在线)
	private Integer accountType;   //账户类别（1：普通会员；2：体验会员；3：系统管理员；4：普通管理员；5：普通用户；）
	private Integer isLock;   //是否锁定(1：未锁定；2：已锁定；)
	private Date lockStartTime;   //锁定开始时间
	private Date lockEndTime;   //锁定截止时间
	private Integer isValid;   //是否有效(1：体验有效期内；2：已过体验有效期；)
	private Date validStartTime;   //账户有效期开始时间
	private Date validEndTime;   //账户有效期截止时间
	private Integer isEnable;   //是否启用，0-不启用，1-启用
	private Integer validFlag;   //删除标志位，0-删除，1-未删
	private Date createTime;   //创建时间
	private Date updateTime;   //更新时间
	private Integer appPushEventMsg;   //是否推送报警消息 1-推送 0-不推送
	private Integer appPushFaceMsg;   //是否推送报警消息 1-推送 0-不推送
	private Integer appPushAlarmMsg;   //是否推送报警消息 1-推送 0-不推送
	private Integer type;   //人员组织树类型 1-默认组织树 2-自定义组织树
	private Integer deleteFlag;   //


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Integer getProductType() {
		return productType;
	}

	public void setProductType(Integer productType) {
		this.productType = productType;
	}

	public Integer getBaseProductType() {
		return baseProductType;
	}

	public void setBaseProductType(Integer baseProductType) {
		this.baseProductType = baseProductType;
	}

	public Integer getProductManager() {
		return productManager;
	}

	public void setProductManager(Integer productManager) {
		this.productManager = productManager;
	}

	public Long getCompanyIdExp() {
		return companyIdExp;
	}

	public void setCompanyIdExp(Long companyIdExp) {
		this.companyIdExp = companyIdExp;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	public Date getLoginDate() {
		return loginDate;
	}

	public void setLoginDate(Date loginDate) {
		this.loginDate = loginDate;
	}

	public Integer getIsOnline() {
		return isOnline;
	}

	public void setIsOnline(Integer isOnline) {
		this.isOnline = isOnline;
	}

	public Integer getAccountType() {
		return accountType;
	}

	public void setAccountType(Integer accountType) {
		this.accountType = accountType;
	}

	public Integer getIsLock() {
		return isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}

	public Date getLockStartTime() {
		return lockStartTime;
	}

	public void setLockStartTime(Date lockStartTime) {
		this.lockStartTime = lockStartTime;
	}

	public Date getLockEndTime() {
		return lockEndTime;
	}

	public void setLockEndTime(Date lockEndTime) {
		this.lockEndTime = lockEndTime;
	}

	public Integer getIsValid() {
		return isValid;
	}

	public void setIsValid(Integer isValid) {
		this.isValid = isValid;
	}

	public Date getValidStartTime() {
		return validStartTime;
	}

	public void setValidStartTime(Date validStartTime) {
		this.validStartTime = validStartTime;
	}

	public Date getValidEndTime() {
		return validEndTime;
	}

	public void setValidEndTime(Date validEndTime) {
		this.validEndTime = validEndTime;
	}

	public Integer getIsEnable() {
		return isEnable;
	}

	public void setIsEnable(Integer isEnable) {
		this.isEnable = isEnable;
	}

	public Integer getValidFlag() {
		return validFlag;
	}

	public void setValidFlag(Integer validFlag) {
		this.validFlag = validFlag;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Integer getAppPushEventMsg() {
		return appPushEventMsg;
	}

	public void setAppPushEventMsg(Integer appPushEventMsg) {
		this.appPushEventMsg = appPushEventMsg;
	}

	public Integer getAppPushFaceMsg() {
		return appPushFaceMsg;
	}

	public void setAppPushFaceMsg(Integer appPushFaceMsg) {
		this.appPushFaceMsg = appPushFaceMsg;
	}

	public Integer getAppPushAlarmMsg() {
		return appPushAlarmMsg;
	}

	public void setAppPushAlarmMsg(Integer appPushAlarmMsg) {
		this.appPushAlarmMsg = appPushAlarmMsg;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getDeleteFlag() {
		return deleteFlag;
	}

	public void setDeleteFlag(Integer deleteFlag) {
		this.deleteFlag = deleteFlag;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

}
