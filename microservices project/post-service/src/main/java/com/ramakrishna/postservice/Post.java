package com.ramakrishna.postservice;

public class Post
{
	private String postId;
	private String postDes;
	
	public Post(String postId, String postDes) {
		super();
		this.postId = postId;
		this.postDes = postDes;
	}
	public String getPostId() {
		return postId;
	}
	public void setPostId(String postId) {
		this.postId = postId;
	}
	public String getPostDes() {
		return postDes;
	}
	public void setPostDes(String postDes) {
		this.postDes = postDes;
	}

}
