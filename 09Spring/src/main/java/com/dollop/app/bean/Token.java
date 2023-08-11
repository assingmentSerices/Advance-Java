package com.dollop.app.bean;

public class Token {
private String code;

@Override
public String toString() {
	return "Token [code=" + code + "]";
}

public Token() {
	super();

	// TODO Auto-generated constructor stub
}

public String getCode() {
	return code;
}

public void setCode(String code) {
	this.code = code;
}

}
