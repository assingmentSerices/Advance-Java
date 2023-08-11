package com.adda.dollop;

import java.util.Date;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
@ComponentScan("com.adda.dollop")
@EnableScheduling
public class Config {
	@Scheduled(cron="*/10 * * * * *")
public void generteDate()
{
	System.out.println("Chetan Kushwah"+new Date());
}
}
