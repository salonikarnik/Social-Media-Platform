import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Tweets {
	
	private int tweetID;
	private String tweet;
	private Date timestamp;
	
	
	@Id
	@GeneratedValue
	public int getTweetID() {
		return tweetID;
	}
	public void setTweetID(int tweetID) {
		this.tweetID = tweetID;
	}
	
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
	
	@JoinColumn(name="ID",referencedColumnName="UserID")
	@OneToOne String user;
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}	
	Tweets(String tweet,Date date,String user)
	{
		  this.tweet=tweet;
		  this.timestamp=date;
		  this.user=user;
	}
	
	
	
}
