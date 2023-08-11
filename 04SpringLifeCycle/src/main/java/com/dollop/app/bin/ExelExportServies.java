package com.dollop.app.bin;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ExelExportServies implements InitializingBean,DisposableBean{

	private String fileName;
	private String mode;
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	public ExelExportServies() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("From Init Method");
	}
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("From destroy Method");
	}
	
}
