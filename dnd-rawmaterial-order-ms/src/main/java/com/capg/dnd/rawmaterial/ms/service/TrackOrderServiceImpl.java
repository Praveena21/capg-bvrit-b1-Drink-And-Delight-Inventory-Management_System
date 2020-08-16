package com.capg.dnd.rawmaterial.ms.service;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.dnd.rawmaterial.ms.model.RawMaterialOrder;
import com.capg.dnd.rawmaterial.ms.repo.ITrackOrderRepo;


@Service
public class TrackOrderServiceImpl implements ITrackOrderService {
	@Autowired
	ITrackOrderRepo repo;

	
	@Override
	public RawMaterialOrder insertRawMaterials(RawMaterialOrder bean) {
		return repo.insertRawMaterials(bean);
	}


	@Override
	public List<RawMaterialOrder> getAll() {
		// TODO Auto-generated method stub
		return repo.getAll();
	}

	
	@Override
	public RawMaterialOrder deleteRawMaterials(int id) {
		// TODO Auto-generated method stub
		return repo.deleteRawMaterials(id);
	}

}