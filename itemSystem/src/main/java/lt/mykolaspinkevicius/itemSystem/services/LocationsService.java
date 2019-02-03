//package lt.mykolaspinkevicius.itemSystem.services;
//
//import javax.transaction.Transactional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import lt.mykolaspinkevicius.itemSystem.entities.Location;
//import lt.mykolaspinkevicius.itemSystem.repositories.LocationJPARepository;
//
//@Service
//@Transactional
//public class LocationsService {
//	@Autowired
//	private LocationJPARepository repository;
//	
//	public int createLocation(Location location) {
//		return repository.save(location).getId();
//	}
//
//}
