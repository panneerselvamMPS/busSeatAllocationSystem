package com.min.project.portal.scheduler;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import com.min.project.portal.repository.BusDispatchRepo;

@Configuration
@EnableScheduling
public class ConfigureAutoCompletion {
	@Autowired
	BusDispatchRepo disrepo;
	
	@Scheduled(fixedDelay = 60000)
	public void autocompletionstart() throws InterruptedException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        Date date = new Date();  
        disrepo.autocompletion(formatter.format(date));
        disrepo.autostart(formatter.format(date));
    }
}