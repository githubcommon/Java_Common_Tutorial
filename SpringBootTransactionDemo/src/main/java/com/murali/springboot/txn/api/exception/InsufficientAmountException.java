package com.murali.springboot.txn.api.exception;

/**
 * @author:Sanapala Muralidharan
 * @date:Jul 21, 2021 8:03:37 PM
 * @version:2.x
 */
public class InsufficientAmountException extends RuntimeException {

    /**
     * 
     */
    private static final long serialVersionUID = 8288014827234242128L;

    public InsufficientAmountException(String message) {
	super(message);
    }
}
