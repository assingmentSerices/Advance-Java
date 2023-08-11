package com.example.demo.ExcptionHandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class MyErrorResponce {
	private String date;
	private String Status;
	private String message;
	private Integer code;

	@Override
	public String toString() {
		return "MyErrorResponce [date=" + date + ", Status=" + Status + ", message=" + message + ", code=" + code + "]";
	}

}
