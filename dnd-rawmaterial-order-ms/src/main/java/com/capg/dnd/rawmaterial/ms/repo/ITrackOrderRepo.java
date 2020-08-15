package com.capg.dnd.rawmaterial.ms.repo;


import java.util.List;

import com.capg.dnd.rawmaterial.ms.model.RawMaterialOrder;

public interface ITrackOrderRepo {

	public RawMaterialOrder insertRawMaterials(RawMaterialOrder order);

	public List<RawMaterialOrder> getAll();

	public RawMaterialOrder deleteRawMaterials(int id);

}


