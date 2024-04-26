package com.ramakrishna.notificationservice;



public class Notification 

{
	
	private String notificationId;
	private String notificationAddress;
	public Notification(String notificationId, String notificationAddress) {
		super();
		this.notificationId = notificationId;
		this.notificationAddress = notificationAddress;
	}
	public String getNotificationId() {
		return notificationId;
	}
	public void setNotificationId(String notificationId) {
		this.notificationId = notificationId;
	}
	public String getNotificationAddress() {
		return notificationAddress;
	}
	public void setNotificationAddress(String notificationAddress) {
		this.notificationAddress = notificationAddress;
	}

}
