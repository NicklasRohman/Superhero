package entites.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entites.Hero;

@Stateless
public class HeroFacade extends AbstractFacades<Hero>{
	@PersistenceContext(unitName="superheroes")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public HeroFacade(){
		super(Hero.class);
	}
	
	@Override
	public void create(Hero entity) {
		super.create(entity);
	}

	@Override
	public void edit(Hero entity) {
		super.edit(entity);
	}

	@Override
	public void remove(Hero entity) {
		super.remove(entity);
	}

}
