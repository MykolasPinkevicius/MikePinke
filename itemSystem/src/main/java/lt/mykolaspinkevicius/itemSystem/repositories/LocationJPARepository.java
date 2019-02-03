package lt.mykolaspinkevicius.itemSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lt.mykolaspinkevicius.itemSystem.entities.Location;

@Repository
public interface LocationJPARepository extends JpaRepository<Location, Integer> {

}
