package lt.mykolaspinkevicius.itemSystem.repositories;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import lt.mykolaspinkevicius.itemSystem.entities.Item;

@Repository
public interface ItemJPARepository extends JpaRepository<Item,Integer>{
	
	@Query("SELECT b FROM Item b WHERE b.title LIKE %?1%")
	List<Item> findItemByTitle(String title);
	
	@Query("SELECT c FROM Item c WHERE c.stock LIKE :stock")
	List<Item>findItemByStock(Integer stock); 
	
	@Query("SELECT d FROM Item d WHERE d.description LIKE %?1%")
	List<Item> findItemByDescription(String description); 
	
	@Query("SELECT e FROM Item e WHERE e.location.city LIKE %?1% OR e.location.street LIKE %?1%")
	Set<Item> findItemByLocation(String location);
	
	@Query("SELECT f FROM Item f WHERE f.price BETWEEN :startsFrom AND :endsTo")
	List<Item> findItemsByPriceRange(BigDecimal startsFrom, BigDecimal endsTo); 
}
