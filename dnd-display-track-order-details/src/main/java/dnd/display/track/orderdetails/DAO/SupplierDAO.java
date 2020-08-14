package dnd.display.track.orderdetails.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import dnd.display.track.orderdetails.model.SupplierEntity;

public interface SupplierDAO extends JpaRepository<SupplierEntity,Integer>{

}
