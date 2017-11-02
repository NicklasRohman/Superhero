package entites;

import java.util.List;
import javax.persistence.*;

@Entity
public class Fraction {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fractionid;

	@Column(name = "fractionname")
	private String fractionname;		
	
	@OneToMany(mappedBy="fraction")
	private List<Hero> hero;
	
	public List<Hero> getHero() {
		return hero;
	}
	
	public void setHero(List<Hero> hero) {
		this.hero = hero;
	}

	public int getFractionid() {
		return fractionid;
	}

	public void setFractionid(int fractionid) {
		this.fractionid = fractionid;
	}

	public String getFractionname() {
		return fractionname;
	}

	public void setFractionname(String fractionname) {
		this.fractionname = fractionname;
	}
}
