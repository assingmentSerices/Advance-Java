package com.example.demo.Runner;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.example.demo.Service.ProducerService;
@Component
public class TestSendRunner {
//implements CommandLineRunner {

	@Autowired
	private ProducerService service;
	
@Scheduled(cron = "*/10 * * * * *")
	public void  sendMsg() {
		
	service.sendMessage("hello Dollop"+new Date());
	
	}
}
