package backing;

import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import entites.Fraction;
import entites.Hero;
import entites.Universe;
import entites.facades.FractionFacade;
import entites.facades.HeroFacade;
import entites.facades.UniverseFacade;

@Named
@ViewScoped
public class HeroBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@EJB
	private HeroFacade heroEJB;
	@EJB
	private FractionFacade fractionEJB;
	@EJB
	private UniverseFacade universeEJB;
	
	private List<Hero>heros;
	private List<Fraction>fractions;
	private List<Universe>universes;
	
	Hero newHero;
	
	public void setFractionEJB(FractionFacade fractionEJB) {
		this.fractionEJB = fractionEJB;
	}

	public void setNewHero(Hero newHero) {
		this.newHero = newHero;
	}

	public List<Hero> getHeroes() {
		return heroEJB.findAll();
	}
	
	public Hero getNewHero() { return newHero; }
	
	public void createNewHero() {
		newHero = new Hero();
		fractionEJB.create(null);;
	}
	
	public void saveNewHero(){
		heroEJB.create(newHero);
		heros.add(newHero);
	}
	
	public void removeHero(Hero h){
		heroEJB.remove(h);
		heros.remove(h);
	}
	
	public void editHero(Hero h) {
		heroEJB.edit(h);
	}
	
	public List<Hero> getHeros() {
		if (heros == null) {
			heros = heroEJB.findAll();
		}
		return heros;
	}

	public void setHeros(List<Hero> hero) {
		this.heros = hero;
	}

	public List<Fraction> getFractions() {
		if (fractions == null) {
			fractions = fractionEJB.findAll();
		}
		return fractions;
	}
	public void setFractions(List<Fraction> fraction) {
		this.fractions = fraction;
	}

	public List<Universe> getUniverses() {
		if (universes == null) {
			universes = universeEJB.findAll();
		}
		return universes;
	}

	public void setUniverses(List<Universe> universe) {
		this.universes = universe;
	}

	public FractionFacade getFractionEJB() {
		return fractionEJB;
	}

	public UniverseFacade getUniverseEJB() {
		return universeEJB;
	}

}