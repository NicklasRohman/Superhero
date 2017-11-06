package entites;

import java.util.List;
import javax.persistence.*;

@Entity
public class Fraction {

	@Id
	@Column(name = "fractionid")
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
	
	@Override
	public boolean equals(Object other) {
	    return (other instanceof Fraction) && (fractionid != 0)
	        ? fractionid == (((Fraction) other).fractionid)
	        : (other == this);
	}

	@Override
	public int hashCode() {
	    return (fractionid != 0)
	        ? (this.getClass().hashCode() + fractionid)
	        : super.hashCode();
	}

}
