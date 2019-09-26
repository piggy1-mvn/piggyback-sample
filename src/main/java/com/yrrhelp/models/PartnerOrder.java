package com.yrrhelp.models;


import javax.persistence.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "orders")
public class PartnerOrder {
	
	@Id
    private Long id;
	
    private String partnerId;
	
	private String orderType;
	 
    private String orderStatus;
	
    private int optimizationDuration;

	private Location location;

	private Integer  maxOptimizations;
	 
    private Integer optimizationRadius;
	
    private String initiatorUserId;
	
	private String partnerDisplayName;
	
	private String partnerRedirectUrl;
	
    
    public PartnerOrder(){
    	
    }
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

//	public double getOrderLatitude() {
//		return orderLatitude;
//	}
//
//	public void setOrderLatitude(double orderLatitude) {
//		this.orderLatitude = orderLatitude;
//	}
	
	public String getPartnerId() {
		return partnerId;
	}

	public void setPartnerId(String partnerId) {
		this.partnerId = partnerId;
	}

	public String getOrderType() {
		return orderType;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOptimizationDuration() {
		return optimizationDuration;
	}

	public void setOptimizationDuration(int optimizationDuration) {
		this.optimizationDuration = optimizationDuration;
	}

//	public double getOrderLongitude() {
//		return orderLongitude;
//	}
//
//	public void setOrderLongitude(double orderLongitude) {
//		this.orderLongitude = orderLongitude;
//	}

	public Integer getMaxOptimizations() {
		return maxOptimizations;
	}

	public void setMaxOptimizations(Integer maxOptimizations) {
		this.maxOptimizations = maxOptimizations;
	}

	public Integer getOptimizationRadius() {
		return optimizationRadius;
	}

	public void setOptimizationRadius(Integer optimizationRadius) {
		this.optimizationRadius = optimizationRadius;
	}

	public String getInitiatorUserId() {
		return initiatorUserId;
	}

	public void setInitiatorUserId(String initiatorUserId) {
		this.initiatorUserId = initiatorUserId;
	}

	public String getPartnerDisplayName() {
		return partnerDisplayName;
	}

	public void setPartnerDisplayName(String partnerDisplayName) {
		this.partnerDisplayName = partnerDisplayName;
	}

	public String getPartnerRedirectUrl() {
		return partnerRedirectUrl;
	}

	public void setPartnerRedirectUrl(String partnerRedirectUrl) {
		this.partnerRedirectUrl = partnerRedirectUrl;
	}

//	public String getPartnerWebHookAddress() {
//		return partnerWebHookAddress;
//	}
//
//	public void setPartnerWebHookAddress(String partnerWebHookAddress) {
//		this.partnerWebHookAddress = partnerWebHookAddress;
//	}
//    
	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}
	
}
