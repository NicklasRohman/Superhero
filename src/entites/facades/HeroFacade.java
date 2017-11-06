package entites.facades;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import entites.Hero;



@Stateless
@DeclareRoles({"admin","hero"})
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
	@RolesAllowed({"admin"})
	public void create(Hero entity) {
		super.create(entity);
	}

	@Override
	@RolesAllowed({"admin"})
	public void edit(Hero entity) {
		super.edit(entity);
	}

	@Override
	@RolesAllowed({"admin"})
	public void remove(Hero entity) {
		super.remove(entity);
	}

}
