package entites.facades;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entites.Universe;

@Stateless
public class UniverseFacade extends AbstractFacades<Universe> {
	@PersistenceContext(unitName = "superheroes")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}

	public UniverseFacade() {
		super(Universe.class);
	}
}
