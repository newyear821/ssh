package com.test.emailcollect.Action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.emailcollect.Service.EmailcollectService;

public class EmailcollectAction {
	private EmailcollectService emailcollectService;

	/**
	 * @param emailcollectService the emailcollectService to set
	 */
	public void setEmailcollectService(EmailcollectService emailcollectService) {
		this.emailcollectService = emailcollectService;
	}
	
	private HttpServletRequest request;
	public void setHttpServletRequest(HttpServletRequest request){
		this.request = request;
	}
	
	private HttpServletResponse response;
	
	/**
	 * @param request the request to set
	 */
	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}
	/**
	 * @param response the response to set
	 */
	public void setResponse(HttpServletResponse response) {
		this.response = response;
	}

	//表单字段
	private String id;
	private String email;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String saveEmail(){
		

//		String email = (String)request.getAttribute("email");
//		System.out.println("email-----" + email);
//		boolean res = false;
//		try{
//			emailcollectService.saveEmail(email);
//			res = true;
//		}catch(Exception e){
//			res = false;
//			e.printStackTrace();
//		}
		try{
			System.out.println("1111111111");
			//response.getWriter().print("111");
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
}
