package com.twitter1;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Followers {
	
	private String me;
	private int followerId;
	private String followingMe;
	
	
	public String getMe() {
		return me;
	}
	
	@Id	
	@GeneratedValue
	public int getFollowerId() {
		return followerId;
	}
	public void setFollowerId(int followerId) {
		this.followerId = followerId;
	}
	public void setMe(String me) {
		this.me = me;
	}
	
	public String getFollowingMe() {
		return followingMe;
	}
	public void setFollowingMe(String followingMe) {
		this.followingMe = followingMe;
	}
	
	public Followers(String me, String followingMe)
	{
		 this.me=me;
		 this.followingMe=followingMe;
	}

	
}
