package com.murali.springboot.scheduler.api.service;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.murali.springboot.scheduler.api.dao.UserDao;
import com.murali.springboot.scheduler.api.model.User;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 17, 2021 8:40:27 PM
 * @version:2.x
 */
@Service
public class UserService {

    @Autowired
    private UserDao dao;

    Logger log = LoggerFactory.getLogger(UserService.class);

    // schedule a job to add object in DB (in every 5 seconds)
    @Scheduled(fixedRate = 5000)
    public void add2DBJob() {
	User user = new User();
	user.setName("user" + new Random().nextInt(374483));
	dao.save(user);
	System.out.println("add service call in " + new Date().toString());
    }

    @Scheduled(cron="0/15 * * * * *") // second, minute, hour, day
    public void fetchDBJob() {
	List<User> users = dao.findAll();
	System.out.println("Fetch service callin " + new Date().toString());
	System.out.println("no of records fetched:: " + users.size());
	log.info("users : {}", users );
    }
}
