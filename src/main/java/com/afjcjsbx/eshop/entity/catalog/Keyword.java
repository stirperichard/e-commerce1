package com.afjcjsbx.eshop.entity.catalog;


public class Keyword {
	
	/**
	 * 
	 */
	private long productId;
	private String languageCode;
	private String keyword;


	public void setProductId(long productId) {
		this.productId = productId;
	}
	public long getProductId() {
		return productId;
	}
	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}
	public String getLanguageCode() {
		return languageCode;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public String getKeyword() {
		return keyword;
	}

}
