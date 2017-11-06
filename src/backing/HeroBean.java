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

	public HeroFacade getHeroEJB() {
		return heroEJB;
	}

	public void setHeroEJB(HeroFacade heroEJB) {
		this.heroEJB = heroEJB;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Hero> getHeros() {
		return heros;
	}

	public void setUniverseEJB(UniverseFacade universeEJB) {
		this.universeEJB = universeEJB;
	}

	private List<Hero> heros;
	private List<Fraction> fractions;
	private List<Universe> universes;

	Hero newHero;

	public void setFractionEJB(FractionFacade fractionEJB) {
		this.fractionEJB = fractionEJB;
	}

	public void setNewHero(Hero newHero) {
		this.newHero = newHero;
	}

	public List<Hero> getHeroes() {
		if (heros == null) {
			heros = heroEJB.findAll();
		}
		return heros;
	}

	public Hero getNewHero() {
		return newHero;
	}

	public void createNewHero() {
		newHero = new Hero();
	}

	public void saveNewHero() {
		System.out.println("trying to make heroEJB");
		heroEJB.create(newHero);
		heros.add(newHero);
	}

	public void removeHero(Hero h) {
		heroEJB.remove(h);
		heros.remove(h);
	}

	public void editHero(Hero h) {
		heroEJB.edit(h);
	}

	public void setHeros(List<Hero> hero) {
		this.heros = hero;
	}

	public List<Fraction> getFractions() {
		System.out.println("Geting Fractions are we?");
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