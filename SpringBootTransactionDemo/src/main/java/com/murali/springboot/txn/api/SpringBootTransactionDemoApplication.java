package com.murali.springboot.txn.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.murali.springboot.txn.api.dto.TicketBookingAcknowledgement;
import com.murali.springboot.txn.api.dto.TicketBookingRequest;
import com.murali.springboot.txn.api.service.TicketBookingService;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 21, 2021 7:25:35 PM
 * @version:2.x
 */
@SpringBootApplication
@RestController
@EnableTransactionManagement
public class SpringBootTransactionDemoApplication {

    @Autowired
    TicketBookingService service;

    @PostMapping("/bookTicket")
    public TicketBookingAcknowledgement bookTicket(@RequestBody TicketBookingRequest request) {
	return service.bookingTicket(request);
    }

    public static void main(String[] args) {
	SpringApplication.run(SpringBootTransactionDemoApplication.class, args);
    }

}

/*
 * url:http://localhost:9090/bookTicket
 * 
 * { "passengerInfo": { "name": "murali", "email": "murali.sanapala@gmail.com",
 * "source": "Kadiyam", "destination": "Hyderabad", "travelDate": "21-07-2021",
 * "pickupTime": "8:30 PM", "arrivalTime": "7:00 AM", "fare": "18000.0" },
 * "paymentInfo": { "accountNo": "acc1", "cardType": "DEBIT" } }
 */