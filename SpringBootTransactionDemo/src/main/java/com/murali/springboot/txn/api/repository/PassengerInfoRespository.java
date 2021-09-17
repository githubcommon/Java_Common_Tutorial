package com.murali.springboot.txn.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.murali.springboot.txn.api.entity.PassengerInfo;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 21, 2021 7:40:38 PM
 * @version:2.x
 */
public interface PassengerInfoRespository extends JpaRepository<PassengerInfo, Long> {

}
