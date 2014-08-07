package com.test.login.Model;

/**
 * AccountInfo entity. @author MyEclipse Persistence Tools
 */

public class AccountInfo implements java.io.Serializable {

	// Fields

	private String accountId;
	private String accountName;
	private String accountPwd;

	// Constructors

	/** default constructor */
	public AccountInfo() {
	}

	/** full constructor */
	public AccountInfo(String accountName, String accountPwd) {
		this.accountName = accountName;
		this.accountPwd = accountPwd;
	}

	// Property accessors

	public String getAccountId() {
		return this.accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountName() {
		return this.accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public String getAccountPwd() {
		return this.accountPwd;
	}

	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}

}