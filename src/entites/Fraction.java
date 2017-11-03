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
		System.out.println("getHeroList");
		return hero;
	}
	
	public void setHero(List<Hero> hero) {
		System.out.println("SetHeroList");
		this.hero = hero;
	}

	public int getFractionid() {
	System.out.println("getFractionID");
		return fractionid;
	}

	public void setFractionid(int fractionid) {
		System.out.println("setFractionID");
		this.fractionid = fractionid;
	}

	public String getFractionname() {
		System.out.println("getFractionNAME");
		return fractionname;
	}

	public void setFractionname(String fractionname) {
		System.out.println("SetFractionNAME");
		this.fractionname = fractionname;
	}
}
