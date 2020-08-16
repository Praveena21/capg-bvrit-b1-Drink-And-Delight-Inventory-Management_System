


package com.capg.dnd.rawmaterial.ms.repo;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.capg.dnd.rawmaterial.ms.model.RawMaterialOrder;

@Repository
@Transactional
public class TrackOrderRepoImpl implements ITrackOrderRepo{
	@PersistenceContext
	EntityManager em;

	
	@Override
	public RawMaterialOrder insertRawMaterials(RawMaterialOrder order) {
		em.persist(order);
		return order;
	}

	

	@Override
	public List<RawMaterialOrder> getAll() {
		TypedQuery<RawMaterialOrder> query = em.createQuery("from RawMaterialBean", RawMaterialOrder.class);
		return query.getResultList();
	}

	
	@Override
	public RawMaterialOrder deleteRawMaterials(int id) {
		RawMaterialOrder order = em.find(RawMaterialOrder.class, id);
		em.remove(order);
		return order;
	}

}
