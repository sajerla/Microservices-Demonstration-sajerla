package com.ramakrishna.userservice;

public class User
{
	private String userId;
	private String userName;
	private String userPhoneNumber;
	
	private Post post;
	private Notification nft;
	
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public Notification getNft() {
		return nft;
	}
	public void setNft(Notification nft) {
		this.nft = nft;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public User(String userId, String userName, String userPhoneNumber) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userPhoneNumber = userPhoneNumber;
	}

}
