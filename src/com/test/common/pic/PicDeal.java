package com.test.common.pic;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.UUID;

import org.junit.Test;

public class PicDeal {
	/**
	 * 这个类主要是用来读取图片的。把外网站读取的图片转存到本站。
	 */
	private String localpath = "D:/myEclipseWorkspace/ssh/WebRoot/common/picsave/";
	
	public String getUUID(){    
        String uuid = UUID.randomUUID().toString().trim().replaceAll("-", "");    
        return uuid;    
    } 
	
	//读取图片
	public String readPic(){
		String fileUrl = "http://www.kingandwood.com/photo/20090826094722578.jpg";
		String aftername = fileUrl.substring(fileUrl.lastIndexOf("."), fileUrl.length());
		String savePath = localpath + getUUID() + aftername;
		
		boolean res = false;
		try{
		   URL url = new URL(fileUrl);
           HttpURLConnection connection = (HttpURLConnection)url.openConnection();
           DataInputStream in = new DataInputStream(connection.getInputStream());
           DataOutputStream out = new DataOutputStream(new FileOutputStream(savePath));
           byte[] buffer = new byte[4096];
           int count = 0;
           while ((count = in.read(buffer)) > 0){
               out.write(buffer, 0, count);
           }
           out.close();
           in.close();
           connection.disconnect();
           res = true;

       }catch (Exception e){
    	   fileUrl = "";
           System.out.println(e + fileUrl + savePath);
       }
       return fileUrl;
	}

	
	@Test
	public void unittest(){
		readPic();
	}

}
