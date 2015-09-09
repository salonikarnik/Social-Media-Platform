import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Following {
	
	private String me;
	private int FollowingId;
	
	@Id
	@GeneratedValue
	public int getFollowingId() {
		return FollowingId;
	}
	public void setFollowingId(int followingId) {
		FollowingId = followingId;
	}
	
	public String getMe() {
		return me;
	}
	public void setMe(String me) {
		this.me = me;
	}
	
	private String followingThem;
	
	public String getFollowingThem() {
		return followingThem;
	}
	public void setFollowingThem(String followingThem) {
		this.followingThem = followingThem;
	}
	
	public Following(String me, String followingThem)
	{
		 this.me=me;
		 this.followingThem=followingThem;
	}

	
}
