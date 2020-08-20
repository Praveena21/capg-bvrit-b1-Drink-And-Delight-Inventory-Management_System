package com.capg.dnd.productorder.ms.exception;


@SuppressWarnings("serial")
public class IdAlreadyExistsException extends RuntimeException {
         public IdAlreadyExistsException(String msg) {
        	 super(msg);
         }
         public IdAlreadyExistsException(String msg,Throwable e) {
        	 super(msg,e);
         }
}