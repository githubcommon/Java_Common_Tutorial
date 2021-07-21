package com.murali.springboot.txn.api.service;

import java.util.UUID;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;

import com.murali.springboot.txn.api.dto.TicketBookingAcknowledgement;
import com.murali.springboot.txn.api.dto.TicketBookingRequest;
import com.murali.springboot.txn.api.entity.PassengerInfo;
import com.murali.springboot.txn.api.entity.PaymentInfo;
import com.murali.springboot.txn.api.repository.PassengerInfoRespository;
import com.murali.springboot.txn.api.repository.PaymentInfoRepository;
import com.murali.springboot.txn.api.utils.PayMentUtils;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 21, 2021 7:50:53 PM
 * @version:2.x
 */
@Service
public class TicketBookingService {

    @Autowired
    private PassengerInfoRespository passengerInfoRespository;
    @Autowired
    private PaymentInfoRepository paymentInfoRepository;

    @Transactional // (readOnly=false,isolation=Isolation.READ_COMMITTED,propagation=Propagation.REQUIRED)
    public TicketBookingAcknowledgement bookingTicket(TicketBookingRequest request) {

	PassengerInfo passengerInfo = request.getPassengerInfo();
	passengerInfo = passengerInfoRespository.save(passengerInfo);

	PaymentInfo paymentInfo = request.getPaymentInfo();
	paymentInfo = paymentInfoRepository.save(paymentInfo);
	PayMentUtils.validateCreditLimit(paymentInfo.getAccountNo(), passengerInfo.getFare());
	paymentInfo.setPassengerId(passengerInfo.getPId());
	paymentInfo.setAmount(passengerInfo.getFare());
	paymentInfoRepository.save(paymentInfo);
	return new TicketBookingAcknowledgement("SUCCESS", passengerInfo.getFare(),
		UUID.randomUUID().toString().split("-")[0], passengerInfo);

    }
}
