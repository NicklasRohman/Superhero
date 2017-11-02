package entites;

import java.util.List;
import javax.persistence.*;

@Entity
public class Universe {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int universeid;
	
	@Column(name="universenname")
	private String universenname;
	

	@OneToMany(mappedBy="universe")
	private List<Hero>hero;

	public List<Hero> getHero() {
		return hero;
	}

	public void setHero(List<Hero> hero) {
		this.hero = hero;
	}

	public int getUniversalid() {
		return universeid;
	}
	
	public void setUniversalid(int universalid) {
		this.universeid = universalid;
	}

	public String getUniversenname() {
		return universenname;
	}

	public void setUniversalname(String universenname) {
		this.universenname = universenname;
	}
}
