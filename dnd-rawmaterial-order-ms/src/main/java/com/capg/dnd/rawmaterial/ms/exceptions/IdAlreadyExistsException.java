package com.capg.dnd.rawmaterial.ms.exceptions;
@SuppressWarnings("serial")
public class IdAlreadyExistsException extends RuntimeException {
         public IdAlreadyExistsException(String msg) {
        	 super(msg);
         }
         public IdAlreadyExistsException(String msg,Throwable e) {
        	 super(msg,e);
         }
}
