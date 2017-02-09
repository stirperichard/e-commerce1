package com.afjcjsbx.eshop.exceptions;
public class ProductNotFound extends Exception {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ProductNotFound(){}
    
    public ProductNotFound(String msg){
        super(msg);
    }
    
}