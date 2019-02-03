package lt.mykolaspinkevicius.itemSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lt.mykolaspinkevicius.itemSystem.entities.Item;

@Repository
public interface ItemJPARepository extends JpaRepository<Item,Integer>{

}
