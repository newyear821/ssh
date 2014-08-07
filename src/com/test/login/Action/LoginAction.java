package com.test.login.Action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.test.login.Model.AccountInfo;
import com.test.login.Service.LoginService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport{
	private LoginService loginService;
	public void setLoginService(LoginService lservice){
		this.loginService = lservice;
	}
	
	private HttpServletRequest request;
	public void setHttpServletRequest(HttpServletRequest request){
		this.request = request;
	}
	
	//表单字段
	private String accountName;
	private String accountPwd;
	
	
	/**
	 * @return the accountName
	 */
	public String getAccountName() {
		return accountName;
	}


	/**
	 * @param accountName the accountName to set
	 */
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}


	/**
	 * @return the accountPwd
	 */
	public String getAccountPwd() {
		return accountPwd;
	}


	/**
	 * @param accountPwd the accountPwd to set
	 */
	public void setAccountPwd(String accountPwd) {
		this.accountPwd = accountPwd;
	}


	public String login(){
		System.out.println("accountName: "+accountName);
		System.out.println("accountPwd: "+accountPwd);
		//System.out.println(request.getAttribute("accountName") + "00000");
		Map session = null;
		
		AccountInfo user = new AccountInfo();
		user.setAccountName(accountName);
		user.setAccountPwd(accountPwd);
		try{
		List list = loginService.loginUser(user);
		//排除验证完成后未查到符合的数据行时,调用get(0)索引溢出异常
		
		if(list.size()!=0){
			//使用作用域对象容器ActionContext 
			AccountInfo loginUser = (AccountInfo)list.get(0);
			session = ActionContext.getContext().getSession();
			session.put("logId",loginUser.getAccountId());
			session.put("logName", loginUser.getAccountName());
			
			
			/**登录成功以后，再获取用户的角色*/
			/*
			SysRole loginRole = userDAo.getUserRole(loginUser);
			String roleName = loginRole.getRoleName();
			session.put("roleName", roleName);

			/**得到用户登录的角色以后，再获取用户所拥有的权限集合(操作节点集合)  * 并将它保存到Session作用域中,以做权限校验*/
			/*
			List rights = userDAo.getUserRight(loginRole);
			session.put("rightList", rights);
			*/
			System.out.println("logId:" + loginUser.getAccountId());
			return "success";
		}else{
			return "input";
		}
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
		
	}
	
	/*
	public void validateLogin(){//表单验证 
		if(this.accountName==null||"".equals(this.accountName)){
			addFieldError("accountName","用户名不能为空");
		}
		if(this.accountPwd==null||"".equals(this.accountPwd)){
			addFieldError("accountPwd","用户密码不能为空");
		}
	}
	*/
	
	//作用域对象传值： 
	/*
	request.setAttribute("productPageDB",pageDB);
	request.getSession(false).getAttribute("logId");
	Map session = ActionContext.getContext().getSession();
	session.put("logId", loginUser.getUsrId());
	*/
}
