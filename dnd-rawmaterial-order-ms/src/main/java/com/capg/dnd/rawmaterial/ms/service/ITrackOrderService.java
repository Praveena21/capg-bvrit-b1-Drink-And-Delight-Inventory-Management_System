package com.capg.dnd.rawmaterial.ms.service;


import java.util.List;
import com.capg.dnd.rawmaterial.ms.model.RawMaterialOrder;

public interface ITrackOrderService {

	public RawMaterialOrder insertRawMaterials(RawMaterialOrder order);

	public List<RawMaterialOrder> getAll();

	public RawMaterialOrder deleteRawMaterials(int id);

}

