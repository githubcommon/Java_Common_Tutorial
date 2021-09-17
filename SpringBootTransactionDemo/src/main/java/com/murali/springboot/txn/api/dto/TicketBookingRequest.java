package com.murali.springboot.txn.api.dto;

import com.murali.springboot.txn.api.entity.PassengerInfo;
import com.murali.springboot.txn.api.entity.PaymentInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 21, 2021 7:47:18 PM
 * @version:2.x
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketBookingRequest {

    private PassengerInfo passengerInfo;

    private PaymentInfo paymentInfo;

}
