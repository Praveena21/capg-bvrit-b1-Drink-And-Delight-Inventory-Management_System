package com.capg.dnd.productorder.ms.exception;


@SuppressWarnings("serial")
public class IdNotFoundException extends RuntimeException{
	  public IdNotFoundException(String msg){
	        super(msg);
	    }

	    public IdNotFoundException(String msg,Throwable e){
	        super(msg,e);
	    }

}