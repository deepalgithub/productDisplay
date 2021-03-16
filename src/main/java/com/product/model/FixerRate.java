package com.product.model;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class FixerRate {

	@JsonProperty("success")
	private Boolean success;
	
	@JsonProperty("timestamp")
	private Integer timestamp;
	
	@JsonProperty("base")
	private String base;
	
	@JsonProperty("date")
	private String date;
	
	@JsonProperty("rates")
	private HashMap<String, Double> rates;
	
	public Boolean getSuccess() {
		return success;
	}
	
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	public Integer getTimestamp() {
		return timestamp;
	}
	
	public void setTimestamp(Integer timestamp) {
		this.timestamp = timestamp;
	}
	
	public String getBase() {
		return base;
	}
	
	public void setBase(String base) {
		this.base = base;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
	}
	
	public HashMap<String, Double> getRates() {
		return rates;
	}
	
	public void setRates(HashMap<String, Double> rates) {
		this.rates = rates;
	}
	
	@Override
	public String toString() {
		return "FixerRate [success=" + success + ", timestamp=" + timestamp + ", base=" + base + ", date=" + date
				+ ", rates=" + rates + "]";
	}

}