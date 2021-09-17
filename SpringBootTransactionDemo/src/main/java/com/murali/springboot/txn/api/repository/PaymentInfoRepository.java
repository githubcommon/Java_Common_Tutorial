package com.murali.springboot.txn.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murali.springboot.txn.api.entity.PaymentInfo;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 21, 2021 7:41:25 PM
 * @version:2.x
 */
public interface PaymentInfoRepository extends JpaRepository<PaymentInfo, String> {

}
