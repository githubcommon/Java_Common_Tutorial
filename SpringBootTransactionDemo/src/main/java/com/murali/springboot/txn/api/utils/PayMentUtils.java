package com.murali.springboot.txn.api.utils;

import java.util.HashMap;
import java.util.Map;

import com.murali.springboot.txn.api.exception.InsufficientAmountException;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 21, 2021 7:58:58 PM
 * @version:2.x
 */
public class PayMentUtils {

    private static Map<String, Double> paymentMap = new HashMap<String, Double>();
    static {
	paymentMap.put("acc1", 12000.0);
	paymentMap.put("acc2", 10000.0);
	paymentMap.put("acc3", 5000.0);
	paymentMap.put("acc4", 8000.0);
    }

    public static boolean validateCreditLimit(String accNo, double paidAmount) {
	if (paidAmount > paymentMap.get(accNo)) {
	    throw new InsufficientAmountException("Insufficient fund...!!");
	} else {
	    return true;
	}
    }
}
