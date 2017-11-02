package entites;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

@Entity
public class Abilities implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int abilitiesid;
	
	@Column(name="name")
	private String abilitiesname;
	
	@ManyToMany(mappedBy="abilities")
	private List<Hero> abilieies;

	public int getAbilitiesid() {
		return abilitiesid;
	}

	public void setAbilitiesid(int abilitiesid) {
		this.abilitiesid = abilitiesid;
	}

	public String getAbilitiesname() {
		return abilitiesname;
	}

	public void setAbilitiesname(String abilitiesname) {
		this.abilitiesname = abilitiesname;
	}

	public List<Hero> getAbilieies() {
		return abilieies;
	}

	public void setAbilieies(List<Hero> abilieies) {
		this.abilieies = abilieies;
	}
	
}
