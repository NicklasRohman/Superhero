package entites;

import java.util.List;
import javax.persistence.*;

@Entity
public class Hero {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int heroid;

	@Column(name = "fullname", nullable = false)
	private String fullname;

	@Column(name = "race", nullable = false)
	private String race;

	@Column(name = "gender")
	private String gender;

	@ManyToMany
	@JoinTable(name = "hero_abilities", joinColumns = {
			@JoinColumn(name = "heroid", referencedColumnName = "heroid") }, inverseJoinColumns = {
					@JoinColumn(name = "abilitiesid", referencedColumnName = "abilitiesid") })

	private List<Abilities> abilities;

	@ManyToOne
	@JoinColumn(name = "fractionid", referencedColumnName = "fractionid", nullable = false)
	private Fraction fraction;

	@ManyToOne
	@JoinColumn(name = "universeid", referencedColumnName = "universeid", nullable = false)
	private Universe universe;

	public Universe getUniverse() {
		return universe;
	}

	public void setUniverse(Universe universe) {
		this.universe = universe;
	}

	public int getHeroid() {
		return heroid;
	}

	public void setHeroid(int heroid) {
		this.heroid = heroid;
	}

	public Fraction getFraction() {
		return fraction;
	}

	public void setFraction(Fraction fraction) {
		this.fraction = fraction;
	}

	public int getHeroId() {
		return heroid;
	}

	public void setHeroId(int heroid) {
		this.heroid = heroid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<Abilities> getAbilities() {
		return abilities;
	}

	public void setAbilities(List<Abilities> abilities) {
		this.abilities = abilities;
	}
	
}