package entites.facades;


import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entites.Fraction;

@Stateless
public class FractionFacade extends AbstractFacades<Fraction> {
	@PersistenceContext(unitName = "superheroes")
	private EntityManager em;

	@Override
	protected EntityManager getEntityManager() {
		return em;
	}
	
	public FractionFacade() {
		super(Fraction.class);
	}
}
