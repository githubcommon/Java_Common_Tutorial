package com.murali.springboot.txn.api.dto;

import com.murali.springboot.txn.api.entity.PassengerInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
/**
 * @author:Sanapala Muralidharan
 * @date:Jul 21, 2021 7:49:56 PM  
 * @version:2.x
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TicketBookingAcknowledgement {

    private String status;
    private double totalFare;
    private String pnrNo;
    private PassengerInfo passengerInfo;
}
